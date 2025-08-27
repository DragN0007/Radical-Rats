package com.dragn0007.radrats.entities.rat;

import com.dragn0007.dragnlivestock.entities.rabbit.ORabbitModel;
import com.dragn0007.dragnlivestock.entities.sheep.OSheepMarkingLayer;
import com.dragn0007.dragnlivestock.entities.sheep.OSheepModel;
import com.dragn0007.dragnlivestock.items.LOItems;
import com.dragn0007.dragnlivestock.util.LOTags;
import com.dragn0007.dragnlivestock.util.LivestockOverhaulCommonConfig;
import com.dragn0007.radrats.entities.ai.RatFollowOwnerGoal;
import com.dragn0007.radrats.entities.util.EntityTypes;
import com.dragn0007.radrats.util.RRTags;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.Animation;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

import javax.annotation.Nullable;
import java.util.Random;

public class Rat extends TamableAnimal implements GeoEntity {

	public Rat(EntityType<? extends Rat> type, Level level) {
		super(type, level);
		this.setTame(false);
	}

	@Override
	public Vec3 getLeashOffset() {
		return new Vec3(0D, (double)this.getEyeHeight() * 0.6F, (double)(this.getBbWidth() * 0.6F));
		//              ^ Side offset                      ^ Height offset                   ^ Length offset
	}

	public static AttributeSupplier.Builder createAttributes() {
		return Mob.createMobAttributes()
				.add(Attributes.MAX_HEALTH, 4.0D)
				.add(Attributes.MOVEMENT_SPEED, 0.18F)
				.add(Attributes.ATTACK_DAMAGE, 0.5D);
	}

	public static final Ingredient FOOD_ITEMS = Ingredient.of(RRTags.Items.RAT_FOOD);

	public boolean isFood(ItemStack itemStack) {
		return FOOD_ITEMS.test(itemStack);
	}

	public void registerGoals() {
		this.goalSelector.addGoal(0, new FloatGoal(this));
		this.goalSelector.addGoal(1, new PanicGoal(this, 2.0D));
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 2.0, true));
		this.goalSelector.addGoal(1, new SitWhenOrderedToGoal(this));
		this.goalSelector.addGoal(5, new BreedGoal(this, 1.0D));
		this.goalSelector.addGoal(8, new WaterAvoidingRandomStrollGoal(this, 1.0D));
		this.goalSelector.addGoal(10, new LookAtPlayerGoal(this, Player.class, 2.0F));

		this.goalSelector.addGoal(6, new RatFollowOwnerGoal(this, 1.0D, 10.0F, 2.0F, false));

		this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, LivingEntity.class, 15.0F, 1.8F, 1.8F, livingEntity ->
				livingEntity.getType().is(LOTags.Entity_Types.WOLVES) && (livingEntity instanceof TamableAnimal && !((TamableAnimal) livingEntity).isTame()) && !this.isTame()
		));

		this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, LivingEntity.class, 15.0F, 1.8F, 1.8F, livingEntity ->
				livingEntity.getType().is(LOTags.Entity_Types.CATS) && (livingEntity instanceof TamableAnimal && !((TamableAnimal) livingEntity).isTame()) && !this.isTame()
		));

		this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, LivingEntity.class, 15.0F, 1.8F, 1.8F, livingEntity ->
				livingEntity.getType().is(LOTags.Entity_Types.DOGS) && (livingEntity instanceof TamableAnimal && !((TamableAnimal) livingEntity).isTame()) && !this.isTame()
		));

		this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, LivingEntity.class, 15.0F, 1.8F, 1.8F, livingEntity ->
				livingEntity.getType().is(LOTags.Entity_Types.FOXES) && (livingEntity instanceof TamableAnimal && !((TamableAnimal) livingEntity).isTame()) && !this.isTame()
		));
	}

	@Override
	public float getStepHeight() {
		return 1.0F;
	}

	private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

	private <T extends GeoAnimatable> PlayState predicate(software.bernie.geckolib.core.animation.AnimationState<T> tAnimationState) {
		double currentSpeed = this.getDeltaMovement().lengthSqr();
		double speedThreshold = 0.01;

		AnimationController<T> controller = tAnimationState.getController();

		if (tAnimationState.isMoving()) {
			if (currentSpeed > speedThreshold) {
				controller.setAnimation(RawAnimation.begin().then("walk", Animation.LoopType.LOOP));
				controller.setAnimationSpeed(2.4);
			} else {
				controller.setAnimation(RawAnimation.begin().then("walk", Animation.LoopType.LOOP));
				controller.setAnimationSpeed(1.6);
			}
		} else if (this.isInSittingPose()) {
			controller.setAnimation(RawAnimation.begin().then("sit", Animation.LoopType.LOOP));
			controller.setAnimationSpeed(0.8);
		} else {
			controller.setAnimation(RawAnimation.begin().then("idle", Animation.LoopType.LOOP));
			controller.setAnimationSpeed(0.8);
		}

		return PlayState.CONTINUE;
	}

	@Override
	public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
		controllers.add(new AnimationController<>(this, "controller", 2, this::predicate));
	}

	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() {
		return this.geoCache;
	}

	public boolean hurt(DamageSource damageSource, float amount) {
		if (damageSource.getEntity() instanceof Player player) {

			if(!this.level().isClientSide && this.isTame() && !this.isOrderedToSit() && !this.isInSittingPose() && !this.wasToldToWander())
			{
				if (this.isOwnedBy(player) && player.isShiftKeyDown()) {
					this.setToldToWander(true);
					player.displayClientMessage(Component.translatable("tooltip.radrats.wandering.tooltip").withStyle(ChatFormatting.GOLD), true);
				}
				return false;
			}

			if (!this.level().isClientSide && this.isTame() && !this.isOrderedToSit() && !this.isInSittingPose() && this.wasToldToWander()) {
				if (this.isOwnedBy(player) && player.isShiftKeyDown()) {
					this.setToldToWander(false);
					player.displayClientMessage(Component.translatable("tooltip.radrats.following.tooltip").withStyle(ChatFormatting.GOLD), true);
				}
				return false;
			}
		}
		return super.hurt(damageSource, amount);
	}

	public InteractionResult mobInteract(Player player, InteractionHand hand) {
		ItemStack itemstack = player.getItemInHand(hand);
		Item item = itemstack.getItem();

		if (itemstack.is(LOItems.GENDER_TEST_STRIP.get()) && this.isFemale()) {
			player.playSound(SoundEvents.BEEHIVE_EXIT, 1.0F, 1.0F);
			ItemStack itemstack1 = ItemUtils.createFilledResult(itemstack, player, LOItems.FEMALE_GENDER_TEST_STRIP.get().getDefaultInstance());
			player.setItemInHand(hand, itemstack1);
			return InteractionResult.SUCCESS;
		}

		if (itemstack.is(LOItems.GENDER_TEST_STRIP.get()) && this.isMale()) {
			player.playSound(SoundEvents.BEEHIVE_EXIT, 1.0F, 1.0F);
			ItemStack itemstack1 = ItemUtils.createFilledResult(itemstack, player, LOItems.MALE_GENDER_TEST_STRIP.get().getDefaultInstance());
			player.setItemInHand(hand, itemstack1);
			return InteractionResult.SUCCESS;
		}

		if (this.isTame()) {
			if (this.isFood(itemstack)) {
				this.level().addParticle(ParticleTypes.HEART, this.getRandomX(0.6D), this.getRandomY(), this.getRandomZ(0.6D), 0.7D, 0.7D, 0.7D);

				if (this.getHealth() < this.getMaxHealth()) {
					this.heal((float) 2.0);
				}

				int i = this.getAge();
				if (!this.level().isClientSide && i == 0 && this.canFallInLove()) {
					this.usePlayerItem(player, hand, itemstack);
					this.setInLove(player);
					return InteractionResult.SUCCESS;
				}

				if (!player.getAbilities().instabuild) {
					itemstack.shrink(1);
				}

				this.gameEvent(GameEvent.ENTITY_INTERACT);
				return InteractionResult.sidedSuccess(this.level().isClientSide);
			}
		}

		if (this.level().isClientSide) {
			boolean flag = this.isOwnedBy(player) || this.isTame() || this.isFood(itemstack) && !this.isTame();
			return flag ? InteractionResult.CONSUME : InteractionResult.PASS;
		} else {
			if (this.isTame()) {
				if (this.isFood(itemstack)) {

					if (this.getHealth() < this.getMaxHealth()) {
						this.heal(2F);
					}

					if (!player.getAbilities().instabuild) {
						itemstack.shrink(1);
					}

					int i = this.getAge();
					if (!this.level().isClientSide && i == 0 && this.canFallInLove()) {
						this.usePlayerItem(player, hand, itemstack);
						this.setInLove(player);
						return InteractionResult.SUCCESS;
					}

					return InteractionResult.SUCCESS;
				}

				if (!this.isFood(itemstack)) {
					InteractionResult interactionresult = super.mobInteract(player, hand);
					if ((!interactionresult.consumesAction() || this.isBaby()) && this.isOwnedBy(player)) {
						this.setOrderedToSit(!this.isOrderedToSit());
						this.jumping = false;
						this.navigation.stop();
						this.setTarget((LivingEntity)null);
						return InteractionResult.SUCCESS;
					}

					return interactionresult;
				}

			} else if (this.isFood(itemstack)) {
				if (!player.getAbilities().instabuild) {
					itemstack.shrink(1);
				}

				if (this.random.nextInt(3) == 0 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, player)) {
					this.tame(player);
					this.navigation.stop();
					this.setTarget((LivingEntity)null);
					this.setOrderedToSit(true);
					this.level().broadcastEntityEvent(this, (byte)7);
				} else {
					this.level().broadcastEntityEvent(this, (byte)6);
				}

				return InteractionResult.SUCCESS;
			}

			return super.mobInteract(player, hand);
		}
	}

	public boolean toldToWander = false;
	public boolean wasToldToWander() {
		return this.toldToWander;
	}
	public boolean getToldToWander() {
		return this.toldToWander;
	}
	public void setToldToWander(boolean toldToWander) {
		this.toldToWander = toldToWander;
	}

	public SoundEvent getAmbientSound() {
		super.getAmbientSound();
		return SoundEvents.RABBIT_AMBIENT;
	}

	public SoundEvent getDeathSound() {
		super.getDeathSound();
		return SoundEvents.RABBIT_DEATH;
	}

	public SoundEvent getHurtSound(DamageSource p_30720_) {
		super.getHurtSound(p_30720_);
		return SoundEvents.RABBIT_HURT;
	}

	public void playStepSound(BlockPos p_28254_, BlockState p_28255_) {
		this.playSound(SoundEvents.CHICKEN_STEP, 0.15F, 1.0F);
	}

	// Generates the base texture
	public static final EntityDataAccessor<Integer> VARIANT = SynchedEntityData.defineId(Rat.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> OVERLAY = SynchedEntityData.defineId(Rat.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> BREED = SynchedEntityData.defineId(Rat.class, EntityDataSerializers.INT);

	public ResourceLocation getTextureResource() {
		return RatModel.Variant.variantFromOrdinal(getVariant()).resourceLocation;
	}
	public ResourceLocation getOverlayLocation() {
		return RatMarkingLayer.Overlay.patternFromOrdinal(getOverlayVariant()).resourceLocation;
	}

	public int getVariant() {
		return this.entityData.get(VARIANT);
	}
	public int getOverlayVariant() {
		return this.entityData.get(OVERLAY);
	}
	public int getBreed() {
		return this.entityData.get(BREED);
	}

	public void setVariant(int variant) {
		this.entityData.set(VARIANT, variant);
	}
	public void setOverlayVariant(int overlayVariant) {
		this.entityData.set(OVERLAY, overlayVariant);
	}

	public void setBreed(int breed) {
		this.entityData.set(BREED, breed);
	}

	@Override
	public void readAdditionalSaveData(CompoundTag tag) {
		super.readAdditionalSaveData(tag);

		if (tag.contains("Variant")) {
			setVariant(tag.getInt("Variant"));
		}

		if (tag.contains("Overlay")) {
			setOverlayVariant(tag.getInt("Overlay"));
		}

		if (tag.contains("Gender")) {
			this.setGender(tag.getInt("Gender"));
		}

		if (tag.contains("Breed")) {
			this.setBreed(tag.getInt("Breed"));
		}

		if (tag.contains("Wandering")) {
			this.setToldToWander(tag.getBoolean("Wandering"));
		}
	}

	@Override
	public void addAdditionalSaveData(CompoundTag tag) {
		super.addAdditionalSaveData(tag);
		tag.putInt("Variant", getVariant());
		tag.putInt("Overlay", getOverlayVariant());
		tag.putInt("Gender", this.getGender());
		tag.putInt("Breed", this.getBreed());
		tag.putBoolean("Wandering", this.getToldToWander());
	}

	@Override
	@Nullable
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor serverLevelAccessor, DifficultyInstance instance, MobSpawnType spawnType, @Nullable SpawnGroupData data, @Nullable CompoundTag tag) {
		if (data == null) {
			data = new AgeableMobGroupData(0.2F);
		}
		Random random = new Random();
		setGender(random.nextInt(Gender.values().length));
		setBreed(random.nextInt(Breed.values().length));

		if (LivestockOverhaulCommonConfig.SPAWN_BY_BREED.get()) {
			this.setColor();
			this.setMarking();
		} else {
			this.setVariant(random.nextInt(RatModel.Variant.values().length));
			this.setOverlayVariant(random.nextInt(RatMarkingLayer.Overlay.values().length));
		}

		return super.finalizeSpawn(serverLevelAccessor, instance, spawnType, data, tag);
	}

	public void setColor() {
		if (random.nextDouble() <= 0.05) { //5% chance
			int[] variants = {4, 5, 8}; //cream, lilac, silver
			int randomIndex = new Random().nextInt(variants.length);
			this.setVariant(variants[randomIndex]);
		} else if (random.nextDouble() > 0.05 && random.nextDouble() < 0.20) { //15% chance
			int[] variants = {1, 7, 9, 10}; //blue, red, tan, white
			int randomIndex = new Random().nextInt(variants.length);
			this.setVariant(variants[randomIndex]);
		} else if (random.nextDouble() > 0.20) { //80% chance
			int[] variants = {0, 2, 3, 6}; //black, brown, chocolate, mahogany
			int randomIndex = new Random().nextInt(variants.length);
			this.setVariant(variants[randomIndex]);
		}
	}

	public void setMarking() {
		if (random.nextDouble() <= 0.03) { //3% chance
			this.setOverlayVariant(random.nextInt(RatMarkingLayer.Overlay.values().length)); //random pattern
		} else if (random.nextDouble() > 0.03) { //97% chance
			this.setOverlayVariant(0); //no pattern
		}
	}

	@Override
	public void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(VARIANT, 0);
		this.entityData.define(OVERLAY, 0);
		this.entityData.define(GENDER, 0);
		this.entityData.define(BREED, 0);
	}

	public enum Gender {
		FEMALE,
		MALE
	}
	public boolean isFemale() {
		return this.getGender() == 0;
	}
	public boolean isMale() {
		return this.getGender() == 1;
	}
	public static final EntityDataAccessor<Integer> GENDER = SynchedEntityData.defineId(Rat.class, EntityDataSerializers.INT);
	public int getGender() {
		return this.entityData.get(GENDER);
	}
	public void setGender(int gender) {
		this.entityData.set(GENDER, gender);
	}

	public boolean canParent() {
		return !this.isBaby() && this.isInLove();
	}

	public boolean canMate(Animal animal) {
		if (animal == this) {
			return false;
		} else if (!(animal instanceof Rat)) {
			return false;
		} else {
			if (!LivestockOverhaulCommonConfig.GENDERS_AFFECT_BREEDING.get()) {
				return this.canParent() && ((Rat) animal).canParent();
			} else {
				Rat partner = (Rat) animal;
				if (this.canParent() && partner.canParent() && this.getGender() != partner.getGender()) {
					return isFemale();
				}
			}
		}
		return false;
	}
	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
		Rat baby = (Rat) ageableMob;
		if (ageableMob instanceof Rat) {
			Rat partner = (Rat) ageableMob;
			baby = EntityTypes.RAT_ENTITY.get().create(serverLevel);

			int i = this.random.nextInt(9);
			int variant;
			if (i < 4) {
				variant = this.getVariant();
			} else if (i < 8) {
				variant = partner.getVariant();
			} else {
				variant = this.random.nextInt(RatModel.Variant.values().length);
			}

			int j = this.random.nextInt(5);
			int overlay;
			if (j < 2) {
				overlay = this.getOverlayVariant();
			} else if (j < 4) {
				overlay = partner.getOverlayVariant();
			} else {
				overlay = this.random.nextInt(RatMarkingLayer.Overlay.values().length);
			}

			int k = this.random.nextInt(5);
			int breed;
			if (k < 2) {
				breed = this.getBreed();
			} else if (k < 4) {
				breed = partner.getBreed();
			} else {
				breed = this.random.nextInt(Breed.values().length);
			}

			int gender;
			gender = this.random.nextInt(Gender.values().length);

			baby.setVariant(variant);
			baby.setOverlayVariant(overlay);
			baby.setGender(gender);
			baby.setBreed(breed);
		}

		return baby;
	}

	public enum Breed {
		DEFAULT,
		DUMBO;

		public static Breed breedFromOrdinal(int ordinal) {
			return Breed.values()[ordinal % Breed.values().length];
		}
	}

}

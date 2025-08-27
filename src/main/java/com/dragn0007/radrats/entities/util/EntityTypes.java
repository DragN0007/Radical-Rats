package com.dragn0007.radrats.entities.util;

import com.dragn0007.dragnlivestock.LivestockOverhaul;
import com.dragn0007.radrats.entities.rat.Rat;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.dragn0007.radrats.RadicalRats.MODID;

public class EntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MODID);

    public static final RegistryObject<EntityType<Rat>> RAT_ENTITY = ENTITY_TYPES.register("rat",
            () -> EntityType.Builder.of(Rat::new,
                            MobCategory.CREATURE)
                    .sized(0.4f,0.4f)
                    .build(new ResourceLocation(LivestockOverhaul.MODID,"rat").toString()));

}
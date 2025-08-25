package com.dragn0007.radrats;

import com.dragn0007.radrats.blocks.RRBlocks;
import com.dragn0007.radrats.entities.util.EntityTypes;
import com.dragn0007.radrats.items.RRItemGroup;
import com.dragn0007.radrats.items.RRItems;
import com.dragn0007.radrats.util.RatsCommonConfig;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib.GeckoLib;

@Mod(RadicalRats.MODID)
public class RadicalRats
{
    public static final String MODID = "fferrets";

    public RadicalRats()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        RRItems.register(eventBus);
        RRBlocks.register(eventBus);
        RRItemGroup.register(eventBus);
        EntityTypes.ENTITY_TYPES.register(eventBus);

        GeckoLib.initialize();
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, RatsCommonConfig.SPEC, "rats-common.toml");

        MinecraftForge.EVENT_BUS.register(this);
    }

    public static final EntityDataSerializer<ResourceLocation> RESOURCE_LOCATION = new EntityDataSerializer<>() {
        @Override
        public void write(FriendlyByteBuf buf, ResourceLocation resourceLocation) {
            buf.writeResourceLocation(resourceLocation);
        }

        @Override
        public ResourceLocation read(FriendlyByteBuf buf) {
            return buf.readResourceLocation();
        }

        @Override
        public ResourceLocation copy(ResourceLocation resourceLocation) {
            return resourceLocation;
        }
    };

    static {
        EntityDataSerializers.registerSerializer(RESOURCE_LOCATION);
    }
}
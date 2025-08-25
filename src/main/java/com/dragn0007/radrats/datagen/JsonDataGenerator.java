package com.dragn0007.radrats.datagen;

import com.dragn0007.radrats.RadicalRats;
import com.dragn0007.radrats.datagen.biglooter.RRLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = RadicalRats.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class JsonDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new RRRecipeMaker(packOutput));
        generator.addProvider(event.includeClient(), new RRItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeServer(), RRLootTableProvider.create(packOutput));
        generator.addProvider(event.includeServer(), new RRWorldGenerator(packOutput, lookupProvider));
    }
}
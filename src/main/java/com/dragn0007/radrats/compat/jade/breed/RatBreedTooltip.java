package com.dragn0007.radrats.compat.jade.breed;

import com.dragn0007.dragnlivestock.LivestockOverhaul;
import com.dragn0007.radrats.entities.rat.Rat;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import snownee.jade.api.EntityAccessor;
import snownee.jade.api.IEntityComponentProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;

public class RatBreedTooltip implements IEntityComponentProvider {

    public RatBreedTooltip() {
    }

    @Override
    public void appendTooltip(ITooltip tooltip, EntityAccessor entityAccessor, IPluginConfig iPluginConfig) {
        if (entityAccessor.getEntity() instanceof Rat animal) {
            String breeds = getBreeds(animal.getBreed());
            tooltip.add(Component.translatable(breeds));
        }
    }

    private String getBreeds(int breed) {
        switch (breed) {
            case 0: return "Common";
            case 1: return "Dumbo";
            default: return "Unknown";
        }
    }

    @Override
    public ResourceLocation getUid() {
        return new ResourceLocation(LivestockOverhaul.MODID, "o_tooltips");
    }
}

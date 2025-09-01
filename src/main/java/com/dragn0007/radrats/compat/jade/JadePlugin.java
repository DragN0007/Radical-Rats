package com.dragn0007.radrats.compat.jade;

import com.dragn0007.radrats.compat.jade.breed.RatBreedTooltip;
import com.dragn0007.radrats.compat.jade.gender.RatGenderTooltip;
import com.dragn0007.radrats.entities.rat.Rat;
import snownee.jade.api.IWailaClientRegistration;
import snownee.jade.api.IWailaPlugin;
import snownee.jade.api.WailaPlugin;

@WailaPlugin
public class JadePlugin implements IWailaPlugin {

    @Override
    public void registerClient(IWailaClientRegistration registration) {
        registration.registerEntityComponent(new RatGenderTooltip(), Rat.class);
        registration.registerEntityComponent(new RatBreedTooltip(), Rat.class);
    }
}

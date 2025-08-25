package com.dragn0007.radrats.util;

import net.minecraftforge.common.ForgeConfigSpec;

public class RatsCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("Configs for Radical Rats!");

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}

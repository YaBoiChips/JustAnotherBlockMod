package com.genderdex.jabm;

import com.genderdex.jabm.platform.Services;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;

import static com.genderdex.jabm.Constants.MOD_ID;

public class CommonClass {

    public static void init() {

        Constants.LOG.info("Hello from Common init on {}! we are currently in a {} environment!", Services.PLATFORM.getPlatformName(), Services.PLATFORM.isDevelopmentEnvironment() ? "development" : "production");
        Constants.LOG.info("Diamond Item >> {}", Registry.ITEM.getKey(Items.DIAMOND));
    }


    public static ResourceLocation createLocation(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
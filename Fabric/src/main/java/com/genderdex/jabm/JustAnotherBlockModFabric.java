package com.genderdex.jabm;

import com.genderdex.jabm.core.JabmBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.core.Registry;

import static com.genderdex.jabm.CommonClass.createLocation;

public class JustAnotherBlockModFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {

        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();
        JabmBlocks.register((block, name) -> Registry.register(Registry.BLOCK, createLocation(name), block));
    }
}

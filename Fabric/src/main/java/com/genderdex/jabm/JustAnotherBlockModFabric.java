package com.genderdex.jabm;

import com.genderdex.jabm.core.JabmBlocks;
import com.genderdex.jabm.core.JabmItems;
import com.genderdex.jabm.core.JabmTab;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.core.Registry;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

import static com.genderdex.jabm.CommonClass.createLocation;
import static com.genderdex.jabm.Constants.MOD_ID;

public class JustAnotherBlockModFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();
        JabmBlocks.register((block, name) -> Registry.register(Registry.BLOCK, createLocation(name), block));
        JabmItems.register((item, name) -> Registry.register(Registry.ITEM, createLocation(name), item));
        JabmTab.init(FabricItemGroupBuilder.build(createLocation(MOD_ID), () -> new ItemStack(JabmItems.SPRUCE_PANEL)));
    }
}

package com.genderdex.jabm;

import com.genderdex.jabm.core.JabmBlocks;
import com.genderdex.jabm.core.JabmItems;
import com.genderdex.jabm.core.JabmTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

import static com.genderdex.jabm.CommonClass.createLocation;

@Mod(Constants.MOD_ID)
public class JustAnotherBlockModForge {
    
    public JustAnotherBlockModForge() {
        Constants.LOG.info("Hello Forge world!");
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        JabmTab.init(new CreativeModeTab("JABM") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(JabmItems.SPRUCE_PANEL);
            }
        });
        bootStrap(eventBus);
        CommonClass.init();
    }

    private void bootStrap(IEventBus eventBus) {
        eventBus.addListener(this::registerStuff);
    }

    public void registerStuff(RegisterEvent event){
        JabmBlocks.register((block, name) -> event.register(ForgeRegistries.Keys.BLOCKS, helper -> helper.register(createLocation(name), block)));
        JabmItems.register((item, name) -> event.register(ForgeRegistries.Keys.ITEMS, helper -> helper.register(createLocation(name), item)));
    }
}
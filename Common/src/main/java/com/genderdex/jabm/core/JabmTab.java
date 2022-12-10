package com.genderdex.jabm.core;

import net.minecraft.world.item.CreativeModeTab;

public class JabmTab {
    public static CreativeModeTab TAB = null;

    public static void init(CreativeModeTab creativeModeTab) {
        TAB = creativeModeTab;
    }
}

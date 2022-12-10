package com.genderdex.jabm.core;

import com.genderdex.jabm.reg.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static com.genderdex.jabm.core.JabmTab.TAB;

public class JabmItems {


    public static Item PAPER_WALL = createBlockItem(JabmBlocks.PAPER_WALL);
    public static Item ACACIA_PANEL = createBlockItem(JabmBlocks.ACACIA_PANEL);
    public static Item OAK_PANEL = createBlockItem(JabmBlocks.OAK_PANEL);
    public static Item DARK_OAK_PANEL = createBlockItem(JabmBlocks.DARK_OAK_PANEL);
    public static Item SPRUCE_PANEL = createBlockItem(JabmBlocks.SPRUCE_PANEL);
    public static Item BIRCH_PANEL = createBlockItem(JabmBlocks.BIRCH_PANEL);
    public static Item MANGROVE_PANEL = createBlockItem(JabmBlocks.MANGROVE_PANEL);
    public static Item JUNGLE_PANEL = createBlockItem(JabmBlocks.JUNGLE_PANEL);
    public static Item WARPED_PANEL = createBlockItem(JabmBlocks.WARPED_PANEL);
    public static Item CRIMSON_PANEL = createBlockItem(JabmBlocks.CRIMSON_PANEL);
    public static Item ELDER_PLANKS = createBlockItem(JabmBlocks.ELDER_PLANKS);
    public static Item GRAND_YEW_PLANKS = createBlockItem(JabmBlocks.GRAND_YEW_PLANKS);
    public static Item SILVER_BIRCH_PLANKS = createBlockItem(JabmBlocks.SILVER_BIRCH_PLANKS);
    public static Item CALCITE_PANEL = createBlockItem(JabmBlocks.CALCITE_PANEL);
    public static Item PRISMARINE_PANEL = createBlockItem(JabmBlocks.PRISMARINE_PANEL);
    public static Item PURPUR_PANEL = createBlockItem(JabmBlocks.PURPUR_PANEL);
    public static Item STONE_PANEL = createBlockItem(JabmBlocks.STONE_PANEL);
    public static Item DEEPSLATE_PANEL = createBlockItem(JabmBlocks.DEEPSLATE_PANEL);
    public static Item createBlockItem(Block block) {
        return new BlockItem(block, new Item.Properties().tab(TAB));
    }

    public static void register(Registry<Item> item) {
        item.register(PAPER_WALL, "paper_wall");
        item.register(ACACIA_PANEL, "acacia_panel");
        item.register(OAK_PANEL, "oak_panel");
        item.register(DARK_OAK_PANEL, "dark_oak_panel");
        item.register(SPRUCE_PANEL, "spruce_panel");
        item.register(JUNGLE_PANEL, "jungle_panel");
        item.register(BIRCH_PANEL, "birch_panel");
        item.register(MANGROVE_PANEL, "mangrove_panel");
        item.register(WARPED_PANEL, "warped_panel");
        item.register(CRIMSON_PANEL, "crimson_panel");
        item.register(ELDER_PLANKS, "elder_planks");
        item.register(GRAND_YEW_PLANKS, "grand_yew_planks");
        item.register(SILVER_BIRCH_PLANKS, "silver_birch_planks");
        item.register(CALCITE_PANEL, "calcite_panel");
        item.register(PRISMARINE_PANEL, "prismarine_panel");
        item.register(PURPUR_PANEL, "purpur_panel");
        item.register(STONE_PANEL, "stone_panel");
        item.register(DEEPSLATE_PANEL, "deepslate_panel");
    }
}

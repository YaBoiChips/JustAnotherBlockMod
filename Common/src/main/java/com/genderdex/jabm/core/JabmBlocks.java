package com.genderdex.jabm.core;

import com.genderdex.jabm.reg.Registry;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class JabmBlocks {

    public static Block PAPER_WALL = new Block(BlockBehaviour.Properties.of(Material.BAMBOO).sound(SoundType.BAMBOO).noOcclusion().strength(0.5f));
    public static Block ACACIA_PANEL = createPlankType();
    public static Block OAK_PANEL = createPlankType();
    public static Block DARK_OAK_PANEL = createPlankType();
    public static Block SPRUCE_PANEL = createPlankType();
    public static Block BIRCH_PANEL = createPlankType();
    public static Block JUNGLE_PANEL = createPlankType();
    public static Block MANGROVE_PANEL = createPlankType();
    public static Block WARPED_PANEL = createNetherPlankType();
    public static Block CRIMSON_PANEL = createNetherPlankType();
    public static Block GRAND_YEW_PLANKS = createPlankType();
    public static Block SILVER_BIRCH_PLANKS = createPlankType();
    public static Block ELDER_PLANKS = createPlankType();
    public static Block CALCITE_PANEL = new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE));
    public static Block PRISMARINE_PANEL = new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE));
    public static Block PURPUR_PANEL = new Block(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK));
    public static Block STONE_PANEL = createStoneType();
    public static Block DEEPSLATE_PANEL = createDeepslateType();

    public static Block createPlankType(){
        return new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    }

    public static Block createNetherPlankType(){
        return new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS));
    }
    public static Block createStoneType(){
        return new Block(BlockBehaviour.Properties.copy(Blocks.STONE));
    }
    public static Block createDeepslateType(){
        return new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS));
    }
    public static void register(Registry<Block> block) {
        block.register(PAPER_WALL, "paper_wall");
        block.register(ACACIA_PANEL, "acacia_panel");
        block.register(OAK_PANEL, "oak_panel");
        block.register(DARK_OAK_PANEL, "dark_oak_panel");
        block.register(SPRUCE_PANEL, "spruce_panel");
        block.register(BIRCH_PANEL, "birch_panel");
        block.register(JUNGLE_PANEL, "jungle_panel");
        block.register(MANGROVE_PANEL, "mangrove_panel");
        block.register(WARPED_PANEL, "warped_panel");
        block.register(CRIMSON_PANEL, "crimson_panel");
        block.register(GRAND_YEW_PLANKS, "grand_yew_planks");
        block.register(SILVER_BIRCH_PLANKS, "silver_birch_planks");
        block.register(ELDER_PLANKS, "elder_planks");
        block.register(CALCITE_PANEL, "calcite_panel");
        block.register(PRISMARINE_PANEL, "prismarine_panel");
        block.register(PURPUR_PANEL, "purpur_panel");
        block.register(STONE_PANEL, "stone_panel");
        block.register(DEEPSLATE_PANEL, "deepslate_panel");
    }
}
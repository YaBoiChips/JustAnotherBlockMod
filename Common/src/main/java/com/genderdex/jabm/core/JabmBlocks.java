package com.genderdex.jabm.core;

import com.genderdex.jabm.reg.Registry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class JabmBlocks {

    public static Block PAPER_WALL = new Block(BlockBehaviour.Properties.of(Material.BAMBOO).noOcclusion().strength(1));

    public static void register(Registry<Block> block) {
        block.register(PAPER_WALL, "paper_wall");
    }

}

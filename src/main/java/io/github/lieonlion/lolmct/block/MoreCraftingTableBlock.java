package io.github.lieonlion.lolmct.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class MoreCraftingTableBlock extends CraftingTableBlock {
    public MoreCraftingTableBlock(MapColor colour) {
        super(Properties.ofFullCopy(Blocks.CRAFTING_TABLE).mapColor(colour));
    }

    public MoreCraftingTableBlock(MapColor colour, SoundType sound) {
        super(Properties.ofFullCopy(Blocks.CRAFTING_TABLE).mapColor(colour).sound(sound));
    }
}
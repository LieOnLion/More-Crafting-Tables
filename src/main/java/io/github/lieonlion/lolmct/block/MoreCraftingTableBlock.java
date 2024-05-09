package io.github.lieonlion.lolmct.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.block.MapColor;
import net.minecraft.sound.BlockSoundGroup;

public class MoreCraftingTableBlock extends CraftingTableBlock {
    public MoreCraftingTableBlock(MapColor colour) {
        super(AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(colour));
    }

    public MoreCraftingTableBlock(MapColor colour, BlockSoundGroup sound) {
        super(AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE).mapColor(colour).sounds(sound));
    }
}
package io.github.lieonlion.lolmct.block;

import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class MoreCraftingTableBlock extends CraftingTableBlock {
    public MoreCraftingTableBlock(MapColor colour) {
        super(Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(2.5F).sound(SoundType.WOOD).ignitedByLava());
    }

    public MoreCraftingTableBlock(MapColor colour, SoundType sound) {
        super(Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(2.5F).sound(sound).ignitedByLava());
    }
}
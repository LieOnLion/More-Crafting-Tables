package io.github.lieonlion.lolmct.init;

import io.github.lieonlion.lolmct.MoreCraftingTables;
import io.github.lieonlion.lolmct.block.MoreCraftingTableBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class MctBlockInit {
    public static final MoreCraftingTableBlock SPRUCE_TABLE = new MoreCraftingTableBlock(MapColor.SPRUCE_BROWN);
    public static final MoreCraftingTableBlock BIRCH_TABLE = new MoreCraftingTableBlock(MapColor.PALE_YELLOW);
    public static final MoreCraftingTableBlock JUNGLE_TABLE = new MoreCraftingTableBlock(MapColor.DIRT_BROWN);
    public static final MoreCraftingTableBlock ACACIA_TABLE = new MoreCraftingTableBlock(MapColor.ORANGE);
    public static final MoreCraftingTableBlock DARK_OAK_TABLE = new MoreCraftingTableBlock(MapColor.BROWN);
    public static final MoreCraftingTableBlock MANGROVE_TABLE = new MoreCraftingTableBlock(MapColor.RED);
    public static final MoreCraftingTableBlock CHERRY_TABLE = new MoreCraftingTableBlock(MapColor.TERRACOTTA_WHITE, BlockSoundGroup.CHERRY_WOOD);
    public static final MoreCraftingTableBlock BAMBOO_TABLE = new MoreCraftingTableBlock(MapColor.YELLOW, BlockSoundGroup.BAMBOO_WOOD);
    public static final MoreCraftingTableBlock CRIMSON_TABLE = new MoreCraftingTableBlock(MapColor.DULL_PINK, BlockSoundGroup.NETHER_WOOD);
    public static final MoreCraftingTableBlock WARPED_TABLE = new MoreCraftingTableBlock(MapColor.DARK_AQUA, BlockSoundGroup.NETHER_WOOD);

    public static void registerBlocks() {
        registerBlock("spruce_crafting_table", SPRUCE_TABLE);
        registerBlock("birch_crafting_table", BIRCH_TABLE);
        registerBlock("jungle_crafting_table", JUNGLE_TABLE);
        registerBlock("acacia_crafting_table", ACACIA_TABLE);
        registerBlock("dark_oak_crafting_table", DARK_OAK_TABLE);
        registerBlock("mangrove_crafting_table", MANGROVE_TABLE);
        registerBlock("cherry_crafting_table", CHERRY_TABLE);
        registerBlock("bamboo_crafting_table", BAMBOO_TABLE);
        registerBlock("crimson_crafting_table", CRIMSON_TABLE);
        registerBlock("warped_crafting_table", WARPED_TABLE);
    }

    private static void registerBlock(String name, Block block) {
        Registry.register(Registries.BLOCK, new Identifier(MoreCraftingTables.MODID, name), block);
    }
}
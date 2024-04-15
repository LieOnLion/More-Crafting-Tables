package io.github.lieonlion.lolmct.init;

import io.github.lieonlion.lolmct.MoreCraftingTables;
import io.github.lieonlion.lolmct.block.MoreCraftingTableBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MctBlockInit {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MoreCraftingTables.MODID);

    public static final DeferredBlock<Block> SPRUCE_TABLE = registerBlock("spruce_crafting_table", () -> new MoreCraftingTableBlock(MapColor.PODZOL));
    public static final DeferredBlock<Block> BIRCH_TABLE = registerBlock("birch_crafting_table", () -> new MoreCraftingTableBlock(MapColor.SAND));
    public static final DeferredBlock<Block> JUNGLE_TABLE = registerBlock("jungle_crafting_table", () -> new MoreCraftingTableBlock(MapColor.DIRT));
    public static final DeferredBlock<Block> ACACIA_TABLE = registerBlock("acacia_crafting_table", () -> new MoreCraftingTableBlock(MapColor.COLOR_ORANGE));
    public static final DeferredBlock<Block> DARK_OAK_TABLE = registerBlock("dark_oak_crafting_table", () -> new MoreCraftingTableBlock(MapColor.COLOR_BROWN));
    public static final DeferredBlock<Block> MANGROVE_TABLE = registerBlock("mangrove_crafting_table", () -> new MoreCraftingTableBlock(MapColor.COLOR_RED));
    public static final DeferredBlock<Block> CHERRY_TABLE = registerBlock("cherry_crafting_table", () -> new MoreCraftingTableBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD));
    public static final DeferredBlock<Block> BAMBOO_TABLE = registerBlock("bamboo_crafting_table", () -> new MoreCraftingTableBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD));
    public static final DeferredBlock<Block> CRIMSON_TABLE = registerBlock("crimson_crafting_table", () -> new MoreCraftingTableBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD));
    public static final DeferredBlock<Block> WARPED_TABLE = registerBlock("warped_crafting_table", () -> new MoreCraftingTableBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD));

    public static void registerBlocks(IEventBus modBus) {
        BLOCKS.register(modBus);
    }

    private static DeferredBlock<Block> registerBlock(String name, Supplier<Block> block) {
        return BLOCKS.register(name, block);
    }
}
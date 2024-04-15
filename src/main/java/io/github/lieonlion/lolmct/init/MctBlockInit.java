package io.github.lieonlion.lolmct.init;

import io.github.lieonlion.lolmct.MoreCraftingTables;
import io.github.lieonlion.lolmct.block.MoreCraftingTableBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MctBlockInit {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreCraftingTables.MODID);

    public static final RegistryObject<Block> SPRUCE_TABLE = registerBlock("spruce_crafting_table", () -> new MoreCraftingTableBlock(MapColor.PODZOL));
    public static final RegistryObject<Block> BIRCH_TABLE = registerBlock("birch_crafting_table", () -> new MoreCraftingTableBlock(MapColor.SAND));
    public static final RegistryObject<Block> JUNGLE_TABLE = registerBlock("jungle_crafting_table", () -> new MoreCraftingTableBlock(MapColor.DIRT));
    public static final RegistryObject<Block> ACACIA_TABLE = registerBlock("acacia_crafting_table", () -> new MoreCraftingTableBlock(MapColor.COLOR_ORANGE));
    public static final RegistryObject<Block> DARK_OAK_TABLE = registerBlock("dark_oak_crafting_table", () -> new MoreCraftingTableBlock(MapColor.COLOR_BROWN));
    public static final RegistryObject<Block> MANGROVE_TABLE = registerBlock("mangrove_crafting_table", () -> new MoreCraftingTableBlock(MapColor.COLOR_RED));
    public static final RegistryObject<Block> CHERRY_TABLE = registerBlock("cherry_crafting_table", () -> new MoreCraftingTableBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD));
    public static final RegistryObject<Block> BAMBOO_TABLE = registerBlock("bamboo_crafting_table", () -> new MoreCraftingTableBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD));
    public static final RegistryObject<Block> CRIMSON_TABLE = registerBlock("crimson_crafting_table", () -> new MoreCraftingTableBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD));
    public static final RegistryObject<Block> WARPED_TABLE = registerBlock("warped_crafting_table", () -> new MoreCraftingTableBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD));

    public static void registerBlocks(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }

    private static RegistryObject<Block> registerBlock(String name, Supplier<Block> block) {
        return BLOCKS.register(name, block);
    }
}
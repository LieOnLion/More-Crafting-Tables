package io.github.lieonlion.lolmct;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class MoreCraftingTablesMain implements ModInitializer {

    public static final Block SPRUCE_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block BIRCH_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block JUNGLE_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block ACACIA_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block DARK_OAK_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block MANGROVE_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block CHERRY_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block BAMBOO_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block CRIMSON_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block WARPED_CRAFTING_TABLE = new CraftingTableBlock();

    @Override
    public void onInitialize() {
        registerCraftingTable(SPRUCE_CRAFTING_TABLE, "spruce_crafting_table", true);
        registerCraftingTable(BIRCH_CRAFTING_TABLE, "birch_crafting_table", true);
        registerCraftingTable(JUNGLE_CRAFTING_TABLE, "jungle_crafting_table", true);
        registerCraftingTable(ACACIA_CRAFTING_TABLE, "acacia_crafting_table", true);
        registerCraftingTable(DARK_OAK_CRAFTING_TABLE, "dark_oak_crafting_table", true);
        registerCraftingTable(MANGROVE_CRAFTING_TABLE, "mangrove_crafting_table", true);
        registerCraftingTable(CHERRY_CRAFTING_TABLE, "cherry_crafting_table", true);
        registerCraftingTable(BAMBOO_CRAFTING_TABLE, "bamboo_crafting_table", true);
        registerCraftingTable(CRIMSON_CRAFTING_TABLE, "crimson_crafting_table", false);
        registerCraftingTable(WARPED_CRAFTING_TABLE, "warped_crafting_table", false);
    }

    private void registerCraftingTable(Block craftingTable, String name, boolean canBurn) {
        ResourceLocation id = new ResourceLocation("lolmct", name);

        Registry.register(BuiltInRegistries.BLOCK, id, craftingTable);
        Item item = Registry.register(BuiltInRegistries.ITEM, id, new BlockItem(craftingTable, new Item.Properties()));

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.accept(item));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.REDSTONE_BLOCKS).register(entries -> entries.accept(item));

        if (canBurn)
            FuelRegistry.INSTANCE.add(craftingTable, 300);
    }

    private static class CraftingTableBlock extends net.minecraft.world.level.block.CraftingTableBlock {
        public CraftingTableBlock() {
            super(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE));
        }
    }
}

package io.github.lieonlion.lolmct.init;

import io.github.lieonlion.lolmct.MoreCraftingTables;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MctItemInit {
    public static BlockItem SPRUCE_TABLE_I = new BlockItem(MctBlockInit.SPRUCE_TABLE, (new Item.Settings()));
    public static BlockItem BIRCH_TABLE_I = new BlockItem(MctBlockInit.BIRCH_TABLE, (new Item.Settings()));
    public static BlockItem JUNGLE_TABLE_I = new BlockItem(MctBlockInit.JUNGLE_TABLE, (new Item.Settings()));
    public static BlockItem ACACIA_TABLE_I = new BlockItem(MctBlockInit.ACACIA_TABLE, (new Item.Settings()));
    public static BlockItem DARK_OAK_TABLE_I = new BlockItem(MctBlockInit.DARK_OAK_TABLE, (new Item.Settings()));
    public static BlockItem MANGROVE_TABLE_I = new BlockItem(MctBlockInit.MANGROVE_TABLE, (new Item.Settings()));
    public static BlockItem CHERRY_TABLE_I = new BlockItem(MctBlockInit.CHERRY_TABLE, (new Item.Settings()));
    public static BlockItem BAMBOO_TABLE_I = new BlockItem(MctBlockInit.BAMBOO_TABLE, (new Item.Settings()));
    public static BlockItem CRIMSON_TABLE_I = new BlockItem(MctBlockInit.CRIMSON_TABLE, (new Item.Settings()));
    public static BlockItem WARPED_TABLE_I = new BlockItem(MctBlockInit.WARPED_TABLE, (new Item.Settings()));

    public static void registerItems() {
        registerItem("spruce_crafting_table", SPRUCE_TABLE_I, Items.CRAFTING_TABLE);
        registerItem("birch_crafting_table", BIRCH_TABLE_I, SPRUCE_TABLE_I);
        registerItem("jungle_crafting_table", JUNGLE_TABLE_I, BIRCH_TABLE_I);
        registerItem("acacia_crafting_table", ACACIA_TABLE_I, JUNGLE_TABLE_I);
        registerItem("dark_oak_crafting_table", DARK_OAK_TABLE_I, ACACIA_TABLE_I);
        registerItem("mangrove_crafting_table", MANGROVE_TABLE_I, DARK_OAK_TABLE_I);
        registerItem("cherry_crafting_table", CHERRY_TABLE_I, MANGROVE_TABLE_I);
        registerItem("bamboo_crafting_table", BAMBOO_TABLE_I, CHERRY_TABLE_I);
        registerItem("crimson_crafting_table", CRIMSON_TABLE_I, BAMBOO_TABLE_I);
        registerItem("warped_crafting_table", WARPED_TABLE_I, CRIMSON_TABLE_I);
    }

    public static void registerItem(String name, Item item, Item after) {
        Registry.register(Registries.ITEM, new Identifier(MoreCraftingTables.MODID, name), item);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> entries.addAfter(after, item));
    }
}
package io.github.lieonlion.lolmct.init;

import io.github.lieonlion.lolmct.MoreCraftingTables;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MctItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreCraftingTables.MODID);

    public static RegistryObject<BlockItem> SPRUCE_TABLE_I = registerItem("spruce_crafting_table", MctBlockInit.SPRUCE_TABLE);
    public static RegistryObject<BlockItem> BIRCH_TABLE_I = registerItem("birch_crafting_table", MctBlockInit.BIRCH_TABLE);
    public static RegistryObject<BlockItem> JUNGLE_TABLE_I = registerItem("jungle_crafting_table", MctBlockInit.JUNGLE_TABLE);
    public static RegistryObject<BlockItem> ACACIA_TABLE_I = registerItem("acacia_crafting_table", MctBlockInit.ACACIA_TABLE);
    public static RegistryObject<BlockItem> DARK_OAK_TABLE_I = registerItem("dark_oak_crafting_table", MctBlockInit.DARK_OAK_TABLE);
    public static RegistryObject<BlockItem> MANGROVE_TABLE_I = registerItem("mangrove_crafting_table", MctBlockInit.MANGROVE_TABLE);
    public static RegistryObject<BlockItem> CHERRY_TABLE_I = registerItem("cherry_crafting_table", MctBlockInit.CHERRY_TABLE);
    public static RegistryObject<BlockItem> BAMBOO_TABLE_I = registerItem("bamboo_crafting_table", MctBlockInit.BAMBOO_TABLE);
    public static RegistryObject<BlockItem> CRIMSON_TABLE_I = registerItem("crimson_crafting_table", MctBlockInit.CRIMSON_TABLE);
    public static RegistryObject<BlockItem> WARPED_TABLE_I = registerItem( "warped_crafting_table", MctBlockInit.WARPED_TABLE);

    public static void registerItems(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }

    public static RegistryObject<BlockItem> registerItem(String name, RegistryObject<Block> block) {
        return ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void addItemsToTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() != CreativeModeTabs.FUNCTIONAL_BLOCKS) return;
        registerToTab(event, SPRUCE_TABLE_I.get(), Items.CRAFTING_TABLE);
        registerToTab(event, BIRCH_TABLE_I.get(), SPRUCE_TABLE_I.get());
        registerToTab(event, JUNGLE_TABLE_I.get(), BIRCH_TABLE_I.get());
        registerToTab(event, ACACIA_TABLE_I.get(), JUNGLE_TABLE_I.get());
        registerToTab(event, DARK_OAK_TABLE_I.get(), ACACIA_TABLE_I.get());
        registerToTab(event, MANGROVE_TABLE_I.get(), DARK_OAK_TABLE_I.get());
        registerToTab(event, CHERRY_TABLE_I.get(), MANGROVE_TABLE_I.get());
        registerToTab(event, BAMBOO_TABLE_I.get(), CHERRY_TABLE_I.get());
        registerToTab(event, CRIMSON_TABLE_I.get(), BAMBOO_TABLE_I.get());
        registerToTab(event, WARPED_TABLE_I.get(), CRIMSON_TABLE_I.get());
    } public static void registerToTab(BuildCreativeModeTabContentsEvent event, Item item, Item after) {
        event.getEntries().putAfter(new ItemStack(after), new ItemStack(item), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }
}
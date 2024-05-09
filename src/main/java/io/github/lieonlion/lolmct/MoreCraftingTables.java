package io.github.lieonlion.lolmct;

import io.github.lieonlion.lolmct.init.MctBlockInit;
import io.github.lieonlion.lolmct.init.MctItemInit;
import net.fabricmc.api.ModInitializer;

public class MoreCraftingTables implements ModInitializer {
    public static final String MODID = "lolmct";

    @Override
    public void onInitialize() {
        MctBlockInit.registerBlocks();
        MctItemInit.registerItems();
    }
}
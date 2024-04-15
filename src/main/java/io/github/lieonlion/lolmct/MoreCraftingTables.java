package io.github.lieonlion.lolmct;

import io.github.lieonlion.lolmct.init.MctItemInit;
import io.github.lieonlion.lolmct.init.MctBlockInit;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(MoreCraftingTables.MODID)
public class MoreCraftingTables {
    public static final String MODID = "lolmct";

    public MoreCraftingTables(IEventBus modBus) {

        MctBlockInit.registerBlocks(modBus);
        MctItemInit.registerItems(modBus);

        modBus.addListener(MctItemInit::addItemsToTab);
    }
}
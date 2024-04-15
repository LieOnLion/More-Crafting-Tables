package io.github.lieonlion.lolmct;

import io.github.lieonlion.lolmct.init.MctItemInit;
import io.github.lieonlion.lolmct.init.MctBlockInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MoreCraftingTables.MODID)
public class MoreCraftingTables {
    public static final String MODID = "lolmct";

    public MoreCraftingTables() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MctBlockInit.registerBlocks(modEventBus);
        MctItemInit.registerItems(modEventBus);

        modEventBus.addListener(MctItemInit::addItemsToTab);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
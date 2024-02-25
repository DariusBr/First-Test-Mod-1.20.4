package com.darius0o2.firsttestmod;

import com.darius0o2.firsttestmod.Item.ModItemGroups;
import com.darius0o2.firsttestmod.Item.ModItems;
import com.darius0o2.firsttestmod.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstTestMod implements ModInitializer
{
	public static final String MOD_ID = "first-test-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);
	}
}
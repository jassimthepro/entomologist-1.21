package net.garchomp.entomologist;

import net.fabricmc.api.ModInitializer;

import net.garchomp.entomologist.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Entomologist implements ModInitializer {
	public static final String MOD_ID = "entomologist";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
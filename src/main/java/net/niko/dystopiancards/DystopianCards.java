package net.niko.dystopiancards;

import net.fabricmc.api.ModInitializer;
import net.niko.dystopiancards.block.ModBlocks;
import net.niko.dystopiancards.item.ModItemGroups;
import net.niko.dystopiancards.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DystopianCards implements ModInitializer {
	public static final String MOD_ID = "dystopiancards";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
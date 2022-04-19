package net.Settordici.beautify;

import net.Settordici.beautify.block.ModBlocks;
import net.Settordici.beautify.item.ModItems;
import net.Settordici.beautify.util.ModRegistries;
import net.Settordici.beautify.world.feature.ModConfiguredFeatures;
import net.Settordici.beautify.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeautifyMod implements ModInitializer {
	public static final String MOD_ID = "beautify";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();

		ModWorldGen.generateModWorldGen();
	}
}

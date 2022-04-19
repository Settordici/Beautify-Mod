package net.Settordici.testmod;

import net.Settordici.testmod.block.ModBlocks;
import net.Settordici.testmod.item.ModItems;
import net.Settordici.testmod.util.ModRegistries;
import net.Settordici.testmod.world.feature.ModConfiguredFeatures;
import net.Settordici.testmod.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
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

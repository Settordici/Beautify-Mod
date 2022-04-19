package net.Settordici.beautify.world.gen;

import net.Settordici.beautify.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModFoliageGeneration {

    public static void generateFoliage() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.LEAF_CARPET_PLACED.getKey().get());
    }
}

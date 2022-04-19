package net.Settordici.beautify.world.gen;

import net.Settordici.beautify.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModGrassGeneration {
    public static void generateGrass() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.LITTLE_GRASS_PLACED.getKey().get());
    }
}

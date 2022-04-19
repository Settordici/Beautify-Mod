package net.Settordici.beautify.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> LITTLE_GRASS_PLACED =
            PlacedFeatures.register("little_grass_placed", ModConfiguredFeatures.LITTLE_GRASS, VegetationPlacedFeatures.modifiers(5));

    public static final RegistryEntry<PlacedFeature> LEAF_CARPET_PLACED =
            PlacedFeatures.register("leaf_carpet_placed", ModConfiguredFeatures.LEAF_CARPET, VegetationPlacedFeatures.modifiers(2));
}

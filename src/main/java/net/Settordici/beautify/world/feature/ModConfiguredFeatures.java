package net.Settordici.beautify.world.feature;

import net.Settordici.beautify.BeautifyMod;
import net.Settordici.beautify.block.ModBlocks;
import net.Settordici.beautify.block.custom.ModRandomPatch;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class ModConfiguredFeatures {

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> LITTLE_GRASS =
            ConfiguredFeatures.register("little_grass", Feature.RANDOM_PATCH, ModRandomPatch.createRandomPatchFeatureConfig(BlockStateProvider.of(ModBlocks.LITTLE_GRASS), 64));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> LEAF_CARPET =
            ConfiguredFeatures.register("leaf_carpet", Feature.RANDOM_PATCH, ModRandomPatch.createRandomPatchFeatureConfig(BlockStateProvider.of(ModBlocks.LEAF_CARPET), 4));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + BeautifyMod.MOD_ID);
    }
}

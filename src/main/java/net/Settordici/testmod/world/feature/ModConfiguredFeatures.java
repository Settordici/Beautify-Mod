package net.Settordici.testmod.world.feature;

import net.Settordici.testmod.TestMod;
import net.Settordici.testmod.block.ModBlocks;
import net.Settordici.testmod.block.custom.ModRandomPatch;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class ModConfiguredFeatures {

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> LITTLE_GRASS =
            ConfiguredFeatures.register("little_grass", Feature.RANDOM_PATCH, ModRandomPatch.createRandomPatchFeatureConfig(BlockStateProvider.of(ModBlocks.LITTLE_GRASS), 32));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + TestMod.MOD_ID);
    }
}

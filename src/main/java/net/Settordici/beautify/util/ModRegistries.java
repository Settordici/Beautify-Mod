package net.Settordici.beautify.util;

import net.Settordici.beautify.block.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFlammableBlock();
    }

    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.LITTLE_GRASS, 60, 100);
    }
}

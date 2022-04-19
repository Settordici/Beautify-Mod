package net.Settordici.testmod.util;

import net.Settordici.testmod.block.ModBlocks;
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

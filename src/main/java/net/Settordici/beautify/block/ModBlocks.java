package net.Settordici.beautify.block;

import net.Settordici.beautify.BeautifyMod;
import net.Settordici.beautify.block.custom.LeafCarpet;
import net.Settordici.beautify.block.custom.LittleGrass;
import net.Settordici.beautify.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block LITTLE_GRASS = registerBlock("little_grass",
            new LittleGrass(FabricBlockSettings.copy(Blocks.GRASS).nonOpaque().breakInstantly().noCollision()), ModItemGroup.BEAUTIFY);

    public static final Block LEAF_CARPET = registerBlock("leaf_carpet",
            new LeafCarpet(FabricBlockSettings.copy(Blocks.GRASS).breakInstantly().nonOpaque().noCollision()), ModItemGroup.BEAUTIFY);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(BeautifyMod.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(BeautifyMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        BeautifyMod.LOGGER.info("Registering ModBlocks for " + BeautifyMod.MOD_ID);
    }


}

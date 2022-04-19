package net.Settordici.beautify.item;

import net.Settordici.beautify.BeautifyMod;
import net.Settordici.beautify.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BEAUTIFY = FabricItemGroupBuilder.build(new Identifier(BeautifyMod.MOD_ID, "beautify_tab"),
            () -> new ItemStack(ModBlocks.LITTLE_GRASS));
}

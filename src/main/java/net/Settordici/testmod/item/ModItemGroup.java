package net.Settordici.testmod.item;

import net.Settordici.testmod.TestMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TEST = FabricItemGroupBuilder.build(new Identifier(TestMod.MOD_ID, "test"),
            () -> new ItemStack(ModItems.TEST_ITEM));
}

package net.Settordici.beautify.item;


import net.Settordici.beautify.BeautifyMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BeautifyMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        BeautifyMod.LOGGER.info("Registering Mod Items for " + BeautifyMod.MOD_ID);
    }

}

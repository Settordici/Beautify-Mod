package net.Settordici.beautify;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.Settordici.beautify.block.ModBlocks;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;

public class BeautifyClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LITTLE_GRASS, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> BiomeColors.getGrassColor(world, pos), ModBlocks.LITTLE_GRASS);
    }
}

package net.Settordici.testmod;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.Settordici.testmod.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class TestClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHORT_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LITTLE_GRASS, RenderLayer.getCutout());
    }
}

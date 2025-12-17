package net.niko.dystopiancards.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.niko.dystopiancards.block.ModBlocks;
import net.niko.dystopiancards.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        List<ItemConvertible> CARDS = List.of(
                ModItems.CARD_BLANK
        );

        offerSmelting(recipeExporter, CARDS, RecipeCategory.MISC, ModItems.CARD_SCRAP, 0.25f, 200, "card_scrap");

        offerBlasting(recipeExporter, CARDS, RecipeCategory.MISC, ModItems.CARD_SCRAP, 0.25f, 100, "card_scrap");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CARD_SCRAP_BLOCK)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.CARD_SCRAP)
                .criterion(hasItem(ModItems.CARD_SCRAP), conditionsFromItem(ModItems.CARD_SCRAP))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CARD_SCRAP, 9)
                .input(ModBlocks.CARD_SCRAP_BLOCK)
                .criterion(hasItem(ModBlocks.CARD_SCRAP_BLOCK), conditionsFromItem(ModBlocks.CARD_SCRAP_BLOCK))
                .offerTo(recipeExporter);
    }
}

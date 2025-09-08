package com.dragn0007.radrats.datagen;

import com.dragn0007.radrats.blocks.RRBlocks;
import com.dragn0007.radrats.items.RRItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class RRRecipeMaker extends RecipeProvider implements IConditionBuilder {
    public RRRecipeMaker(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.WIRE_DOOR.get())
                .define('A', Items.CHAIN)
                .define('B', Items.IRON_NUGGET)
                .pattern("ABA")
                .pattern("ABA")
                .unlockedBy("has_chain", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CHAIN).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.WIRE_WALL.get(), 4)
                .define('A', Items.CHAIN)
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_chain", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CHAIN).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.WATER_BOTTLE.get())
                .define('A', Items.GLASS_PANE)
                .define('B', Items.IRON_NUGGET)
                .pattern("AAA")
                .pattern("A A")
                .pattern("B B")
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_PANE).build()))
                .save(pFinishedRecipeConsumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.BLACK_TUNNEL.get())
                .define('B', Items.BLACK_WOOL)
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.BLUE_TUNNEL.get())
                .define('B', Items.BLUE_WOOL)
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.BROWN_TUNNEL.get())
                .define('B', Items.BROWN_WOOL)
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.CYAN_TUNNEL.get())
                .define('B', Items.CYAN_WOOL)
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.GREEN_TUNNEL.get())
                .define('B', Items.GREEN_WOOL)
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.GREY_TUNNEL.get())
                .define('B', Items.GRAY_WOOL)
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.LIGHT_BLUE_TUNNEL.get())
                .define('B', Items.LIGHT_BLUE_WOOL)
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.LIGHT_GREY_TUNNEL.get())
                .define('B', Items.LIGHT_GRAY_WOOL)
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.LIME_TUNNEL.get())
                .define('B', Items.LIME_WOOL)
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.MAGENTA_TUNNEL.get())
                .define('B', Items.MAGENTA_WOOL)
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.ORANGE_TUNNEL.get())
                .define('B', Items.ORANGE_WOOL)
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.PINK_TUNNEL.get())
                .define('B', Items.PINK_WOOL)
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.PURPLE_TUNNEL.get())
                .define('B', Items.PURPLE_WOOL)
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.RED_TUNNEL.get())
                .define('B', Items.RED_WOOL)
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.WHITE_TUNNEL.get())
                .define('B', Items.WHITE_WOOL)
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.YELLOW_TUNNEL.get())
                .define('B', Items.YELLOW_WOOL)
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.BLACK_HAMMOCK.get())
                .define('A', Items.BLACK_WOOL)
                .define('B', Items.STRING)
                .pattern("BAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.BLUE_HAMMOCK.get())
                .define('A', Items.BLUE_WOOL)
                .define('B', Items.STRING)
                .pattern("BAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.BROWN_HAMMOCK.get())
                .define('A', Items.BROWN_WOOL)
                .define('B', Items.STRING)
                .pattern("BAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.CYAN_HAMMOCK.get())
                .define('A', Items.CYAN_WOOL)
                .define('B', Items.STRING)
                .pattern("BAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.GREEN_HAMMOCK.get())
                .define('A', Items.GREEN_WOOL)
                .define('B', Items.STRING)
                .pattern("BAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.GREY_HAMMOCK.get())
                .define('A', Items.GRAY_WOOL)
                .define('B', Items.STRING)
                .pattern("BAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.LIGHT_BLUE_HAMMOCK.get())
                .define('A', Items.LIGHT_BLUE_WOOL)
                .define('B', Items.STRING)
                .pattern("BAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.LIGHT_GREY_HAMMOCK.get())
                .define('A', Items.LIGHT_GRAY_WOOL)
                .define('B', Items.STRING)
                .pattern("BAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.LIME_HAMMOCK.get())
                .define('A', Items.LIME_WOOL)
                .define('B', Items.STRING)
                .pattern("BAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.MAGENTA_HAMMOCK.get())
                .define('A', Items.MAGENTA_WOOL)
                .define('B', Items.STRING)
                .pattern("BAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.ORANGE_HAMMOCK.get())
                .define('A', Items.ORANGE_WOOL)
                .define('B', Items.STRING)
                .pattern("BAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.PINK_HAMMOCK.get())
                .define('A', Items.PINK_WOOL)
                .define('B', Items.STRING)
                .pattern("BAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.PURPLE_HAMMOCK.get())
                .define('A', Items.PURPLE_WOOL)
                .define('B', Items.STRING)
                .pattern("BAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.RED_HAMMOCK.get())
                .define('A', Items.RED_WOOL)
                .define('B', Items.STRING)
                .pattern("BAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.WHITE_HAMMOCK.get())
                .define('A', Items.WHITE_WOOL)
                .define('B', Items.STRING)
                .pattern("BAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRBlocks.YELLOW_HAMMOCK.get())
                .define('A', Items.YELLOW_WOOL)
                .define('B', Items.STRING)
                .pattern("BAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.BLUE_SWEATER.get())
                .define('A', Items.BLUE_WOOL)
                .define('B', Items.STRING)
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.BROWN_SWEATER.get())
                .define('A', Items.BROWN_WOOL)
                .define('B', Items.STRING)
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.CYAN_SWEATER.get())
                .define('A', Items.CYAN_WOOL)
                .define('B', Items.STRING)
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.GREEN_SWEATER.get())
                .define('A', Items.GREEN_WOOL)
                .define('B', Items.STRING)
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.GREY_SWEATER.get())
                .define('A', Items.GRAY_WOOL)
                .define('B', Items.STRING)
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.LIGHT_BLUE_SWEATER.get())
                .define('A', Items.LIGHT_BLUE_WOOL)
                .define('B', Items.STRING)
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.LIGHT_GREY_SWEATER.get())
                .define('A', Items.LIGHT_GRAY_WOOL)
                .define('B', Items.STRING)
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.LIME_SWEATER.get())
                .define('A', Items.LIME_WOOL)
                .define('B', Items.STRING)
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.MAGENTA_SWEATER.get())
                .define('A', Items.MAGENTA_WOOL)
                .define('B', Items.STRING)
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.ORANGE_SWEATER.get())
                .define('A', Items.ORANGE_WOOL)
                .define('B', Items.STRING)
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.PINK_SWEATER.get())
                .define('A', Items.PINK_WOOL)
                .define('B', Items.STRING)
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.PURPLE_SWEATER.get())
                .define('A', Items.PURPLE_WOOL)
                .define('B', Items.STRING)
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.RED_SWEATER.get())
                .define('A', Items.RED_WOOL)
                .define('B', Items.STRING)
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.WHITE_SWEATER.get())
                .define('A', Items.WHITE_WOOL)
                .define('B', Items.STRING)
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.YELLOW_SWEATER.get())
                .define('A', Items.YELLOW_WOOL)
                .define('B', Items.STRING)
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.BLACK_CHECKERED_SWEATER.get())
                .define('A', Items.BLACK_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("ABC")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.BLUE_CHECKERED_SWEATER.get())
                .define('A', Items.BLUE_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("ABC")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.BROWN_CHECKERED_SWEATER.get())
                .define('A', Items.BROWN_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("ABC")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.CYAN_CHECKERED_SWEATER.get())
                .define('A', Items.CYAN_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("ABC")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.GREEN_CHECKERED_SWEATER.get())
                .define('A', Items.GREEN_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("ABC")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.GREY_CHECKERED_SWEATER.get())
                .define('A', Items.GRAY_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("ABC")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.LIGHT_BLUE_CHECKERED_SWEATER.get())
                .define('A', Items.LIGHT_BLUE_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("ABC")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.LIGHT_GREY_CHECKERED_SWEATER.get())
                .define('A', Items.LIGHT_GRAY_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("ABC")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.LIME_CHECKERED_SWEATER.get())
                .define('A', Items.LIME_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("ABC")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.MAGENTA_CHECKERED_SWEATER.get())
                .define('A', Items.MAGENTA_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("ABC")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.ORANGE_CHECKERED_SWEATER.get())
                .define('A', Items.ORANGE_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("ABC")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.PINK_CHECKERED_SWEATER.get())
                .define('A', Items.PINK_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("ABC")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.PURPLE_CHECKERED_SWEATER.get())
                .define('A', Items.PURPLE_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("ABC")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.RED_CHECKERED_SWEATER.get())
                .define('A', Items.RED_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("ABC")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.YELLOW_CHECKERED_SWEATER.get())
                .define('A', Items.YELLOW_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("ABC")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.BLACK_FRILLY_SWEATER.get())
                .define('A', Items.BLACK_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("CAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.BLUE_FRILLY_SWEATER.get())
                .define('A', Items.BLUE_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("CAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.BROWN_FRILLY_SWEATER.get())
                .define('A', Items.BROWN_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("CAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.CYAN_FRILLY_SWEATER.get())
                .define('A', Items.CYAN_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("CAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.GREEN_FRILLY_SWEATER.get())
                .define('A', Items.GREEN_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("CAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.GREY_FRILLY_SWEATER.get())
                .define('A', Items.GRAY_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("CAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.LIGHT_BLUE_FRILLY_SWEATER.get())
                .define('A', Items.LIGHT_BLUE_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("CAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.LIGHT_GREY_FRILLY_SWEATER.get())
                .define('A', Items.LIGHT_GRAY_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("CAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.LIME_FRILLY_SWEATER.get())
                .define('A', Items.LIME_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("CAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.MAGENTA_FRILLY_SWEATER.get())
                .define('A', Items.MAGENTA_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("CAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.ORANGE_FRILLY_SWEATER.get())
                .define('A', Items.ORANGE_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("CAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.PINK_FRILLY_SWEATER.get())
                .define('A', Items.PINK_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("CAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.PURPLE_FRILLY_SWEATER.get())
                .define('A', Items.PURPLE_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("CAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.RED_FRILLY_SWEATER.get())
                .define('A', Items.RED_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("CAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.YELLOW_FRILLY_SWEATER.get())
                .define('A', Items.YELLOW_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("CAB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.BLACK_POLKA_DOTTED_SWEATER.get())
                .define('A', Items.BLACK_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("AB")
                .pattern("C ")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.BLUE_POLKA_DOTTED_SWEATER.get())
                .define('A', Items.BLUE_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("AB")
                .pattern("C ")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.BROWN_POLKA_DOTTED_SWEATER.get())
                .define('A', Items.BROWN_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("AB")
                .pattern("C ")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.CYAN_POLKA_DOTTED_SWEATER.get())
                .define('A', Items.CYAN_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("AB")
                .pattern("C ")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.GREEN_POLKA_DOTTED_SWEATER.get())
                .define('A', Items.GREEN_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("AB")
                .pattern("C ")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.GREY_POLKA_DOTTED_SWEATER.get())
                .define('A', Items.GRAY_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("AB")
                .pattern("C ")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.LIGHT_BLUE_POLKA_DOTTED_SWEATER.get())
                .define('A', Items.LIGHT_BLUE_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("AB")
                .pattern("C ")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.LIGHT_GREY_POLKA_DOTTED_SWEATER.get())
                .define('A', Items.LIGHT_GRAY_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("AB")
                .pattern("C ")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.LIME_POLKA_DOTTED_SWEATER.get())
                .define('A', Items.LIME_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("AB")
                .pattern("C ")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.MAGENTA_POLKA_DOTTED_SWEATER.get())
                .define('A', Items.MAGENTA_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("AB")
                .pattern("C ")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.ORANGE_POLKA_DOTTED_SWEATER.get())
                .define('A', Items.ORANGE_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("AB")
                .pattern("C ")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.PINK_POLKA_DOTTED_SWEATER.get())
                .define('A', Items.PINK_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("AB")
                .pattern("C ")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.PURPLE_POLKA_DOTTED_SWEATER.get())
                .define('A', Items.PURPLE_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("AB")
                .pattern("C ")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.RED_POLKA_DOTTED_SWEATER.get())
                .define('A', Items.RED_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("AB")
                .pattern("C ")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.YELLOW_POLKA_DOTTED_SWEATER.get())
                .define('A', Items.YELLOW_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("AB")
                .pattern("C ")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.BLACK_STRIPED_SWEATER.get())
                .define('A', Items.BLACK_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("C ")
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.BLUE_STRIPED_SWEATER.get())
                .define('A', Items.BLUE_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("C ")
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.BROWN_STRIPED_SWEATER.get())
                .define('A', Items.BROWN_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("C ")
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.CYAN_STRIPED_SWEATER.get())
                .define('A', Items.CYAN_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("C ")
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.GREEN_STRIPED_SWEATER.get())
                .define('A', Items.GREEN_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("C ")
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.GREY_STRIPED_SWEATER.get())
                .define('A', Items.GRAY_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("C ")
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.LIGHT_BLUE_STRIPED_SWEATER.get())
                .define('A', Items.LIGHT_BLUE_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("C ")
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.LIGHT_GREY_STRIPED_SWEATER.get())
                .define('A', Items.LIGHT_GRAY_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("C ")
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.LIME_STRIPED_SWEATER.get())
                .define('A', Items.LIME_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("C ")
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.MAGENTA_STRIPED_SWEATER.get())
                .define('A', Items.MAGENTA_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("C ")
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.ORANGE_STRIPED_SWEATER.get())
                .define('A', Items.ORANGE_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("C ")
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.PINK_STRIPED_SWEATER.get())
                .define('A', Items.PINK_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("C ")
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.PURPLE_STRIPED_SWEATER.get())
                .define('A', Items.PURPLE_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("C ")
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.RED_STRIPED_SWEATER.get())
                .define('A', Items.RED_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("C ")
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RRItems.YELLOW_STRIPED_SWEATER.get())
                .define('A', Items.YELLOW_WOOL)
                .define('B', Items.STRING)
                .define('C', Items.WHITE_WOOL)
                .pattern("C ")
                .pattern("AB")
                .unlockedBy("has_wool", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.WOOL).build()))
                .save(pFinishedRecipeConsumer);

    }

}
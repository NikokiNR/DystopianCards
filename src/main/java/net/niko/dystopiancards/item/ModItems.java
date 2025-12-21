package net.niko.dystopiancards.item;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.niko.dystopiancards.DystopianCards;

import java.util.List;

public class ModItems {

    public static final Item CARD_00_BLANK = registerItem("card_00_blank", new Item(new Item.Settings()
            .maxCount(1).rarity(Rarity.UNCOMMON)) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            if(Screen.hasShiftDown()) {
                tooltip.add(Text.translatable("tooltip.dystopiancards.card_00_blank.shift_down_0"));
                tooltip.add(Text.translatable("tooltip.dystopiancards.card_00_blank.shift_down_1").formatted(Formatting.AQUA));
                tooltip.add(Text.translatable("tooltip.dystopiancards.card_00_blank.shift_down_2").formatted(Formatting.GRAY, Formatting.ITALIC));
                tooltip.add(Text.translatable("tooltip.dystopiancards.card_00_blank.shift_down_3").formatted(Formatting.GRAY, Formatting.ITALIC));
            } else {
                tooltip.add(Text.translatable("tooltip.dystopiancards.card_00_blank_0"));
                tooltip.add(Text.translatable("tooltip.dystopiancards.card_00_blank_1").formatted(Formatting.AQUA));
                tooltip.add(Text.translatable("tooltip.dystopiancards.card_00_blank_2"));
            }
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item CARD_05_DIAMOND_PICKAXE = registerItem("card_05_diamond_pickaxe", new Item(new Item.Settings()
            .maxCount(1).rarity(Rarity.UNCOMMON)) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            if(Screen.hasShiftDown()) {
                tooltip.add(Text.translatable("tooltip.dystopiancards.card_05_diamond_pickaxe.shift_down_0"));
                tooltip.add(Text.translatable("tooltip.dystopiancards.card_05_diamond_pickaxe.shift_down_1").formatted(Formatting.AQUA));
                tooltip.add(Text.translatable("tooltip.dystopiancards.card_05_diamond_pickaxe.shift_down_2").formatted(Formatting.GRAY, Formatting.ITALIC));
                tooltip.add(Text.translatable("tooltip.dystopiancards.card_05_diamond_pickaxe.shift_down_3").formatted(Formatting.GRAY, Formatting.ITALIC));
            } else {
                tooltip.add(Text.translatable("tooltip.dystopiancards.card_05_diamond_pickaxe_0"));
                tooltip.add(Text.translatable("tooltip.dystopiancards.card_05_diamond_pickaxe_1").formatted(Formatting.AQUA));
                tooltip.add(Text.translatable("tooltip.dystopiancards.card_05_diamond_pickaxe_2"));
            }
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item CARD_SCRAP = registerItem("card_scrap", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.dystopiancards.card_scrap"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DystopianCards.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DystopianCards.LOGGER.info("Registering Mod Items for " + DystopianCards.MOD_ID);
    }
}

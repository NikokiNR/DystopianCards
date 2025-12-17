package net.niko.dystopiancards.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.niko.dystopiancards.DystopianCards;

import java.util.List;

public class ModItems {

    public static final Item CARD_BLANK = registerItem("card_blank", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            if(Screen.hasShiftDown()) {
                tooltip.add(Text.translatable("tooltip.dystopiancards.card_blank.shift_down_1"));
                tooltip.add(Text.translatable("tooltip.dystopiancards.card_blank.shift_down_2"));
                tooltip.add(Text.translatable("tooltip.dystopiancards.card_blank.shift_down_3"));
                tooltip.add(Text.translatable("tooltip.dystopiancards.card_blank.shift_down_4"));
            } else {
                tooltip.add(Text.translatable("tooltip.dystopiancards.card_blank_1"));
                tooltip.add(Text.translatable("tooltip.dystopiancards.card_blank_2"));
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

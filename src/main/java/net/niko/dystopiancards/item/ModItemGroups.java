package net.niko.dystopiancards.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.niko.dystopiancards.DystopianCards;
import net.niko.dystopiancards.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup DYSTOPIAN_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(DystopianCards.MOD_ID, "dystopian_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CARD_SCRAP))
                    .displayName(Text.translatable("itemgroup.dystopiancards.dystopian_items"))
                    .entries((displayContext, entries) -> {

                      entries.add(ModItems.CARD_SCRAP);
                      entries.add(ModBlocks.CARD_SCRAP_BLOCK);

                    }).build());

    public static final ItemGroup DYSTOPIAN_CARDS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(DystopianCards.MOD_ID, "dystopian_cards"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CARD_00_BLANK))
                    .displayName(Text.translatable("itemgroup.dystopiancards.dystopian_cards"))
                    .entries((displayContext, entries) -> {

                      entries.add(ModItems.CARD_00_BLANK);
                      entries.add(ModItems.CARD_05_DIAMOND_PICKAXE);

                    }).build());

    public static void registerItemGroups() {
        DystopianCards.LOGGER.info("Registering Item Groups for " + DystopianCards.MOD_ID);
    }
}

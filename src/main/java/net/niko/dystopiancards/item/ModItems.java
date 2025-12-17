package net.niko.dystopiancards.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.niko.dystopiancards.DystopianCards;

public class ModItems {

    public static final Item CARD_BLANK = registerItem("card_blank", new Item(new Item.Settings()));
    public static final Item CARD_SCRAP = registerItem("card_scrap", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DystopianCards.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DystopianCards.LOGGER.info("Registering Mod Items for " + DystopianCards.MOD_ID);
    }
}

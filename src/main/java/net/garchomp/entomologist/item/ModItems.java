package net.garchomp.entomologist.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.garchomp.entomologist.Entomologist;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
public static final Item BUG_NET = registerItem("bug_net", new Item(new Item.Settings()));
public static final Item TERRARIUM = registerItem("terrarium", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Entomologist.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Entomologist.LOGGER.info("Registering Mod Items For " + Entomologist.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(BUG_NET);
            entries.add(TERRARIUM);
        });
    }

}

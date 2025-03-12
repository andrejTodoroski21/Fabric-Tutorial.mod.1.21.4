package net.andrej.tutorialmod.Item;

import net.andrej.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;


public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));

    private static void AddItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(RUBY);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.Mod_ID, name), item);
    }

    public static void registeredModItems(){
        TutorialMod.LOGGER.info("Registering mod items for" + TutorialMod.Mod_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::AddItemsToIngredientItemGroup);
    }
}

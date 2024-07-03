package com.oldbarom.systempunk.mod.item;

import com.oldbarom.systempunk.mod.Systempunk;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Systempunk.MODID);

    //Ores - Cast - Overword
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties()));

    //Ores - Cast - Etherion
    public static final RegistryObject<Item> ABISMIT = ITEMS.register("abismit", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AREIT = ITEMS.register("areit", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMINT = ITEMS.register("lumint", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NIHILIT = ITEMS.register("nihilit", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SEREFINIT = ITEMS.register("serefinit", () -> new Item(new Item.Properties()));

    //Ores - Cast - Nether
    public static final RegistryObject<Item> ODIUM = ITEMS.register("odium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INFERNIUM = ITEMS.register("infernium", () -> new Item(new Item.Properties()));
    //Ores - Raw - Overworld
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire", () -> new Item(new Item.Properties()));

    //Ores - Raw - Etherion
    public static final RegistryObject<Item> RAW_ABISMIT = ITEMS.register("raw_abismit", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_AREIT = ITEMS.register("raw_areit", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_LUMINT = ITEMS.register("raw_lumint", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_NIHILIT = ITEMS.register("raw_nihilit", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SEREFINIT = ITEMS.register("raw_serefinit", () -> new Item(new Item.Properties()));

    //Ingots - Cast - Overworld
    public static final RegistryObject<Item> ABISMIT_INGOT = ITEMS.register("abismit_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AREIT_INGOT = ITEMS.register("areit_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMINT_INGOT = ITEMS.register("lumint_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NIHILIT_INGOT = ITEMS.register("nihilit_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SEREFINIT_INGOT = ITEMS.register("serefinit_ingot", () -> new Item(new Item.Properties()));
    //Functional

    //Food
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));

    //Tools

    //Blocks

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

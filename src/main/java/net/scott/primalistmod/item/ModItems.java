package net.scott.primalistmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.scott.primalistmod.PrimalistMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PrimalistMod.MOD_ID);

public static RegistryObject<Item> VESKEL = ITEMS.register("veskel",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));

public static RegistryObject<Item> MOTE_OF_WATER = ITEMS.register("mote_of_water",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
public static RegistryObject<Item> MOTE_OF_FIRE = ITEMS.register("mote_of_fire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
public static RegistryObject<Item> MOTE_OF_EARTH = ITEMS.register("mote_of_earth",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
public static RegistryObject<Item> MOTE_OF_AIR = ITEMS.register("mote_of_air",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
public static RegistryObject<Item> THE_FORSAKEN_MOTE  = ITEMS.register("the_forsaken_mote",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
public static RegistryObject<Item> MOTE_OF_NATURE  = ITEMS.register("mote_of_nature",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
public static RegistryObject<Item> MOTE_OF_ICE  = ITEMS.register("mote_of_ice",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
public static RegistryObject<Item> WITHERING_MOTE = ITEMS.register("withering_mote",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
public static RegistryObject<Item> MOTE_OF_TIME  = ITEMS.register("mote_of_time",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));



public static RegistryObject<Item> ESSENCE_OF_THE_SKY = ITEMS.register("essence_of_the_sky",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
public static RegistryObject<Item> ESSENCE_OF_THE_TIDE = ITEMS.register("essence_of_the_tide",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
public static RegistryObject<Item> ESSENCE_OF_THE_PYROMANCER = ITEMS.register("essence_of_the_pyromancer",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
public static RegistryObject<Item> ESSENCE_OF_THE_CAVERNS = ITEMS.register("essence_of_the_caverns",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
public static RegistryObject<Item> ESSENCE_OF_THE_VOID = ITEMS.register("essence_of_the_void",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
public static RegistryObject<Item> ESSENCE_OF_SOULS = ITEMS.register("essence_of_souls",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
public static RegistryObject<Item> BLOOMING_ESSENCE = ITEMS.register("blooming_essence",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
public static RegistryObject<Item> ESSENCE_OF_THE_GLACIER = ITEMS.register("essence_of_the_glacier",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
public static RegistryObject<Item> ESSENCE_OF_THE_INFINITE_SANDS = ITEMS.register("essence_of_the_infinite_sands",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

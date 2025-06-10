package net.ariunbold.NeoForge1.item;

import net.ariunbold.NeoForge1.NeoForge1;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.awt.event.InputEvent;

public class ModItems {
    public static final DeferredRegister.Items ITEMS=DeferredRegister.createItems(NeoForge1.MOD_ID);

    public static final DeferredItem<Item> BISMUTH = ITEMS.register("bismuth",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

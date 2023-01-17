package net.scott.primalistmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab PRIMAL_TAB = new CreativeModeTab("primalisttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.VESKEL.get());
        }
    };
}

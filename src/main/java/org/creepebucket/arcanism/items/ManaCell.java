package org.creepebucket.arcanism.items;

import net.minecraft.world.item.Item;
import org.creepebucket.arcanism.registries.ModDataComponents;
import org.creepebucket.arcanism.utils.Mana;
import org.creepebucket.arcanism.utils.StoredMana;

public class ManaCell extends Item {

    public ManaCell(Properties properties, double each) {
        super(properties.component(ModDataComponents.MANA,
                new StoredMana(new Mana(), new Mana(each, each, each, each))));
    }
}

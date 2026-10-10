package org.creepebucket.arcanism.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.creepebucket.arcanism.items.ManaCell;
import org.creepebucket.arcanism.items.Wand;
import org.creepebucket.arcanism.items.WandItemPlaceholder;
import org.creepebucket.arcanism.spells.PackedSpell;

import static org.creepebucket.arcanism.Arcanism.MODID;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    // =====普通物品=====
    public static final DeferredItem<WandItemPlaceholder> WAND_ITEM_PLACEHOLDER =
            ITEMS.register("wand_item_placeholder", registryName -> new WandItemPlaceholder(  stackTo(64, registryName)));

    public static final DeferredItem<Wand> WAND =
            ITEMS.register("rg_alloy_wand",         registryName -> new Wand(                 stackTo(1, registryName), 1000, 5));

    public static final DeferredItem<PackedSpell> PACKED_SPELL =
            ITEMS.register("packed_spell",          registryName -> new PackedSpell(          stackTo(64, registryName)));

    // =====魔力单元=====
    public static final DeferredItem<ManaCell> MANA_CELL_SIZE_1 =
            ITEMS.register("mana_cell_size_1",      registryName -> new ManaCell(            stackTo(1, registryName), 8_000_000.0));

    public static final DeferredItem<ManaCell> MANA_CELL_SIZE_2 =
            ITEMS.register("mana_cell_size_2",      registryName -> new ManaCell(            stackTo(1, registryName), 64_000_000.0));

    public static final DeferredItem<ManaCell> MANA_CELL_SIZE_3 =
            ITEMS.register("mana_cell_size_3",      registryName -> new ManaCell(            stackTo(1, registryName), 512_000_000.0));

    public static final DeferredItem<ManaCell> MANA_CELL_SIZE_4 =
            ITEMS.register("mana_cell_size_4",      registryName -> new ManaCell(            stackTo(1, registryName), 4_096_000_000.0));

    public static final DeferredItem<ManaCell> MANA_CELL_SIZE_5 =
            ITEMS.register("mana_cell_size_5",      registryName -> new ManaCell(            stackTo(1, registryName), 32_768_000_000.0));

    // =====方块物品=====
    public static final DeferredItem<BlockItem> BASIC_MAMA_CONNECTOR_BLOCK_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.BASIC_MANA_CONNECTOR);

    public static final DeferredItem<BlockItem> HORIZONTAL_MANA_CONNECTOR_BLOCK_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.HORIZONTAL_MANA_CONNECTOR);

    public static final DeferredItem<BlockItem> VERTICAL_MANA_CONNECTOR_BLOCK_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.VERTICAL_MANA_CONNECTOR);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    // =====工具方法=====
    public static Item.Properties stackTo(int to, Identifier registryName) {
        return new Item.Properties().stacksTo(to).setId(ResourceKey.create(Registries.ITEM, registryName));
    }
}

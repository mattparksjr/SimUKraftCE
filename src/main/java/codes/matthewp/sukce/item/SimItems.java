package codes.matthewp.sukce.item;

import codes.matthewp.sukce.SimUKraftCE;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SimItems {

    public static DeferredRegister.Items ITEMS = DeferredRegister.createItems(SimUKraftCE.MODID);

    public static final DeferredItem<Item> FRIES = ITEMS.registerSimpleItem("fries", new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible().nutrition(1).saturationModifier(2f).build()));

    public static void register(IEventBus event) {
       SimUKraftCE.LOGGER.debug("Registering items...");
       ITEMS.register(event);
    }
}

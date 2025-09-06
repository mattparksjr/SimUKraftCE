/* (C) SimUCraftCE 2025 */
package codes.matthewp.sukce.event;

import codes.matthewp.sukce.SimServerConfig;
import codes.matthewp.sukce.SimUKraftCE;
import codes.matthewp.sukce.data.world.SimDataAttachments;
import codes.matthewp.sukce.item.SimItems;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;

@EventBusSubscriber(modid = SimUKraftCE.MODID)
public class PlayerJoin {

    @SubscribeEvent
    public static void onJoin(PlayerEvent.PlayerLoggedInEvent event) {
        if (!event.getEntity().hasData(SimDataAttachments.HAS_ORB) || !event.getEntity().getData(SimDataAttachments.HAS_ORB)) {
            if (SimServerConfig.GIVE_ORB_OF_CREATION.getAsBoolean()) {
                event.getEntity().setData(SimDataAttachments.HAS_ORB, Boolean.TRUE);
                event.getEntity().addItem(new ItemStack(SimItems.ORB_OF_CREATION.get()));
            }
        }
    }
}

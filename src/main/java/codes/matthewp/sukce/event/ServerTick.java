/* (C) SimUCraftCE 2025 */
package codes.matthewp.sukce.event;

import codes.matthewp.sukce.SimUKraftCE;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.ServerTickEvent;

@EventBusSubscriber(modid = SimUKraftCE.MODID)
public class ServerTick {

    @SubscribeEvent
    public static void onTick(ServerTickEvent.Pre event) {

    }
}

/* (C) SimUCraftCE 2025 */
package codes.matthewp.sukce.event;

import codes.matthewp.sukce.SimUKraftCE;
import codes.matthewp.sukce.data.SimSavedData;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.server.ServerStartedEvent;

@EventBusSubscriber(modid = SimUKraftCE.MODID)
public class ServerStart {

    @SubscribeEvent
    public static void onServerStart(ServerStartedEvent event) {
        SimSavedData.get(event.getServer());
    }
}

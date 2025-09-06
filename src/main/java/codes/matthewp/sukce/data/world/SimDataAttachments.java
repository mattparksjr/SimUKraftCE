/* (C) SimUCraftCE 2025 */
package codes.matthewp.sukce.data.world;

import codes.matthewp.sukce.SimUKraftCE;
import com.mojang.serialization.Codec;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class SimDataAttachments {

    private static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, SimUKraftCE.MODID);

    public static final Supplier<AttachmentType<Boolean>> HAS_ORB = ATTACHMENT_TYPES.register(
            "has_orb", () -> AttachmentType.builder(() -> false).serialize(Codec.BOOL).build());

    public static void register(IEventBus eventBus) {
        ATTACHMENT_TYPES.register(eventBus);
    }
}

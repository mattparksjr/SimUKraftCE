/* (C) SimUCraftCE 2025 */
package codes.matthewp.sukce.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class OrbOfCreationItem extends Item {

    public OrbOfCreationItem() {
        super(new Properties());
    }

    @Override
    public boolean isFoil(@NotNull ItemStack stack) {
        return true;
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level level, @NotNull Player player, @NotNull InteractionHand usedHand) {

        if (!level.isClientSide()) {
            player.sendSystemMessage(Component.literal("LEVEL IS SERVER"));
        }
        return super.use(level, player, usedHand);
    }
}

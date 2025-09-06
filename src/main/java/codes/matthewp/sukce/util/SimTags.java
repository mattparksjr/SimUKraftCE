/* (C) SimUCraftCE 2025 */
package codes.matthewp.sukce.util;

import codes.matthewp.sukce.SimUKraftCE;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class SimTags {

    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(SimUKraftCE.MODID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> FOLK_CAN_EAT = createTag("folk_editable");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(SimUKraftCE.MODID, name));
        }
    }
}

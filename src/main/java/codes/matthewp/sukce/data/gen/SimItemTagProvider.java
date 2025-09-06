/* (C) SimUCraftCE 2025 */
package codes.matthewp.sukce.data.gen;

import codes.matthewp.sukce.SimUKraftCE;
import codes.matthewp.sukce.item.SimItems;
import codes.matthewp.sukce.util.SimTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class SimItemTagProvider extends ItemTagsProvider {

    public SimItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, SimUKraftCE.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(SimTags.Items.FOLK_CAN_EAT).add(SimItems.FRIES.get());
    }
}

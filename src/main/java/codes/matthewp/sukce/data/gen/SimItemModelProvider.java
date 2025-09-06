/* (C) SimUCraftCE 2025 */
package codes.matthewp.sukce.data.gen;

import codes.matthewp.sukce.SimUKraftCE;
import codes.matthewp.sukce.item.SimItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class SimItemModelProvider extends ItemModelProvider {

    public SimItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SimUKraftCE.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(SimItems.FRIES.get());
        basicItem(SimItems.ORB_OF_CREATION.get());
    }
}

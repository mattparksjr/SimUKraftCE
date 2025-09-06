/* (C) SimUCraftCE 2025 */
package codes.matthewp.sukce.data.gen;

import codes.matthewp.sukce.SimUKraftCE;
import codes.matthewp.sukce.item.SimItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class SimLangProvider extends LanguageProvider {

    public SimLangProvider(PackOutput output) {
        super(output, SimUKraftCE.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addItem(SimItems.FRIES, "Fries");
        addItem(SimItems.ORB_OF_CREATION, "Orb of Creation");
        add("simukraftce.configuration.title", "SimUKraftCE");

    }
}

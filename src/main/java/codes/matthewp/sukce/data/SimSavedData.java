/* (C) SimUCraftCE 2025 */
package codes.matthewp.sukce.data;

import codes.matthewp.sukce.SimUKraftCE;
import codes.matthewp.sukce.data.type.Team;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.saveddata.SavedData;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;

public class SimSavedData extends SavedData {

    private static final String DATA_NAME = SimUKraftCE.MODID;
    public static List<Team> teams;
    public boolean setupComplete = false;

    public static SimSavedData get(MinecraftServer server) {
        ServerLevel overworld = server.getLevel(Level.OVERWORLD);
        return Objects.requireNonNull(overworld).getDataStorage().computeIfAbsent(new Factory<>(SimSavedData::new, SimSavedData::load), DATA_NAME);
    }

    public static SimSavedData load(CompoundTag tag, HolderLookup.Provider lookupProvider) {
        SimSavedData data = new SimSavedData();

        data.setupComplete = tag.getBoolean("setupComplete");

        List<String> teamsIdList = tag.getAllKeys().stream().filter(s -> s.trim().matches("[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}")).toList();

        for (String teamID : teamsIdList) {
            teams.add(Team.loadFromTag(teamID, tag.getCompound(teamID)));
        }

        return data;
    }

    @Override
    public @NotNull CompoundTag save(@NotNull CompoundTag tag, HolderLookup.@NotNull Provider provider) {
        tag.putBoolean("setupComplete", setupComplete);

        CompoundTag teamsTag = new CompoundTag();

        for (Team team : teams) {
            teamsTag.put(team.id.toString(), team.writeToTag());
        }

        tag.put("teams", teamsTag);

        return tag;
    }

    public void setSetupComplete(boolean setupComplete) {
        this.setupComplete = setupComplete;
        setDirty();
    }
}

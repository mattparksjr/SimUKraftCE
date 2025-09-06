/* (C) SimUCraftCE 2025 */
package codes.matthewp.sukce.data.type;

import net.minecraft.nbt.CompoundTag;

import java.util.List;
import java.util.UUID;

public class Team {

    public UUID id;
    public String name;
    public double balance;
    public UUID owner;
    public List<UUID> members;

    public static Team loadFromTag(String id, CompoundTag tag) {
        Team team = new Team();

        return team;
    }

    public CompoundTag writeToTag() {
        CompoundTag tag = new CompoundTag();

        tag.putDouble("balance", balance);
        tag.putString("name", name);
        tag.putUUID("owner", owner);
        tag.putInt("membercount", members.size());
        for (int i = 0; i < members.size(); i++) {
            tag.putUUID("members." + i, members.get(i));
        }

        return tag;
    }
}

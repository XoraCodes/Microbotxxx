package net.runelite.client.plugins.questhelper.requirements.player;


import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.runelite.client.plugins.questhelper.requirements.AbstractRequirement;

import javax.annotation.Nonnull;

public class PrayerPointRequirement extends AbstractRequirement {
    private final int level;

    public PrayerPointRequirement(int level) {
        this.level = level;
    }


    @Override
    public boolean check(Client client) {
        return client.getBoostedSkillLevel(Skill.PRAYER) >= level;
    }

    @Nonnull
    @Override
    public String getDisplayText() {
        return level + " prayer points";
    }
}

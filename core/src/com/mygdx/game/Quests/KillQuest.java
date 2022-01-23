package com.mygdx.game.Quests;

import com.mygdx.game.Components.Pirate;
import com.mygdx.game.Entitys.Entity;
import com.mygdx.game.Entitys.Player;

public class KillQuest extends Quest {
    private Pirate target;

    public KillQuest() {
        super();
        name = "Kill the college";
        description = "KILL KILL KILL";
        reward = 100;
        target = null;
    }

    public KillQuest(Pirate target) {
        this();
        this.target = target;
    }

    public KillQuest(Entity target) {
        this(target.getComponent(Pirate.class));
    }

    @Override
    public boolean checkCompleted(Player p) {
        isCompleted = !target.isAlive();
        return isCompleted;
    }
}

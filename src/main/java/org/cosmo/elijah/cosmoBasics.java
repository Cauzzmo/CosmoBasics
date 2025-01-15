package org.cosmo.elijah;

import org.bukkit.plugin.java.JavaPlugin;
import org.cosmo.elijah.commands.*;

public final class cosmoBasics extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("setSpawn").setExecutor(new setSpawn());
        this.getCommand("fly").setExecutor(new setFly());
        this.getCommand("heal").setExecutor(new heal());
        this.getCommand("cleanse").setExecutor(new cleanse());
        this.getCommand("suicide").setExecutor(new suicide());
        this.getCommand("kill").setExecutor(new kill());
        this.getCommand("teleport").setExecutor(new teleport());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

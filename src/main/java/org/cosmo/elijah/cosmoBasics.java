package org.cosmo.elijah;

import org.bukkit.plugin.java.JavaPlugin;
import org.cosmo.elijah.commands.setFly;
import org.cosmo.elijah.commands.setSpawn;

public final class cosmoBasics extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("setSpawn").setExecutor(new setSpawn());
        this.getCommand("fly").setExecutor(new setFly());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

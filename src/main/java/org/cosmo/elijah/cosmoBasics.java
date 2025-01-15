package org.cosmo.elijah;

import org.bukkit.plugin.java.JavaPlugin;
import org.cosmo.elijah.commands.cleanse;
import org.cosmo.elijah.commands.heal;
import org.cosmo.elijah.commands.setFly;
import org.cosmo.elijah.commands.setSpawn;

public final class cosmoBasics extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("setSpawn").setExecutor(new setSpawn());
        this.getCommand("fly").setExecutor(new setFly());
        this.getCommand("heal").setExecutor(new heal());
        this.getCommand("cleanse").setExecutor(new cleanse());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

package org.cosmo.elijah.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class setSpawn implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;

            String world = player.getWorld().getName();

            Location newSpawn = player.getLocation();

            Location worldSpawn = Bukkit.getWorld(world).getSpawnLocation();

            worldSpawn = newSpawn;

            return true;
        }

        else if (sender instanceof ConsoleCommandSender) {

            ConsoleCommandSender console = Bukkit.getConsoleSender();

            sender.sendMessage("This command can not be used from the console.");

            return true;
        }
        return false;
    }

}

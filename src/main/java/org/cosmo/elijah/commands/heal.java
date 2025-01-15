package org.cosmo.elijah.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class heal implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0) {

            Player player = (Player) sender;

            player.setHealth(20);

            return true;
        }
        if (args.length == 1) {

            Player player = Bukkit.getPlayer(args[0]);

            if (player != null) {
                player.setHealth(20);
                return true;

            }
            else {
                sender.sendMessage("Player does not exist!");
                return false;
            }

        }

        return false;
    }
}

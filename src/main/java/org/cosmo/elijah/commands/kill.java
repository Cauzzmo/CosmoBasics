package org.cosmo.elijah.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class kill implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0) {
            sender.sendMessage("Not enough arguments to execute command");

            return true;
        }
        if (args.length == 1) {

            Player player = Bukkit.getPlayer(args[0]);

            if (player != null) {
                player.damage(100);
                return true;
            }
            else {
                sender.sendMessage("This player does not exist!");
                return true;
            }

        }
        else {
            sender.sendMessage("You did something wrong here!");
            return false;
        }

    }
}

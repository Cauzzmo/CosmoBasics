package org.cosmo.elijah.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class teleport implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0) {
            sender.sendMessage("Not enough arguments to execute command");
            return true;
        }

        if (args.length == 1) {

            Player player = (Player) sender;

            Player target = Bukkit.getPlayer(args[0]);

            if (target != null) {

                Location targetLoc = target.getLocation();

                player.teleport(targetLoc);

                return true;
            }
            else {
                sender.sendMessage("This player does not exist!");
                return true;
            }

        }

        if (args.length == 2) {

            Player movedPlayer = Bukkit.getPlayer(args[0]);
            Player targetPlayer = Bukkit.getPlayer(args[1]);

            if (movedPlayer != null && targetPlayer != null) {

                Location targetLoc = targetPlayer.getLocation();

                movedPlayer.teleport(targetLoc);

                return true;
            }

        }
        else {
            sender.sendMessage("You did something wrong here!");
            return true;
        }

        return false;
    }
}

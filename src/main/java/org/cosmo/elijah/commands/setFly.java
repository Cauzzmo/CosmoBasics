package org.cosmo.elijah.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class setFly implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0) {

            Player player = (Player) sender;

            boolean canFly = player.getAllowFlight();

            if (canFly) {
                player.setFlying(false);
                return true;
            }
            else {
                player.setFlying(false);
                return true;
            }

        }

        if (args.length == 1) {

            Player player = Bukkit.getPlayer(args[0]);

            if (player != null) {

                boolean canFly = player.getAllowFlight();

                if (canFly) {
                    player.setFlying(false);
                    return true;
                }
                else {
                    player.setFlying(true);
                    return true;
                }

            }
            else {
                sender.sendMessage("This player cannot be found!");
                return false;
            }


        }

        return false;
    }

}

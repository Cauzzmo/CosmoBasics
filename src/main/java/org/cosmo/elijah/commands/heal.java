package org.cosmo.elijah.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class heal implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0) {

            if (sender instanceof ConsoleCommandSender) {
                sender.sendMessage("Only players can execute this command without arguments!");
                return true;
            }
            else {
                Player player = (Player) sender;

                player.setHealth(20);

                return true;
            }
        }
        if (args.length == 1) {

            Player player = Bukkit.getPlayer(args[0]);

            if (player != null) {
                player.setHealth(20);
                return true;

            }
            else {
                sender.sendMessage("Player does not exist!");
                return true;
            }

        }

        return false;
    }
}

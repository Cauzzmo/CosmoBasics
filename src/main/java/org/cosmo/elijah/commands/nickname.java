package org.cosmo.elijah.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class nickname implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof ConsoleCommandSender) {
            sender.sendMessage("Only players can execute this command!");
            return true;
        }

        if (args.length != 1) {
            sender.sendMessage("Not enough arguments to execute this command!");
            return true;
        }
        else {

            Player player = (Player) sender;

            String name = player.getDisplayName();

            player.setDisplayName(args[0]);

            return true;
        }


    }

}
package org.cosmo.elijah.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class setName implements CommandExecutor {

    @Override
    public boolean onCommand (CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof ConsoleCommandSender) {
            sender.sendMessage("Only players can use this command");
            return true;
        }

        if (args.length != 1) {
            sender.sendMessage("Too many or not enough arguments!");
            return true;
        }
        else {

            Player player = (Player) sender;

            if (player.getItemInUse() != null) {

                ItemStack item = player.getItemInUse();
                ItemMeta meta = item.getItemMeta();

                meta.setDisplayName(args[0]);

            }
            else {
                sender.sendMessage("You must have an item in hand to use this command!");
                return true;
            }

        }

        return false;
    }

}

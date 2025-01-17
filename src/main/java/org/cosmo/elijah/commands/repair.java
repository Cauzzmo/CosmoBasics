package org.cosmo.elijah.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class repair implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof ConsoleCommandSender) {

            sender.sendMessage("Only players can execute this command");
            return true;
        }
        else {

            Player player = (Player) sender;

            ItemStack item = player.getItemInUse();

            if (item != null) {

                Material mat = item.getType();

                short maxDur = mat.getMaxDurability();

                item.setDurability(maxDur);

                return true;
            }
            else {
                sender.sendMessage("No item in hand!");
                return true;
            }

        }


    }

}

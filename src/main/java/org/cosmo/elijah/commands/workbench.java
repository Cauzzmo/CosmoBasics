package org.cosmo.elijah.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.Inventory;

public class workbench implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof ConsoleCommandSender){
            sender.sendMessage("Only players can execute this command");
            return true;
        }
        else {
            Player player = (Player) sender;


            Inventory workbench = Bukkit.createInventory(player, InventoryType.WORKBENCH);

            player.openInventory(workbench);

            return true;
        }

    }
}

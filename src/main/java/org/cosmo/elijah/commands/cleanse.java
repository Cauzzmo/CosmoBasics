package org.cosmo.elijah.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;

import java.util.Collection;

public class cleanse implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0) {

            Player player = (Player) sender;

            for (PotionEffect effect : player.getActivePotionEffects())
                player.removePotionEffect(effect.getType());

            return true;
        }

        if (args.length == 1) {

            Player player = Bukkit.getPlayer(args[0]);

            if (player != null) {

                for (PotionEffect effect : player.getActivePotionEffects())
                    player.removePotionEffect(effect.getType());

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

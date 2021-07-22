package me.einzluis.spigotmccommands.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Eat implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // Checks if the sender is a player
        if(sender instanceof Player){
            Player player = (Player) sender;
            // Sets the player hunger to full
            player.setFoodLevel(20);
            player.sendMessage(ChatColor.GREEN + "Restored hunger successfully");
        }else{
            // Prints out this message in the console if the sender is not a player
            System.out.println("You need to be a player to execute this command.");
        }

        return false;
    }
}

package me.ComputerCon.Firelight.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Connor on 6/30/2015.
 */
public class Holograms implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getLabel().equalsIgnoreCase("hologram")) {
            if (sender instanceof Player) {
                Player p = (Player) sender;
                if (p.hasPermission("firelight.hologram")) {
                 //   if (args.length <)
                }
            }
        }

        return true;
    }
}

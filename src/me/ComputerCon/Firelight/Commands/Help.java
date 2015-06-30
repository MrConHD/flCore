package me.ComputerCon.Firelight.Commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Connor on 6/25/2015.
 */
public class Help implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getLabel().equalsIgnoreCase("help")) {
            if (sender instanceof Player) {
                Player p = (Player) sender;
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', "\n" +
                        "&c&lFirelight&4&lMC &r&7» &e&lHELP\n" +
                        "&8============================\n" +
                        "&6Welcome to &4Firelight&cMC&6! Below are a list of useful commands; check them out for yourself!\n" +
                        "&c/list &8| &4!! &c&lCOMING SOON &4!!\n" + //&bThis command lists all online Team Members by rank!
                        "&c/report &8| &4!! &c&lCOMING SOON &4!!\n" + //&bThis command will report a player to any online staff member!
                        "&c/server &8| &4!! &c&lCOMING SOON &4!!\n" + //&bThis command will list all servers you are able to connect to!
                        "&c/website &8| &4!! &c&lCOMING SOON &4!!\n" + //  &bThis command will send you a link to the servers' website!
                        "&c/friend &8| &4!! &c&lCOMING SOON &4!!\n" +
                        "&c/stats &8| &4!! &c&lCOMING SOON &4!!\n" +
                        "&c/history &8| &4!! &c&lCOMING SOON &4!!" + //&bThis command will show your punishment history!
                        "\n"));
            }
        }

        return true;
    }
}

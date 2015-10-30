package me.ComputerCon.Firelight.flHub;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

/**
 * Created by Connor on 6/29/2015.
 */
public class ServerSelector implements Listener {

    public Inventory serverselector = Bukkit.createInventory(null, 27, ChatColor.translateAlternateColorCodes('&', "&c&lFirelight&6&lMC"));

    public void openSS(Player p) {
        ItemStack factions = new ItemStack(Material.CHEST);
        ItemMeta fMeta = factions.getItemMeta();
        fMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "Factions"));
        fMeta.setLore(Arrays.asList("COMING SOON"));
        factions.setItemMeta(fMeta);

        // TODO: Animate Title and Scoreboard
        


    }


    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getInventory().equals("&c&lFirelight&6&lMC &7» &eSERVER SELECTOR")) {

        }
    }

}

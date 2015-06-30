package me.ComputerCon.Firelight.flHub;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

/**
 * Created by Connor on 6/25/2015.
 */
public class OnJoinItems implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        ItemStack skull = new ItemStack(397, 1, (short) 3);
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        skullMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c&lFirelight&6&lMC &8- &e&lPLAYER"));
        skullMeta.setOwner(p.toString());
        skull.setItemMeta(skullMeta);

       ItemStack navigator = new ItemStack(Material.BLAZE_POWDER);
       ItemMeta nMeta = navigator.getItemMeta();
       nMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c&lFirelight&6&lMC &8- &e&lNAVIGATION"));
       navigator.setItemMeta(nMeta);

        ItemStack book = new ItemStack(Material.ENCHANTED_BOOK);
        ItemMeta bMeta = book.getItemMeta();
        bMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c&lFirelight&6&lMC &8- &e&lINFORMATION"));
        book.setItemMeta(bMeta);

       p.getInventory().setItem(0, skull);
       p.getInventory().setItem(4, navigator);
       p.getInventory().setItem(8, book);
    }

}

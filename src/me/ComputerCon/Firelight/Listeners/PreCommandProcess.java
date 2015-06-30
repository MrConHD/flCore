package me.ComputerCon.Firelight.Listeners;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

/**
 * Created by Connor on 6/29/2015.
 */
public class PreCommandProcess implements Listener{

    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent e) {
        if (e.getMessage().equals("/pl") || e.getMessage().equals("/?") || e.getMessage().equals("/about")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&cFirelight&6MC&8] &eFirelight was developed by &6&oMrConHD"));
            return;
        }
    }
}

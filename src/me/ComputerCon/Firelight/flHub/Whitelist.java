package me.ComputerCon.Firelight.flHub;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

/**
 * Created by Connor on 6/30/2015.
 */
public class Whitelist implements Listener {

    @EventHandler
    public void onLogin(PlayerLoginEvent e) {
        Player p = e.getPlayer();
        if (e.getResult() == PlayerLoginEvent.Result.KICK_WHITELIST && !e.getPlayer().isWhitelisted()) {
            e.setKickMessage(ChatColor.translateAlternateColorCodes('&', "&4&l✘ &c&lFirelight&6&lMC currently &8&l» &b&lWHITELISTED &8&l« &4&l✘"));
           // e.setKickMessage(ChatColor.translateAlternateColorCodes('&', SettingsManager.getSettingsManager().getConfig().getString("whitelistmsg")));
        }
        if (e.getResult() == PlayerLoginEvent.Result.KICK_FULL) {

           // e.setKickMessage(ChatColor.translateAlternateColorCodes('&', SettingsManager.getSettingsManager().getConfig().getString("fullmsg")));
        }
    }
}

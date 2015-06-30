package me.ComputerCon.Firelight.flHub;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 * Created by Connor on 6/29/2015.
 */
public class OnInteract implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        if (e.getAction() == Action.LEFT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.LEFT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (e.getItem().getType() == Material.BLAZE_POWDER) {

            }
        }
    }
}

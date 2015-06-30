package me.ComputerCon.Firelight.Listeners;

import me.ComputerCon.Firelight.flScoreboard.HubBoard;
import net.md_5.bungee.api.ChatColor;
import net.minecraft.server.v1_8_R1.*;
import org.bukkit.craftbukkit.v1_8_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.lang.reflect.Field;

/**
 * Created by Connor on 6/19/2015.
 */
public class OnJoin implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        HubBoard.boardSetup(e.getPlayer());
        PacketPlayOutTitle times = new PacketPlayOutTitle(20, 60, 30); //The time the title is displayed in ticks
        PacketPlayOutTitle title = new PacketPlayOutTitle(EnumTitleAction.TITLE, ChatSerializer.a("\"§6Welcome to §4Firelight§cMC\""));
        PacketPlayOutTitle subtitle = new PacketPlayOutTitle(EnumTitleAction.SUBTITLE, ChatSerializer.a("\"§cCurrently §6PRE-ALPHA\""));
        for(Packet packet : new Packet[] {times, title, subtitle}) {
            ((CraftPlayer)e.getPlayer()).getHandle().playerConnection.sendPacket(packet);
        }
        PacketPlayOutPlayerListHeaderFooter headerfooter = new PacketPlayOutPlayerListHeaderFooter();
        try {
            Field header = headerfooter.getClass().getDeclaredField("a");
            Field footer = headerfooter.getClass().getDeclaredField("b");
            header.setAccessible(true);
            footer.setAccessible(true);
            header.set(headerfooter, ChatSerializer.a("\"§8» §c§lFirelight§6§lMC §8- §eHUB §8«\""));
            footer.set(headerfooter, ChatSerializer.a("\"§6play.firelightmc.net\""));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        ((CraftPlayer) e.getPlayer()).getHandle().playerConnection.sendPacket(headerfooter);


    }
}

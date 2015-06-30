package me.ComputerCon.Firelight.flScoreboard;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

/**
 * Created by Connor on 6/19/2015.
 */
public class HubBoard {

    HubBoard board = new HubBoard();

    public static void boardSetup(Player p) {

        ScoreboardManager man = Bukkit.getScoreboardManager();
        Scoreboard hub = man.getNewScoreboard();

        Objective obj = hub.registerNewObjective("Hub", "dummy");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        obj.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4» &c&lFirelight&6&lMC &4«"));

        Score rank = obj.getScore(ChatColor.translateAlternateColorCodes('&', "&cRank &f»"));
        rank.setScore(1);

        Score rank2 = obj.getScore(ChatColor.translateAlternateColorCodes('&', "    &6&lOWNER"));
        rank2.setScore(0);

        p.setScoreboard(hub);
    }


}

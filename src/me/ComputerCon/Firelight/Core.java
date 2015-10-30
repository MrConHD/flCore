package me.ComputerCon.Firelight;

import me.ComputerCon.Firelight.Commands.Help;
import me.ComputerCon.Firelight.flHub.OnInteract;
import me.ComputerCon.Firelight.flHub.OnJoinItems;
import me.ComputerCon.Firelight.Listeners.PreCommandProcess;
import me.ComputerCon.Firelight.Listeners.OnJoin;
import me.ComputerCon.Firelight.flHub.ServerSelector;
import me.ComputerCon.Firelight.flHub.Whitelist;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scoreboard.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Connor on 2/25/2015.
 */
public class Core extends JavaPlugin implements Listener {

    static ScoreboardManager man = Bukkit.getScoreboardManager();
    static Scoreboard hub = man.getNewScoreboard();
    static Objective obj = hub.registerNewObjective("Firelight", "dummy");



    public static List<String> title = new ArrayList<String>(); {
        title.add("§4§lFirelight§6§lMC");
        title.add("§4F§lirelightMC§6§lMC");
        title.add("§4Fi§lrelightMC§6§lMC");
        title.add("§4Fir§lelight§6§lMC");
        title.add("§4Fire§llight§6§lMC");
        title.add("§4Firel§light§6§lMC");
        title.add("§4Fireli§lght§6§lMC");
        title.add("§4Firelig§lht§6§lMC");
        title.add("§4Fireligh§lt§6§lMC");
        title.add("§4Firelight§6§lMC");
        title.add("§4Firelight§6M§lC");
    }


    public static void boardSetup(Player p) {

        obj.setDisplaySlot(DisplaySlot.SIDEBAR);

        Score rank = obj.getScore(ChatColor.translateAlternateColorCodes('&', "&cRank &f»"));
        rank.setScore(1);

        Score rank2 = obj.getScore(ChatColor.translateAlternateColorCodes('&', "    &6&lOWNER"));
        rank2.setScore(0);

        p.setScoreboard(hub);
    }


    public void onEnable() {

        BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
        scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
            @Override
            public void run() {
                String s = "§eWelcome";
                int buffer = 5;
                for (int index = 0; index <= s.length(); index++) {
                    String towrite = s.substring(index ,index + buffer + 1);
                    obj.setDisplayName(towrite);
                }
            }
        }, 0L, 20L);

        SettingsManager.getSettingsManager().setup(this);
        this.getServer().getPluginManager().registerEvents(new OnJoin(), this);
        this.getServer().getPluginManager().registerEvents(new OnJoinItems(), this);
        this.getServer().getPluginCommand("help").setExecutor(new Help());
        this.getServer().getPluginManager().registerEvents(new PreCommandProcess(), this);
        this.getServer().getPluginManager().registerEvents(new ServerSelector(), this);
        this.getServer().getPluginManager().registerEvents(new OnInteract(), this);
        this.getServer().getPluginManager().registerEvents(new Whitelist(), this);
        saveDefaultConfig();
    }

    public void onDisable() {

    }


}

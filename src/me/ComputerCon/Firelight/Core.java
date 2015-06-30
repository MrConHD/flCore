package me.ComputerCon.Firelight;

import me.ComputerCon.Firelight.Commands.Help;
import me.ComputerCon.Firelight.flHub.OnInteract;
import me.ComputerCon.Firelight.flHub.OnJoinItems;
import me.ComputerCon.Firelight.Listeners.PreCommandProcess;
import me.ComputerCon.Firelight.Listeners.OnJoin;
import me.ComputerCon.Firelight.flHub.ServerSelector;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Connor on 2/25/2015.
 */
public class Core extends JavaPlugin implements Listener {


    public void onEnable() {
        SettingsManager.getSettingsManager().setup(this);
        this.getServer().getPluginManager().registerEvents(new OnJoin(), this);
        this.getServer().getPluginManager().registerEvents(new OnJoinItems(), this);
        this.getServer().getPluginCommand("help").setExecutor(new Help());
        this.getServer().getPluginManager().registerEvents(new PreCommandProcess(), this);
        this.getServer().getPluginManager().registerEvents(new ServerSelector(), this);
        this.getServer().getPluginManager().registerEvents(new OnInteract(), this);
    }

    public void onDisable() {

    }


}

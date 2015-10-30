package me.ComputerCon.Firelight;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Connor on 6/25/2015.
 */
public class SettingsManager {

    private SettingsManager() {}
    private static SettingsManager instance = new SettingsManager();

    public static SettingsManager getSettingsManager()
    {
            return instance;
    }
    private Plugin p;
    private FileConfiguration config;
    private File cfile;

    public void setup(Plugin p) {
        config = p.getConfig();
        config.options().copyDefaults(true);
        cfile = new File(p.getDataFolder(), "config.yml");
        saveConfig();
    }

    public FileConfiguration getConfig() {
        return config;
    }

    public void saveConfig() {
        try {
            config.save(cfile);
        }
        catch (IOException e) {
            Bukkit.getServer().getLogger().severe(ChatColor.RED + "Could not save config.yml!");
        }
    }

    public void addPerm(String p, String perm) {
        p = p.toLowerCase();
        if (!config.contains("perms." + p)) config.set("perms." + p, new ArrayList<String>());

        List<String> perms= config.getStringList("perms." + p);
        perms.add(perm);
        config.set("perms." + p, perm);
    }

    public void reloadConfig() {
        config = YamlConfiguration.loadConfiguration(cfile);
    }

    public PluginDescriptionFile getDesc() {
        return p.getDescription();
    }
}

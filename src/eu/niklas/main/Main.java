package eu.niklas.main;
// Package: eu.niklas.main
// Date: 08.02.2021
// Class: Main
// Date: 08.02.2021
// Coded by Niklas / Devserver


import eu.niklas.listener.onQuit;
import eu.niklas.listener.onSurvival;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
//
public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new onSurvival(), this);
        Bukkit.getPluginManager().registerEvents(new onQuit(), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}

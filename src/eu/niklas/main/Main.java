package eu.niklas.main;
// Package: eu.niklas.main
// Date: 08.02.2021
// Class: Main
// Date: 08.02.2021
// Coded by Niklas / Devserver


import eu.niklas.listener.onJoin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new onJoin(),this);

    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}

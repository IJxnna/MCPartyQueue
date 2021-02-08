package eu.niklas.listener;
// Package: eu.niklas.listener
// Date: 08.02.2021
// Class: onQuit
// Date: 08.02.2021
// Coded by Niklas / Devserver


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class onQuit implements Listener

{


    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        if(onSurvival.queue.contains(e.getPlayer())) {
            onSurvival.queue.remove(e.getPlayer());
        }

    }


}

package eu.niklas.listener;
// Package: eu.niklas.listener
// Date: 08.02.2021
// Class: onSurvival
// Date: 08.02.2021
// Coded by Niklas / Devserver


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.util.ArrayList;

public class onSurvival implements Listener {

    @EventHandler
    public void onExecute(PlayerCommandPreprocessEvent e) {
        if (e.getMessage().toLowerCase().startsWith("/server prison")) {
            ArrayList<Player> queue = new ArrayList<Player>();
            Player p = e.getPlayer();

            if (p.hasPermission("MCPartyQueue.Bypass")) {
                e.setCancelled(false);
                p.sendMessage("&8&l[&5&lQueue&8&l] &6You have bypassed the queue because of your rank!");

            } else {
                if (queue.contains(p)) {
                    if (queue.get(0) == p) {
                        queue.remove(p);
                        e.setCancelled(false);
                        p.sendMessage("&8&l[&5&lQueue&8&l] &6You joined the server!! Welcome. &7If you have any questions, read &l/help &7or ask staff**");


                    } else if (queue.get(1) == p) {
                        queue.remove(p);
                        e.setCancelled(false);
                        p.sendMessage("&8&l[&5&lQueue&8&l] &6You joined the server!! Welcome. &7If you have any questions, read &l/help &7or ask staff**");

                    } else if (queue.get(2) == p) {
                        queue.remove(p);
                        e.setCancelled(false);
                        p.sendMessage("&8&l[&5&lQueue&8&l] &6You joined the server!! Welcome. &7If you have any questions, read &l/help &7or ask staff**");

                    } else {

                        int pos = 0;

                        for (int i = 0; i < queue.size(); i++) {
                            if (queue.get(i) == p) {
                                pos = i;
                            }
                        }

                        p.sendMessage("&8&l[&5&lQueue&8&l] &6You are in the queue! The position you are in is: §f" + pos + "§7. Want to bypass this? Simply purchase a rank " +
                                "through" +
                                " " +
                                "&5/buy&7!");
                        e.setCancelled(true);
                    }


                } else {
                    queue.add(p);
                    int pos = 0;

                    for (int i = 0; i < queue.size(); i++) {
                        if (queue.get(i) == p) {
                            pos = i;
                        }
                    }

                    p.sendMessage("&8&l[&5&lQueue&8&l] &6You've been put in the Queue. The position you are in is: §f" + pos + "§7. Want to bypass this? Simply purchase a rank " +
                            "through" +
                            " " +
                            "&5/buy&7!");
                    e.setCancelled(true);


                }


            }


        }

    }


}

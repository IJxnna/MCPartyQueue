package eu.niklas.listener;
// Package: eu.niklas.listener
// Date: 08.02.2021
// Class: onJoin
// Date: 08.02.2021
// Coded by Niklas / Devserver


import eu.niklas.main.ActionBarUtil;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.ArrayList;

public class onJoin implements Listener {

    ArrayList<Player> queue = new ArrayList<Player>();
//

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        if (p.hasPermission("MCPartyQueue.bypass")) {
            p.sendMessage("&8&l[&5&lQueue&8&l] &6You have bypassed the queue because of your rank!".replace("&", "§"));
        } else {
            if (queue.contains(p)) {
                if (queue.get(0) == p) {
                    queue.remove(p);
                } else if (queue.get(1) == p) {
                    queue.remove(p);
                } else if (queue.get(2) == p) {
                    queue.remove(p);
                } else {
                    int pos = 0;
                    for (int i = 0; i < queue.size(); i++) {
                        if (queue.get(i) == p) {
                            pos = i;
                        }
                    }
                    ActionBarUtil.sendActionBarMessage(p, "&5You are in position &f" + pos + "&6/&fx&7".replace("&", "§"));
                    p.kickPlayer("&8&l[&5&lQueue&8&l] &6You are in the queue! The position you are in is: &f" + "" + " &7. Want to bypass this? Simply purchase a rank " +
                            "through" +
                            " &5/buy&7!".replace("&", "§"));
                }
            } else {
                int pos = 0;
                queue.add(p);
                for (int i = 0; i < queue.size(); i++) {
                    if (queue.get(i) == p) {
                        pos = i;
                    }
                }
                ActionBarUtil.sendActionBarMessage(p, "&5You are in position &f" + pos + "&6/&fx&7".replace("&", "§"));
                p.kickPlayer("&8&l[&5&lQueue&8&l] &6You are in the queue! The position you are in is: &f" + "" + " &7. Want to bypass this? Simply purchase a rank " +
                        "through" +
                        " &5/buy&7!".replace("&", "§"));
            }

        }


    }


}

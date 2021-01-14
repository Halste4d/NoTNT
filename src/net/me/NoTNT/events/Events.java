package net.me.NoTNT.events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class Events implements Listener {
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Player p = event.getPlayer();
        Block block = (Block) event.getBlockPlaced();
        if(block.getType() == Material.TNT) {
            event.setCancelled(true);
            p.sendMessage("§c[NoTNT] It's not allowed to put TNT here.");
        }
    }
}

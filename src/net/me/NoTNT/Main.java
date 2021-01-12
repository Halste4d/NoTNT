package net.me.NoTNT;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import net.me.NoTNT.events.Events;

public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§4[NoTNT] ON");
        getServer().getPluginManager().registerEvents(new Events(), this);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§4[NoTNT] OFF");
    }

}
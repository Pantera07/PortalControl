package dev.pantera07.portalcontrol;

import org.bukkit.plugin.java.JavaPlugin;

import dev.pantera07.portalcontrol.listeners.EntityPortalListener;

public class PortalControl extends JavaPlugin {
    
    @Override
    public void onEnable () {
        // Register the portalcontrol listener
        this.getServer().getPluginManager().registerEvents(new EntityPortalListener(), this);
    }
}
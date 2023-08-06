package dev.pantera07.portalcontrol.listeners;

import org.bukkit.entity.Ghast;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPortalEvent;

import dev.pantera07.portalcontrol.PortalControl;

public class EntityPortalListener implements Listener {
    @EventHandler
    public void on(final EntityPortalEvent event) {
        if (event.getEntity() instanceof Ghast) event.setCancelled(true);
    }
}
package dev.pantera07.portalcontrol.listeners;

import org.bukkit.entity.Ghast;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import io.papermc.paper.event.entity.EntityPortalReadyEvent;

import dev.pantera07.portalcontrol.PortalControl;

public class EntityPortalListener implements Listener {
    @EventHandler
    public void on(final EntityPortalReadyEvent event) {
        if (event.getEntity() instanceof Ghast) event.setCancelled(true);
    }
}
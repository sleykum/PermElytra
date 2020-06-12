package me.simkon.permelytra;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityToggleGlideEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class MoveListener implements Listener {
	
	
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent e) {
		e.getPlayer().setGliding(true);
	}
	
	@EventHandler
	public void onCancelGlideEvent(EntityToggleGlideEvent e) {
		if(e.getEntity() instanceof Player) {
			Player p = (Player) e.getEntity();
			if(p.isGliding()) e.setCancelled(true);
		}
		
	}
}

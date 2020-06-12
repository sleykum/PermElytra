package me.simkon.permelytra;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;


public class ElytraListener implements Listener {
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		if(e.getCurrentItem() != null) {
			if(e.getCurrentItem().equals(new ItemStack(Material.ELYTRA)) && e.getSlot() == 38) e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		if(e.getPlayer().getInventory().getItem(38) != new ItemStack(Material.ELYTRA)) {
			e.getPlayer().getInventory().setItem(38, new ItemStack(Material.ELYTRA));
		}
	}
	
	@EventHandler
	public void onDurabilityLoss(PlayerItemDamageEvent e) {
		if(e.getItem().equals(new ItemStack(Material.ELYTRA))) {
			e.setCancelled(true);
		}
	}
}

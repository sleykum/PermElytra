package me.simkon.permelytra;

import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new MoveListener(), this);
		getServer().getPluginManager().registerEvents(new ElytraListener(), this);
	}
	
	public void onDisable() {
		
	}
}

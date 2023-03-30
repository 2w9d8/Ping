package me.bosultan.ping.core;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.bosultan.ping.hooks.PlaceHolderAPIHook;

public class Core extends JavaPlugin {
	@Override
	public void onEnable() {
		if (Bukkit.getPluginManager().isPluginEnabled("PlaceholderAPI")) {
			(new PlaceHolderAPIHook()).register();
		} else {
			this.getLogger().warning("PlaceholderAPI not found, disabling support.");
		}

	}

}

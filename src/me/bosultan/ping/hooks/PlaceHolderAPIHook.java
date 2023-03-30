package me.bosultan.ping.hooks;

import org.bukkit.entity.Player;
import me.bosultan.ping.nms.CraftPlayerPing;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;

public class PlaceHolderAPIHook extends PlaceholderExpansion {

	@Override
	public String getAuthor() {
		return "BoSultan";
	}

	@Override
	public String getIdentifier() {
		return "ping";
	}

	@Override
	public String getVersion() {
		return "1.0.0";
	}
	@Override
	public boolean persist() {
		return true;
	}

	@Override
	public String onPlaceholderRequest(Player player, String identifier) {
		if (player.isOnline() && player != null && identifier.equalsIgnoreCase("ping")) {
			return String.valueOf(CraftPlayerPing.getPing(player));
		}
		return "NULL";
	}

}

package me.bosultan.ping.nms;

import org.bukkit.entity.Player;

public class CraftPlayerPing {

	public static int getPing(Player player) {
	    try {
	        Object craftPlayer = CraftPlayer.getCraftPlayer(player);
	        return (int) craftPlayer.getClass().getField("ping").get(craftPlayer);
	    } catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
	        throw new Error(e);
	    }
	}
	
}

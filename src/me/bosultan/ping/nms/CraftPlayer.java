package me.bosultan.ping.nms;

import java.lang.reflect.InvocationTargetException;

import org.bukkit.entity.Player;

public class CraftPlayer {

	public static Object getCraftPlayer(Player player) {
		try {
			return Class.forName("org.bukkit.craftbukkit." + Version.NMS_VERSION + ".entity.CraftPlayer")
					.getMethod("getHandle").invoke(player);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException | ClassNotFoundException e) {
			throw new Error(e);
		}
	}

}

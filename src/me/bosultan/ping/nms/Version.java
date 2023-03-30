package me.bosultan.ping.nms;

import org.bukkit.Bukkit;

public class Version {

	public static final String NMS_VERSION = Bukkit.getServer().getClass().getPackage().getName().substring(23);

}

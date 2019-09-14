package com.api.swapi;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.api.swapi.economia.EconomiaAPI;

public class Main extends JavaPlugin {
	
	public static Main main;
	
	public void onEnable() {
		main = this;
		EconomiaAPI.setupEconomia();
		Bukkit.getConsoleSender().sendMessage("§e[SW_API] §aAPI iniciada com sucesso.");
	}

}

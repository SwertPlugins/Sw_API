package com.api.swapi.economia;

import org.bukkit.plugin.RegisteredServiceProvider;

import com.api.swapi.Main;

import net.milkbowl.vault.economy.Economy;

public class EconomiaAPI {
	
	public static Economy economia = null;
	
	public static boolean setupEconomia() {
        if (Main.main.getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = Main.main.getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        economia = rsp.getProvider();
        return economia != null;
    }

}

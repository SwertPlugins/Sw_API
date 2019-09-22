package com.api.swapi.niveis;

import org.bukkit.ChatColor;

public class NiveisAPI {
	
	public static String getProgresso(int current, int max, int totalBars, String symbol, String completedColor,
			String notCompletedColor) {
		float porcent = (float) current / max;
		int progresso = (int) ((int) totalBars * porcent);
		int leftOver = (totalBars - progresso);

		StringBuilder sb = new StringBuilder();
		sb.append(ChatColor.translateAlternateColorCodes('&', completedColor));
		for (int i = 0; i < progresso; i++) {
			sb.append(symbol);
		}
		sb.append(ChatColor.translateAlternateColorCodes('&', notCompletedColor));
		for (int i = 0; i < leftOver; i++) {
			sb.append(symbol);
		}
		return sb.toString();
	}
}

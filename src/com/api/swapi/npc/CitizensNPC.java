package com.api.swapi.npc;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;

public class CitizensNPC {
	
	@SuppressWarnings("static-access")
	public static void gerarNPC(Location local, String displayname, String skin, Player p) {
		NPC npc = CitizensAPI.getNPCRegistry().createNPC(EntityType.PLAYER, p.getUniqueId(), 0, displayname);
		npc.data().setPersistent(npc.PLAYER_SKIN_USE_LATEST, false);
		npc.data().setPersistent(npc.PLAYER_SKIN_UUID_METADATA, skin);
		npc.spawn(local);
	}

}

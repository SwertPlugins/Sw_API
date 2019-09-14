package com.api.swapi.itens;

import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class ItemBuilderSkull extends ItemBuilder {
	
	private SkullMeta meta;
	
	public ItemBuilderSkull() {
		super(Material.SKULL_ITEM, 1, (short) SkullType.PLAYER.ordinal());
		meta = (SkullMeta) itemMeta;
	}
	public ItemBuilderSkull setarDono(String head) {
		meta = (SkullMeta) itemMeta;
		meta.setOwner(head);
		return this;
	}
	@Override
	public ItemStack build() {
		meta = (SkullMeta) itemMeta;
		itemStack.setItemMeta(meta);
		return itemStack;
	}

}

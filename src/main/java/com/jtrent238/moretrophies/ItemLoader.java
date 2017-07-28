package com.jtrent238.moretrophies;

import com.jim.obstrophiesaoa.ObsTrophiesAoA;
import com.jim.obstrophiesaoa.item.ItemSpecialSword;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item.ToolMaterial;

public class ItemLoader {
	

	public static ItemSpecialSword jtrent238_Sword;
	public static ItemSpecialSword Golem_Sword;
	
	public static void loadItems() {

		
		jtrent238_Sword = (ItemSpecialSword) new ItemSpecialSword(ToolMaterial.EMERALD, ObsTrophiesAoA.creativeTab);
		jtrent238_Sword.setTextureName(MoreTrophies.MODID + ":jtrent238_Sword");
		jtrent238_Sword.setUnlocalizedName("jtrent238_Sword");
		jtrent238_Sword.addModIDs("epicproportionsmod","epicproportionsmod_halloween","epicproportionsmod_christmas");
		jtrent238_Sword.setDropChances(0.1F, 0.2F, 0.3F, 0.4F);
		
		Golem_Sword = (ItemSpecialSword) new ItemSpecialSword(ToolMaterial.EMERALD, ObsTrophiesAoA.creativeTab);
		Golem_Sword.setTextureName(MoreTrophies.MODID + ":Golem_Sword");
		Golem_Sword.setUnlocalizedName("Golem_Sword");
		Golem_Sword.addModID("golems");
		Golem_Sword.setDropChances(0.1F, 0.2F, 0.3F, 0.4F);
		registerItems();
	}

	private static void registerItems() {


		GameRegistry.registerItem(jtrent238_Sword, "jtrent238_Sword", MoreTrophies.MODID);
		GameRegistry.registerItem(Golem_Sword, "Golem_Sword", MoreTrophies.MODID);
		
	}


}

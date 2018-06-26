package com.jtrent238.moretrophies;

import java.util.ArrayList;
import java.util.List;

import com.jim.obstrophiesaoa.ObsTrophiesAoA;
import com.jim.obstrophiesaoa.item.ItemSpecialSword;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class ItemLoader {
	
	private static String[] jtrent238ModIDS = { "epicproportionsmod", "epicproportionsmod_halloween", "epicproportionsmod_christmas", "jtrent238youtubers"};
	private static String[] GolemModIds= { "golems", "golems_addon_tconstruct"};
	
	public static ItemSpecialSword jtrent238_Sword;
	public static ItemSpecialSword Golem_Sword;
	public static ItemSpecialSword Sweet_Sword;
	public static ItemSpecialSword FatherToast_Sword;
	public static ItemSpecialSword DungeonHunter_Sword;

	
	public static void loadItems() {

		
		jtrent238_Sword = (ItemSpecialSword) new ItemSpecialSword(ToolMaterial.EMERALD, ObsTrophiesAoA.creativeTab);
		jtrent238_Sword.setTextureName(MoreTrophies.MODID + ":jtrent238_Sword");
		jtrent238_Sword.setUnlocalizedName("jtrent238_Sword");
		jtrent238_Sword.addModIDs(jtrent238ModIDS);
		List jtrent238TooltipParts = new ArrayList();
			jtrent238TooltipParts.add("PopularMMOS Epic Proportions Mod");
			jtrent238TooltipParts.add("PopularMMOS Epic Proportions Mod - Halloween Addon");
			jtrent238TooltipParts.add("PopularMMOS Epic Proportions Mod - Christmas Addon");
			jtrent238TooltipParts.add("jtrent238's YouTubers");
		jtrent238_Sword.forModIDsTooltipOverride(jtrent238TooltipParts);
		jtrent238_Sword.setDropChances(0.1F, 0.2F, 0.3F, 0.4F);
		
		Golem_Sword = (ItemSpecialSword) new ItemSpecialSword(ToolMaterial.EMERALD, ObsTrophiesAoA.creativeTab);
		Golem_Sword.setTextureName(MoreTrophies.MODID + ":Golem_Sword");
		Golem_Sword.setUnlocalizedName("Golem_Sword");
		Golem_Sword.addModIDs(GolemModIds);
		List GolemSwordTooltipParts = new ArrayList();
			GolemSwordTooltipParts.add("Extra Golems");
			GolemSwordTooltipParts.add("Tinkers' Golems Addon");
		Golem_Sword.forModIDsTooltipOverride(GolemSwordTooltipParts);
		Golem_Sword.setDropChances(0.1F, 0.2F, 0.3F, 0.4F);
		
		
		Sweet_Sword = (ItemSpecialSword) new ItemSpecialSword(ToolMaterial.EMERALD, ObsTrophiesAoA.creativeTab);
		Sweet_Sword.setTextureName(MoreTrophies.MODID + ":Sweet_Sword");
		Sweet_Sword.setUnlocalizedName("Sweet_Sword");
		Sweet_Sword.addModID("candycraftmod");
		Sweet_Sword.forModIDsTooltipOverride("CandyCraft Mod");
		Sweet_Sword.setDropChances(0.1F, 0.2F, 0.3F, 0.4F);
		
		FatherToast_Sword = (ItemSpecialSword) new ItemSpecialSword(ToolMaterial.EMERALD, ObsTrophiesAoA.creativeTab);
		FatherToast_Sword.setTextureName(MoreTrophies.MODID + ":FatherToast_Sword");
		FatherToast_Sword.setUnlocalizedName("FatherToast_Sword");
		FatherToast_Sword.addModID("SpecialMobs");
		FatherToast_Sword.forModIDsTooltipOverride("FatherToast Special Mobs Mod");
		FatherToast_Sword.setDropChances(0.1F, 0.2F, 0.3F, 0.4F);
		
		DungeonHunter_Sword = (ItemSpecialSword) new ItemSpecialSword(ToolMaterial.EMERALD, ObsTrophiesAoA.creativeTab);
		DungeonHunter_Sword.setTextureName(MoreTrophies.MODID + ":DungeonHunter_Sword");
		DungeonHunter_Sword.setUnlocalizedName("DungeonHunter_Sword");
		DungeonHunter_Sword.addModID("dungeonmobs");
		DungeonHunter_Sword.forModIDsTooltipOverride("Dungeon Mobs Mod");
		DungeonHunter_Sword.setDropChances(0.1F, 0.2F, 0.3F, 0.4F);
		
		
		registerItems();
	}

	private static void registerItems() {


		GameRegistry.registerItem(jtrent238_Sword, "jtrent238_Sword", MoreTrophies.MODID);
		GameRegistry.registerItem(Golem_Sword, "Golem_Sword", MoreTrophies.MODID);
		GameRegistry.registerItem(Sweet_Sword, "Sweet_Sword", MoreTrophies.MODID);
		GameRegistry.registerItem(FatherToast_Sword, "FatherToast_Sword", MoreTrophies.MODID);
		GameRegistry.registerItem(DungeonHunter_Sword, "DungeonHunter_Sword", MoreTrophies.MODID);
		
	}


}

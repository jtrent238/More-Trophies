package com.jtrent238.moretrophies.trophyloaders;

import org.apache.logging.log4j.Level;

import com.jim.obstrophiesaoa.trophy.TrophyAoA;
import com.jim.obstrophiesaoa.trophy.TrophyRegistry;
import com.jtrent238.moretrophies.LogHelper;

import cpw.mods.fml.common.Loader;

public class ExtraGolems {

	public static void registerTrophies() {


		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_bedrock")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_bookshelf")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_clay")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_coal")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_diamond")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_emerald")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_end_stone")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_glass")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_glowstone")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_gold")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_hardened_clay")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_ice")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_lapis")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_leaf")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_melon")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_nether_brick")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_obsidian")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_quartz")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_redstone")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_sandstone")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_sponge")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_stained_clay")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_stained_glass")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_straw")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_tnt")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_wooden")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems", "golem_wool")});

		if (Loader.isModLoaded("golems_addon_tconstruct")) {
			
			System.out.println("Tinkers' Golems Addon Loaded");
			try {
				LogHelper.log(Level.INFO, "Loaded Tinkers' Golems Addon");
			}
			catch (Exception e) {
				LogHelper.log(Level.WARN, "Could not load Tinkers' Golems Addon");
				e.printStackTrace(System.err);
			}
				TinkersGolemsAddon();
			}
		
		if (Loader.isModLoaded("")) {
			
			System.out.println("Futurum Golems Addon Loaded");
			try {
				LogHelper.log(Level.INFO, "Loaded Futurum Golems Addon");
			}
			catch (Exception e) {
				LogHelper.log(Level.WARN, "Could not load Futurum Golems Addon");
				e.printStackTrace(System.err);
			}
				FuturumAddon();
			}
	}

	private static void TinkersGolemsAddon() {

		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems_addon_tconstruct", "golem_alum")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems_addon_tconstruct", "golem_alumbrass")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems_addon_tconstruct", "golem_alumite")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems_addon_tconstruct", "golem_ardite")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems_addon_tconstruct", "golem_bronze")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems_addon_tconstruct", "golem_brownstone")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems_addon_tconstruct", "golem_cobalt")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems_addon_tconstruct", "golem_copper")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems_addon_tconstruct", "golem_ender")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems_addon_tconstruct", "golem_glue")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems_addon_tconstruct", "golem_hambone")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems_addon_tconstruct", "golem_manyullyn")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems_addon_tconstruct", "golem_seared")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems_addon_tconstruct", "golem_slime")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems_addon_tconstruct", "golem_steel")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("golems_addon_tconstruct", "golem_tin")});
		
	}
	
	private static void FuturumAddon() {

		//coming soon
		
	}
}

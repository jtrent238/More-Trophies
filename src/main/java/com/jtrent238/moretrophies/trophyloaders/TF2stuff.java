package com.jtrent238.moretrophies.trophyloaders;

import com.jim.obstrophiesaoa.trophy.TrophyAoA;
import com.jim.obstrophiesaoa.trophy.TrophyRegistry;
import com.jtrent238.moretrophies.ConfigManager;

public class TF2stuff {

	public static void registerTrophies() {
		
		if(ConfigManager.TF2STUFF_0 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("rafradek_tf2_weapons", "demoman")});
		}
		/*if(ConfigManager.TF2STUFF_1 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("rafradek_tf2_weapons", "dispenser")});
		}*/
		if(ConfigManager.TF2STUFF_2 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("rafradek_tf2_weapons", "engineer")});
		}
		/*if(ConfigManager.TF2STUFF_3 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("rafradek_tf2_weapons", "flame")});
		}*/
		/*if(ConfigManager.TF2STUFF_4 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("rafradek_tf2_weapons", "grenade")});
		}*/
		if(ConfigManager.TF2STUFF_5 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("rafradek_tf2_weapons", "hale")});
		}
		if(ConfigManager.TF2STUFF_6 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("rafradek_tf2_weapons", "heavy")});
		}
		if(ConfigManager.TF2STUFF_7 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("rafradek_tf2_weapons", "medic")});
		}
		if(ConfigManager.TF2STUFF_8 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("rafradek_tf2_weapons", "pyro")});
		}
		/*if(ConfigManager.TF2STUFF_9 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("rafradek_tf2_weapons", "rocket")});
		}*/
		if(ConfigManager.TF2STUFF_10 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("rafradek_tf2_weapons", "scout")});
		}
		/*if(ConfigManager.TF2STUFF_11 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("rafradek_tf2_weapons", "sentry")});
		}*/
		if(ConfigManager.TF2STUFF_12 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("rafradek_tf2_weapons", "sniper")});
		}
		if(ConfigManager.TF2STUFF_13 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("rafradek_tf2_weapons", "soldier")});
		}
		/*if(ConfigManager.TF2STUFF_14 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("rafradek_tf2_weapons", "spy")});
		}*/
		/*if(ConfigManager.TF2STUFF_15 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("rafradek_tf2_weapons", "sticky")});
		}*/
		/*if(ConfigManager.TF2STUFF_16 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("rafradek_tf2_weapons", "syringe")});
		}*/
		/*if(ConfigManager.TF2STUFF_17 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("rafradek_tf2_weapons", "teleporter")});
		}*/
		
	}
}

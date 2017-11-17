package com.jtrent238.moretrophies.trophyloaders;

import com.jim.obstrophiesaoa.trophy.TrophyAoA;
import com.jim.obstrophiesaoa.trophy.TrophyRegistry;
import com.jtrent238.moretrophies.ConfigManager;

public class Minecraft {

	public static void registerTrophies() {
		
		/*
		 * Vannila Mobs That are not in the mod for some reason!!!
		 */

		if(ConfigManager.ENABLE_0 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "Bat")});
		}
		if(ConfigManager.ENABLE_1 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "CaveSpider")});
		}
		if(ConfigManager.ENABLE_2 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "Chicken")});
		}
		if(ConfigManager.ENABLE_3 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "Cow")});
		}
		if(ConfigManager.ENABLE_4 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "Creeper")});
		}
		if(ConfigManager.ENABLE_5 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "EnderCrystal")});
		}
		if(ConfigManager.ENABLE_6 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "EnderDragon")});
		}
		if(ConfigManager.ENABLE_7 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "Enderman")});
		}
		if(ConfigManager.ENABLE_8 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "EntityHorse")});
		}
		if(ConfigManager.ENABLE_9 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "Ghast")});
		}
		if(ConfigManager.ENABLE_10 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "Giant")});
		}
		if(ConfigManager.ENABLE_11 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "LavaSlime")});
		}
		if(ConfigManager.ENABLE_12 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "MushroomCow")});
		}
		if(ConfigManager.ENABLE_13 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "Ozelot")});
		}
		if(ConfigManager.ENABLE_14 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "PigZombie")});
		}
		if(ConfigManager.ENABLE_15 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "Sheep")});
		}
		if(ConfigManager.ENABLE_16 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "Silverfish")});
		}
		if(ConfigManager.ENABLE_17 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "Skeleton")});
		}
		if(ConfigManager.ENABLE_18 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "Slime")});
		}
		if(ConfigManager.ENABLE_19 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "SnowMan")});
		}
		if(ConfigManager.ENABLE_20 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "Spider")});
		}
		if(ConfigManager.ENABLE_21 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "Squid")});
		}
		if(ConfigManager.ENABLE_22 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "Villager")});
		}
		if(ConfigManager.ENABLE_23 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "VillagerGolem")});
		}
		if(ConfigManager.ENABLE_24 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "Witch")});
		}
		if(ConfigManager.ENABLE_25 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "WitherBoss")});
		}
		if(ConfigManager.ENABLE_26 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "Wolf")});
		}
		if(ConfigManager.ENABLE_27 == true){
			TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "Zombie")});
		}


	}

}

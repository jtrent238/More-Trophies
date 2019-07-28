package com.jtrent238.moretrophies.trophyloaders;

import com.jim.obstrophiesaoa.trophy.TrophyAoA;
import com.jim.obstrophiesaoa.trophy.TrophyRegistry;

public class NotEnoughCats {

	public static void registerTrophies() {

/*		TrophyRegistry.getInstance().addTrophies(
				new TrophyAoA[] { 
						new TrophyAoA("minecraft" , "Mooshroom_NEC")
						}
				);
		
		TrophyRegistry.getInstance().addTrophies(
				new TrophyAoA[] { 
						new TrophyAoA("minecraft" , "Ocelot_NEC")
						}
				);
		
		TrophyRegistry.getInstance().addTrophies(
				new TrophyAoA[] { 
						new TrophyAoA("minecraft" , "Wolf_NEC")
						}
				);*/
		
		//TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft" , "Mooshroom_NEC")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft" , "Ocelot_NEC")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft" , "Wolf_NEC")});

	}
}

package com.jtrent238.moretrophies.trophyloaders;

import com.jim.obstrophiesaoa.trophy.TrophyAoA;
import com.jim.obstrophiesaoa.trophy.TrophyRegistry;

public class MoreShearables {

	public static void registerTrophies() {

		/*	I use [moreShearables] for the modid if the entityid is ["moreShearables.ChickenNaked"] 
		 * 	but if it is just ["ChickenNaked"] i will set the modid as ["minecraft"]
		 */
		
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("moreShearables", "ChickenNaked")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("moreShearables", "CowNaked")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("moreShearables", "PigNaked")});

	}

	
}

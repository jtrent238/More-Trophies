package com.jtrent238.moretrophies.trophyloaders;

import com.jim.obstrophiesaoa.trophy.TrophyAoA;
import com.jim.obstrophiesaoa.trophy.TrophyRegistry;

public class NeighborCraft {
	
	public static void registerTrophies() {

		//TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("hnm" , "Bullet")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("hnm" , "Neighbor")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("hnm" , "Player")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("hnm" , "Shadow")});

	}
}
package com.jtrent238.moretrophies.trophyloaders;

import com.jim.obstrophiesaoa.trophy.TrophyAoA;
import com.jim.obstrophiesaoa.trophy.TrophyRegistry;

public class TheValeOfShadows {

	public static void registerTrophies() {
		
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("Minecraft", "demogorgon")});
		
	}
}

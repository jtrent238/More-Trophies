package com.jtrent238.moretrophies.trophyloaders;

import com.jim.obstrophiesaoa.trophy.TrophyAoA;
import com.jim.obstrophiesaoa.trophy.TrophyRegistry;

public class LaserCreepers {

	public static void registerTrophies() {


		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("lasercreepers", "creepssile")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("lasercreepers", "jetPackSpider")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("lasercreepers", "laserCreeper")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("lasercreepers", "roboDino")});

	}

}

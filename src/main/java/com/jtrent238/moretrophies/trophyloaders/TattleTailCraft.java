package com.jtrent238.moretrophies.trophyloaders;

import com.jim.obstrophiesaoa.trophy.TrophyAoA;
import com.jim.obstrophiesaoa.trophy.TrophyRegistry;

public class TattleTailCraft {

	public static void registerTrophies() {


		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("ttm", "Mama")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("ttm", "Mama_choco")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("ttm", "Mama_golden")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("ttm", "Mama_nightmare")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("ttm", "Papa")});

	}

}

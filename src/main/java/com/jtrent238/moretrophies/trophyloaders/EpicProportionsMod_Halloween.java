package com.jtrent238.moretrophies.trophyloaders;

import com.jim.obstrophiesaoa.trophy.TrophyAoA;
import com.jim.obstrophiesaoa.trophy.TrophyRegistry;

public class EpicProportionsMod_Halloween {

	public static void registerTrophies() {

		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "EntitySpookyJen")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "EntitySpookyPat")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "EntitySpookyCaptianCookie")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "EntityGhost")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "EntityScareCrow")});

	}

}

package com.jtrent238.moretrophies.trophyloaders;

import com.jim.obstrophiesaoa.trophy.TrophyAoA;
import com.jim.obstrophiesaoa.trophy.TrophyRegistry;

public class JustaFewFish {

	public static void registerTrophies() {


		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("jaff", "FishClown")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("jaff", "FishCod")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("jaff", "FishPuffer")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("jaff", "FishSalmon")});
		//TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("jaff", "IronFishHook")});

	}

}

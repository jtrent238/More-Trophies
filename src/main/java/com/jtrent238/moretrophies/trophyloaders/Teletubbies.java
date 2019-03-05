package com.jtrent238.moretrophies.trophyloaders;

import com.jim.obstrophiesaoa.trophy.TrophyAoA;
import com.jim.obstrophiesaoa.trophy.TrophyRegistry;

public class Teletubbies {

	public static void registerTrophies() {

		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft" , "Dipsy")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft" , "LaaLaa")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft" , "NooNoo")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft" , "Po")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft" , "TinkyWinky")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft" , "ZombieDipsy")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft" , "ZombieLaaLaa")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft" , "ZombiePo")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft" , "ZombieTinkyWinky")});

	}
}

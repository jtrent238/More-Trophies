package com.jtrent238.moretrophies.trophyloaders;

import com.jim.obstrophiesaoa.trophy.TrophyAoA;
import com.jim.obstrophiesaoa.trophy.TrophyRegistry;

public class MysticalMobs {

	public static void registerTrophies() {

		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft" , "EnderEye")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft" , "Fish")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft" , "FlyingEye")});
		//TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("MysticalMobs" , "EnderBall")});
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft" , "SkeletonWarrior")});
		
	}
}

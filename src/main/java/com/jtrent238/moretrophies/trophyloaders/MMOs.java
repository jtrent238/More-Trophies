package com.jtrent238.moretrophies.trophyloaders;

import com.jim.obstrophiesaoa.trophy.TrophyAoA;
import com.jim.obstrophiesaoa.trophy.TrophyRegistry;

public class MMOs {

    public static void registerTrophies() {


        TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "Jen")});
        TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "Jenicorn")});
        TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "MMOs")});
        TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "PinkZombie")});
        //TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "explodingHeart")});
        //TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "largeWeight")});
        //TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "pinkLaser")});

    }

}

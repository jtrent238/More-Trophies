package com.jtrent238.moretrophies.trophyloaders;

import com.jim.obstrophiesaoa.trophy.TrophyAoA;
import com.jim.obstrophiesaoa.trophy.TrophyRegistry;
import com.jtrent238.moretrophies.TrophyAPI;

public class PacMan {

    public static void registerTrophies() {


        TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", "Pacman")});

    }

}

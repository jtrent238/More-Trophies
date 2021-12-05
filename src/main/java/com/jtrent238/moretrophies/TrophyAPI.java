package com.jtrent238.moretrophies;

import com.jim.obstrophiesaoa.trophy.TrophyAoA;
import com.jim.obstrophiesaoa.trophy.TrophyRegistry;


public class TrophyAPI {

    public static void registerTrophy(String modID, String entityID) {

        TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA(modID, entityID)});

    }
}

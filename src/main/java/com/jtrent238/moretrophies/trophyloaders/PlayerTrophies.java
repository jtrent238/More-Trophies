package com.jtrent238.moretrophies.trophyloaders;

import java.util.UUID;

import com.jim.obstrophiesaoa.trophy.TrophyAoA;
import com.jim.obstrophiesaoa.trophy.TrophyRegistry;
import com.jtrent238.moretrophies.trophy.PlayerTrophyRegistry;
import com.jtrent238.moretrophies.trophy.TrophyPlayer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.UsernameCache;

public class PlayerTrophies {



	public static EntityPlayer getPlayerFromUUID(String uuid)
    {
        return getPlayerFromUUID(getUsernameFromUUID(uuid));
    }

    public static EntityPlayer getPlayerFromUUID(UUID uuid)
    {
        return getPlayerFromUUID(getUsernameFromUUID(uuid));
    }

    public static UUID getUUIDFromPlayer(EntityPlayer player)
    {
        return player.getGameProfile().getId();
    }
    
    public static String getUsernameFromUUID(String uuid)
    {
        return UsernameCache.getLastKnownUsername(UUID.fromString(uuid));
    }

    public static String getUsernameFromUUID(UUID uuid)
    {
        return UsernameCache.getLastKnownUsername(uuid);
    }
    
    
    
	public static void registerTrophies() {

		System.out.println("Player Trophies Comeing Soon!");
		
		PlayerTrophyRegistry.getInstance().addTrophies(new TrophyPlayer[] { new TrophyPlayer("minecraft", "EntityPlayer", "jtrent238")});
		//PlayerTrophyRegistry.getInstance().addTrophies(new TrophyPlayer[] { new TrophyPlayer("minecraft", "EntityPlayer", Minecraft.getMinecraft().thePlayer.getDisplayName())});
		//TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA("minecraft", EntityPlayer)});
	}

	
}

package com.jtrent238.moretrophies;


import java.util.ArrayList;

import org.apache.logging.log4j.Level;

import com.jtrent238.moretrophies.common.CommonProxy;
import com.jtrent238.moretrophies.trophyloaders.EpicProportionsMod;
import com.jtrent238.moretrophies.trophyloaders.EpicProportionsMod_Christmas;
import com.jtrent238.moretrophies.trophyloaders.EpicProportionsMod_Halloween;
import com.jtrent238.moretrophies.trophyloaders.FandomCraft;
import com.jtrent238.moretrophies.trophyloaders.FrozenArctic;
import com.jtrent238.moretrophies.trophyloaders.LostWorld;
import com.jtrent238.moretrophies.trophyloaders.Minecraft;
import com.jtrent238.moretrophies.trophyloaders.MoZombies;
import com.jtrent238.moretrophies.trophyloaders.MrGorrila;
import com.jtrent238.moretrophies.trophyloaders.MrWhalesAminalsMod;
import com.jtrent238.moretrophies.trophyloaders.MyPetSushi;
import com.jtrent238.moretrophies.trophyloaders.OreSpiders;
import com.jtrent238.moretrophies.trophyloaders.ProjectFruit;
import com.jtrent238.moretrophies.trophyloaders.SpiderQueen;
import com.jtrent238.moretrophies.trophyloaders.WeepingAngels;
import com.jtrent238.moretrophies.trophyloaders.WildMobsMod;
import com.jtrent238.moretrophies.trophyloaders.ZeldaSwordSkills;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.command.ICommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.ChestGenHooks;

@Mod(modid=MoreTrophies.MODID, name=MoreTrophies.MODNAME, version=(MoreTrophies.MODVERSION),dependencies="required-after:obscore, required-after:obstrophiesaoa")
//@MeddleMod(id=Main.MODID, name=Main.MODNAME, version=(Main.MODVERSION), author=Main.MODAUTHOR)
public class MoreTrophies
{

	
	@SidedProxy(clientSide="com.jtrent238.moretrophies.client.ClientProxy", serverSide="com.jtrent238.moretrophies.common.CommonProxy")
	public static CommonProxy proxy;
	
	
	public static final String MODID = "moretrophies";

	@Instance(MODID)
    public static MoreTrophies instance;
	public static final String MODVERSION = "1.0.0.0";
	public static final String MODNAME = "jtrent238's More Trophies Mod";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MC = "1.7.10";
	public static final String OBSTrophiesVersion = "1.6.0";
	public static final String OBSCoreVersion = "1.4.1";



	@ForgeSubscribe(priority = EventPriority.NORMAL)
    public void eventHandler(RenderGameOverlayEvent event) {

	}
	
	
@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	
}



@Mod.EventHandler
public void init(FMLInitializationEvent event)
{
	proxy.init(event);
	
	
	//Register Trophies for mods
	
		Minecraft.registerTrophies();
		
	if (Loader.isModLoaded("epicproportionsmod")) {
		
		System.out.println("EpicProportions Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded EpicProportions Mod ");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load EpicProportions Mod");
            e.printStackTrace(System.err);
        }
			EpicProportionsMod.registerTrophies();
		}
	
	if (Loader.isModLoaded("epicproportionsmod_halloween")) {
		
		System.out.println("EpicProportions Mod  Halloween Addon Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded EpicProportions Mod Halloween Addon");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load EpicProportions Mod Halloween Addon");
            e.printStackTrace(System.err);
        }
			EpicProportionsMod_Halloween.registerTrophies();
		}
	
	if (Loader.isModLoaded("epicproportionsmod_christmas")) {
		
		System.out.println("EpicProportions Mod  Christmas Addon Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded EpicProportions Mod Christmas Addon");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load EpicProportions Mod Christmas Addon");
            e.printStackTrace(System.err);
        }
			EpicProportionsMod_Christmas.registerTrophies();
		}
	
	if (Loader.isModLoaded("wildmobsmod")) {
		
		System.out.println("Wild Mobs Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Wild Mobs Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Wild Mobs Mod");
            e.printStackTrace(System.err);
        }
			WildMobsMod.registerTrophies();
		}
	
	if (Loader.isModLoaded("lostworld")) {
		
		System.out.println("Lost World Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Lost World Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Lost World Mod");
            e.printStackTrace(System.err);
        }
			LostWorld.registerTrophies();
		}
	
	if (Loader.isModLoaded("mypetsushi")) {
		
		System.out.println("My Pet Sushi Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded My Pet Sushi Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load My Pet Sushi Mod");
            e.printStackTrace(System.err);
        }
			MyPetSushi.registerTrophies();
		}
	
	if (Loader.isModLoaded("w_angels")) {
		
		System.out.println("Weeping Angels Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Weeping Angels Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Weeping Angels Mod");
            e.printStackTrace(System.err);
        }
			WeepingAngels.registerTrophies();
		}
	
	if (Loader.isModLoaded("mozombies")) {
		
		System.out.println("Mo' Zombies Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Mo' Zombies Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Mo' Zombies Mod");
            e.printStackTrace(System.err);
        }
			MoZombies.registerTrophies();
		}
	
	if (Loader.isModLoaded("SQ")) {
		
		System.out.println("Spider Queen Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Spider Queen Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Spider Queen Mod");
            e.printStackTrace(System.err);
        }
			SpiderQueen.registerTrophies();
		}
	
	if (Loader.isModLoaded("orespiders")) {
		
		System.out.println("Ore Spiders Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Ore Spiders Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Ore Spiders Mod");
            e.printStackTrace(System.err);
        }
			OreSpiders.registerTrophies();
		}
	
	if (Loader.isModLoaded("projectfruit")) {
		
		System.out.println("Project Fruit Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Project Fruit Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Project Fruit Mod");
            e.printStackTrace(System.err);
        }
			ProjectFruit.registerTrophies();
		}
	
	if (Loader.isModLoaded("fandomcraft")) {
		
		System.out.println("Fandom Craft Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Fandom Craft Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Fandom Craft Mod");
            e.printStackTrace(System.err);
        }
			FandomCraft.registerTrophies();
		}
	
	if (Loader.isModLoaded("mrwhale1")) {
		
		System.out.println("Mr Whale's Aminals Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Mr Whale's Aminals Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Mr Whale's Aminals Mod");
            e.printStackTrace(System.err);
        }
		MrWhalesAminalsMod.registerTrophies();
		}
	
	if (Loader.isModLoaded("zeldaswordskills")) {
		
		System.out.println("ZeldaSwordSkills Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded ZeldaSwordSkills Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load ZeldaSwordSkills Mod");
            e.printStackTrace(System.err);
        }
			ZeldaSwordSkills.registerTrophies();
		}

	if (Loader.isModLoaded("mrgorrila")) {
		
		System.out.println("Mr Gorrila Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Mr Gorrila Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Mr Gorrila Mod");
            e.printStackTrace(System.err);
        }
			MrGorrila.registerTrophies();
		}
	

	if (Loader.isModLoaded("frozenarctic")) {
		
		System.out.println("Frozen Arctic Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Frozen Arctic Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Frozen Arctic Mod");
            e.printStackTrace(System.err);
        }
			FrozenArctic.registerTrophies();
		}
}









@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event) {
	{
		
	    
	}
}


@EventHandler
public void serverStart(FMLServerStartingEvent event)
{
     MinecraftServer server = MinecraftServer.getServer();
     // Get's the current server instance
     
     ICommandManager command = server.getCommandManager();
     //ServerCommandManager manager = (ServerCommandManager) command;
     
     //manager.registerCommand(new CommandModInfo());
     //manager.registerCommand(new CommandChangelog());
}

					
}

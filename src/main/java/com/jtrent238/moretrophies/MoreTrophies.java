package com.jtrent238.moretrophies;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.apache.logging.log4j.Level;

import com.jim.obscore.OCClientConfig;
import com.jim.obscore.blocks.BlockInitialisation;
import com.jim.obscore.containers.AbstractLanguageDetails;
import com.jim.obscore.containers.BlockDetails;
import com.jim.obscore.lib.ObsLog;
import com.jim.obstrophiesaoa.trophy.TrophyAoA;
import com.jim.obstrophiesaoa.trophy.TrophyRegistry;
import com.jtrent238.moretrophies.blocks.BlockTrophyPlayer;
import com.jtrent238.moretrophies.common.CommonProxy;
import com.jtrent238.moretrophies.trophyloaders.AdInfernos;
import com.jtrent238.moretrophies.trophyloaders.AnimalBikes;
import com.jtrent238.moretrophies.trophyloaders.AquaCreeper;
import com.jtrent238.moretrophies.trophyloaders.AshtonsWatermelonMod;
import com.jtrent238.moretrophies.trophyloaders.BabyMobs;
import com.jtrent238.moretrophies.trophyloaders.CandyCraft;
import com.jtrent238.moretrophies.trophyloaders.CryptoCraft;
import com.jtrent238.moretrophies.trophyloaders.DungeonMobs;
import com.jtrent238.moretrophies.trophyloaders.EpicProportionsMod;
import com.jtrent238.moretrophies.trophyloaders.EpicProportionsMod_Christmas;
import com.jtrent238.moretrophies.trophyloaders.EpicProportionsMod_Halloween;
import com.jtrent238.moretrophies.trophyloaders.ExoticPlayers;
import com.jtrent238.moretrophies.trophyloaders.ExtraGolems;
import com.jtrent238.moretrophies.trophyloaders.FNaFUniverse;
import com.jtrent238.moretrophies.trophyloaders.FandomCraft;
import com.jtrent238.moretrophies.trophyloaders.FantasyMod;
import com.jtrent238.moretrophies.trophyloaders.FatherToastSpecialMobs;
import com.jtrent238.moretrophies.trophyloaders.FrozenArctic;
import com.jtrent238.moretrophies.trophyloaders.HardcoreEnderExpansion;
import com.jtrent238.moretrophies.trophyloaders.JTYouTubers;
import com.jtrent238.moretrophies.trophyloaders.JurassiCraft;
import com.jtrent238.moretrophies.trophyloaders.JustaFewFish;
import com.jtrent238.moretrophies.trophyloaders.LaserCreepers;
import com.jtrent238.moretrophies.trophyloaders.LittleBigCraft;
import com.jtrent238.moretrophies.trophyloaders.LostWorld;
import com.jtrent238.moretrophies.trophyloaders.LotsofMobs;
import com.jtrent238.moretrophies.trophyloaders.MaleficentWorld;
import com.jtrent238.moretrophies.trophyloaders.Minecraft;
import com.jtrent238.moretrophies.trophyloaders.MoZombies;
import com.jtrent238.moretrophies.trophyloaders.MoreAnimalsMod;
import com.jtrent238.moretrophies.trophyloaders.MoreShearables;
import com.jtrent238.moretrophies.trophyloaders.MrGorrila;
import com.jtrent238.moretrophies.trophyloaders.MrWhalesAminalsMod;
import com.jtrent238.moretrophies.trophyloaders.MyPetSushi;
import com.jtrent238.moretrophies.trophyloaders.OreSpiders;
import com.jtrent238.moretrophies.trophyloaders.Orespawn;
import com.jtrent238.moretrophies.trophyloaders.ParziStarWars;
import com.jtrent238.moretrophies.trophyloaders.PlayerTrophies;
import com.jtrent238.moretrophies.trophyloaders.Potatians;
import com.jtrent238.moretrophies.trophyloaders.ProjectFruit;
import com.jtrent238.moretrophies.trophyloaders.RandNMixMod;
import com.jtrent238.moretrophies.trophyloaders.RandomMobsMod;
import com.jtrent238.moretrophies.trophyloaders.ReptileMod;
import com.jtrent238.moretrophies.trophyloaders.SoggyEaster;
import com.jtrent238.moretrophies.trophyloaders.SpiderQueen;
import com.jtrent238.moretrophies.trophyloaders.TattleTailCraft;
import com.jtrent238.moretrophies.trophyloaders.TheUltimateUnicornMod;
import com.jtrent238.moretrophies.trophyloaders.TheValeOfShadows;
import com.jtrent238.moretrophies.trophyloaders.VaraziusFNAF;
import com.jtrent238.moretrophies.trophyloaders.WeepingAngels;
import com.jtrent238.moretrophies.trophyloaders.WildMobsMod;
import com.jtrent238.moretrophies.trophyloaders.Yogmod;
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
import net.minecraft.block.material.Material;
import net.minecraft.command.ICommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.ChestGenHooks;

@Mod(modid=MoreTrophies.MODID, name=MoreTrophies.MODNAME, version=(MoreTrophies.MODVERSION), dependencies="required-after:obstrophiesaoa")
//@MeddleMod(id=Main.MODID, name=Main.MODNAME, version=(Main.MODVERSION), author=Main.MODAUTHOR)
public class MoreTrophies
{

	
	@SidedProxy(clientSide="com.jtrent238.moretrophies.client.ClientProxy", serverSide="com.jtrent238.moretrophies.common.CommonProxy")
	public static CommonProxy proxy;
	
	
	public static final String MODID = "moretrophies";

	@Instance(MODID)
    public static MoreTrophies instance;
	public static final String MODVERSION = "1.0.2.3";
	public static final String MODNAME = "jtrent238's More Trophies Mod";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MC = "1.7.10";
	public static final String OBSTrophiesVersion = "1.6.0";
	public static final String OBSCoreVersion = "1.4.1";


	private BlockTrophyPlayer blockPlayerTrophy;


	private List<AbstractLanguageDetails> _languageDetails = new ArrayList();



	@ForgeSubscribe(priority = EventPriority.NORMAL)
    public void eventHandler(RenderGameOverlayEvent event) {

	}
	
	
@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	ObsLog.initialise(event.getModLog(), MODNAME);
	ConfigManager.Manage(event);
}



@Mod.EventHandler
public void init(FMLInitializationEvent event) throws IOException
{
	proxy.init(event);
	
	ItemLoader.loadItems();

	//String name = "otaoablocktrophyPLAYER";
    
    //BlockDetails[] bd = { new BlockDetails("TrophyPLAYER", Boolean.valueOf(false), "builder") };
    
    //blockPlayerTrophy = new BlockTrophyPlayer(name, Material.rock);
    //BlockInitialisation.initBlockMultiDetails(blockPlayerTrophy, bd, 2.0F, 0.8F, this._languageDetails);
    
    //blockPlayerTrophy.func_149711_c(0.5F);
    
	//Register Trophies for mods
	
		Minecraft.registerTrophies();
		PlayerTrophies.registerTrophies();
		
		if(ConfigManager.AUTOTROPHYLOADER == true){

			if(OCClientConfig.getInstance().dumpEntityData == true){
				AutoTrophyLoader.constructor("obscore_entity_ids.txt");
				AutoTrophyLoader.registerTrophies();
			}
			if(OCClientConfig.getInstance().dumpEntityData == false){
				LogHelper.log(Level.WARN, "dump_entity_data must be set to true in obscore.cfg for this to work.");
			}

		}
		
		
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
	
	if (Loader.isModLoaded("lasercreepers")) {
		
		System.out.println("Laser Creeper Robot Dino Riders From Space Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Laser Creeper Robot Dino Riders From Space Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Laser Creeper Robot Dino Riders From Space Mod");
            e.printStackTrace(System.err);
        }
			LaserCreepers.registerTrophies();
		}
	
	if (Loader.isModLoaded("HardcoreEnderExpansion")) {
		
		System.out.println("Hardcore Ender Expansion Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Hardcore Ender Expansion Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Hardcore Ender Expansion Mod");
            e.printStackTrace(System.err);
        }
			HardcoreEnderExpansion.registerTrophies();
		}
	
	if (Loader.isModLoaded("aquacreeper")) {
		
		System.out.println("Aqua Creeper Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Aqua Creeper Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Aqua Creeper Mod");
            e.printStackTrace(System.err);
        }
			AquaCreeper.registerTrophies();
		}
			/*
	if (Loader.isModLoaded("jurassicraft")) {
		
		System.out.println("JurassiCraft Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded JurassiCraft Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load JurassiCraft Mod");
            e.printStackTrace(System.err);
        }
			JurassiCraft.registerTrophies();
		}
			*/
	if (Loader.isModLoaded("dextersnether")) {
		
		System.out.println("Ad Infernos Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Ad Infernos Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Ad Infernos Mod");
            e.printStackTrace(System.err);
        }
			AdInfernos.registerTrophies();
		}
				/*
	if (Loader.isModLoaded("potatians")) {
		
		System.out.println("Potatians Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Potatians Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Potatians Mod");
            e.printStackTrace(System.err);
        }
			Potatians.registerTrophies();
		}
				*/
	
	if (Loader.isModLoaded("golems")) {
		
		System.out.println("Extra Golems Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Extra Golems Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Extra Golems Mod");
            e.printStackTrace(System.err);
        }
			ExtraGolems.registerTrophies();
		}
	
	if (Loader.isModLoaded("reptilemod")) {
		
		System.out.println("Reptile Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Reptile Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Reptile Mod");
            e.printStackTrace(System.err);
        }
			ReptileMod.registerTrophies();
		}
	
	if (Loader.isModLoaded("moreShearables")) {
		
		System.out.println("More Shearables Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded More Shearables Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load More Shearables Mod");
            e.printStackTrace(System.err);
        }
			MoreShearables.registerTrophies();
		}
	
	if (Loader.isModLoaded("babymobs")) {
		
		System.out.println("Baby Mobs Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Baby Mobs Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Baby Mobs Mod");
            e.printStackTrace(System.err);
        }
			BabyMobs.registerTrophies();
		}
			/*
	if (Loader.isModLoaded("jaff")) {
		
		System.out.println("Just a Few Fish Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Just a Few Fish Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Just a Few Fish Mod");
            e.printStackTrace(System.err);
        }
			JustaFewFish.registerTrophies();
		}
			 */
			
	if (Loader.isModLoaded("AshtonsWatermelonMod")) {
		
		System.out.println("Ashtons Watermelon Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Ashtons Watermelon Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Ashtons Watermelon Mod");
            e.printStackTrace(System.err);
        }
			AshtonsWatermelonMod.registerTrophies();
		}
			/*
	if (Loader.isModLoaded("ultimate_unicorn_mod")) {
		
		System.out.println("Wings, Horns, and Hooves, the Ultimate Unicorn Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Wings, Horns, and Hooves, the Ultimate Unicorn Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Wings, Horns, and Hooves, the Ultimate Unicorn Mod");
            e.printStackTrace(System.err);
        }
			TheUltimateUnicornMod.registerTrophies();
		}
			*/
	if (Loader.isModLoaded("OreSpawn")) {
		
		System.out.println("OreSpawn Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded OreSpawn Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load OreSpawn Mod");
            e.printStackTrace(System.err);
        }
			Orespawn.registerTrophies();
		}
	
	if (Loader.isModLoaded("ttm")) {
		
		System.out.println("TattleTail Craft: Mama's Coming! Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded TattleTail Craft: Mama's Coming! Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load TattleTail Craft: Mama's Coming! Mod");
            e.printStackTrace(System.err);
        }
			TattleTailCraft.registerTrophies();
		}
	
	if (Loader.isModLoaded("animalbikes")) {
		
		System.out.println("Animal Bikes Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Animal Bikes Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Animal Bikes Mod");
            e.printStackTrace(System.err);
        }
			AnimalBikes.registerTrophies();
		}
	
	if (Loader.isModLoaded("lom")) {
		
		System.out.println("Lots of Mobs Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Lots of Mobs Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Lots of Mobs Mod");
            e.printStackTrace(System.err);
        }
			LotsofMobs.registerTrophies();
		}
	
	if (Loader.isModLoaded("jtrent238youtubers")) {
		
		System.out.println("jtrent238's YouTubers Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded jtrent238's YouTubers Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load jtrent238's YouTubers Mod");
            e.printStackTrace(System.err);
        }
			JTYouTubers.registerTrophies();
		}
	
	if (Loader.isModLoaded("upsidedown")) {
		
		System.out.println("The Vale of Shadows Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded The Vale of Shadows Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load The Vale of Shadows Mod");
            e.printStackTrace(System.err);
        }
			TheValeOfShadows.registerTrophies();
		}
	
	if (Loader.isModLoaded("ExoticPlayers")) {
		
		System.out.println("Exotic Players Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Exotic Players Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Exotic Players Mod");
            e.printStackTrace(System.err);
        }
			ExoticPlayers.registerTrophies();
		}
	
	if (Loader.isModLoaded("candycraftmod")) {
		
		System.out.println("CandyCraft Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded CandyCraft Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load CandyCraft Mod");
            e.printStackTrace(System.err);
        }
			CandyCraft.registerTrophies();
		}
	
	if (Loader.isModLoaded("fnafmod")) {
		
		System.out.println("Five Nights at Freddy's Universe Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Five Nights at Freddy's Universe Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Five Nights at Freddy's Universe Mod");
            e.printStackTrace(System.err);
        }
			FNaFUniverse.registerTrophies();
		}


	if (Loader.isModLoaded("easter")) {
		
		System.out.println("Easter Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Easter Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Easter Mod");
            e.printStackTrace(System.err);
        }
			SoggyEaster.registerTrophies();
		}
	
	if (Loader.isModLoaded("starwarsmod")) {
		
		System.out.println("Parzi's Star Wars Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Parzi's Star Wars Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Parzi's Star Wars Mod");
            e.printStackTrace(System.err);
        }
			ParziStarWars.registerTrophies();
		}
	
	if (Loader.isModLoaded("fnafmod")) {
		
		System.out.println("Fnaf Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Fnaf Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Fnaf Mod");
            e.printStackTrace(System.err);
        }
			VaraziusFNAF.registerTrophies();
		}
	
	if (Loader.isModLoaded("MaleficentWorld")) {
		
		System.out.println("Maleficent World Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Maleficent World Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Maleficent World Mod");
            e.printStackTrace(System.err);
        }
			MaleficentWorld.registerTrophies();
		}
	
	if (Loader.isModLoaded("RandNMixMod")) {
		
		System.out.println("RandNMixMod Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded RandNMixMod Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load RandNMixMod Mod");
            e.printStackTrace(System.err);
        }
			RandNMixMod.registerTrophies();
		}
	
	if (Loader.isModLoaded("fantasymod")) {
		
		System.out.println("FantasyMod Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded FantasyMod Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load FantasyMod Mod");
            e.printStackTrace(System.err);
        }
			FantasyMod.registerTrophies();
		}
	
	if (Loader.isModLoaded("Yogmod")) {
		
		System.out.println("Yogmod Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Yogmod Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Yogmod Mod");
            e.printStackTrace(System.err);
        }
			Yogmod.registerTrophies();
		}
	
	if (Loader.isModLoaded("MobsModV6")) {
		
		System.out.println("More Animals Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded More Animals Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load More Animals Mod");
            e.printStackTrace(System.err);
        }
			MoreAnimalsMod.registerTrophies();
		}
	
	if (Loader.isModLoaded("CryptoCraft")) {
		
		System.out.println("CryptoCraft Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded CryptoCraft Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load CryptoCraft Mod");
            e.printStackTrace(System.err);
        }
			CryptoCraft.registerTrophies();
		}
	if (Loader.isModLoaded("LittleBigCraft")) {
		
		System.out.println("LittleBigCraft Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded LittleBigCraft Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load LittleBigCraft Mod");
            e.printStackTrace(System.err);
        }
			LittleBigCraft.registerTrophies();
		}
	
	if (Loader.isModLoaded("RandomMobsMod")) {
		
		System.out.println("Random Mobs Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Random Mobs Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Random Mobs Mod");
            e.printStackTrace(System.err);
        }
			RandomMobsMod.registerTrophies();
		}

	if (Loader.isModLoaded("SpecialMobs")) {
		
		System.out.println("FatherToast Special Mobs Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded FatherToast Special Mobs Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load FatherToast Special Mobs Mod");
            e.printStackTrace(System.err);
        }
			FatherToastSpecialMobs.registerTrophies();
		}
	
	if (Loader.isModLoaded("dungeonmobs")) {
		
		System.out.println("Dungeon Mobs Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Dungeon Mobs Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.WARN, "Could not load Dungeon Mobs Mod");
            e.printStackTrace(System.err);
        }
			DungeonMobs.registerTrophies();
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


public static List<String> getAllNames()
{
  Set<String> names = new HashSet();
  //names.addAll(Arrays.asList(others));
  //names.addAll(Arrays.asList(modders));
  //names.addAll(Arrays.asList(youtubers));
  //names.addAll(Arrays.asList(mojang));
  //names.addAll(Arrays.asList(mindCrack));
  //names.addAll(Arrays.asList(hermitcraft));
  //names.addAll(Arrays.asList(forgeCraft));
  //names.addAll(Arrays.asList(ftb));
  //names.addAll(Arrays.asList(technic));
  
  /*if (enableModSent) {
    names.addAll(modsent);
  }*/
  
  return new ArrayList(names);
}

					
}

package com.jtrent238.moretrophies;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigManager {

	private static String CATEGORY_MC = "Minecraft Trophies";
	private static String CATEGORY_SWM = "Parzi's Star Wars Mod Trophies";
	private static String CATEGORY_PM = "Primitive Mobs Mod Trophies";
	private static String CATEGORY_TF2STUFF = "TF2 stuff Mod Trophies";
	private static String CATEGORY_TWEAKS = "Tweaks";
	
	public static boolean ENABLE_0;
	public static boolean ENABLE_1;
	public static boolean ENABLE_2;
	public static boolean ENABLE_3;
	public static boolean ENABLE_4;
	public static boolean ENABLE_5;
	public static boolean ENABLE_6;
	public static boolean ENABLE_7;
	public static boolean ENABLE_8;
	public static boolean ENABLE_9;
	public static boolean ENABLE_10;
	public static boolean ENABLE_11;
	public static boolean ENABLE_12;
	public static boolean ENABLE_13;
	public static boolean ENABLE_14;
	public static boolean ENABLE_15;
	public static boolean ENABLE_16;
	public static boolean ENABLE_17;
	public static boolean ENABLE_18;
	public static boolean ENABLE_19;
	public static boolean ENABLE_20;
	public static boolean ENABLE_21;
	public static boolean ENABLE_22;
	public static boolean ENABLE_23;
	public static boolean ENABLE_24;
	public static boolean ENABLE_25;
	public static boolean ENABLE_26;
	public static boolean ENABLE_27;

	public static boolean SWM_0;
	public static boolean SWM_1;
	public static boolean SWM_2;
	public static boolean SWM_3;
	public static boolean SWM_4;
	public static boolean SWM_5;
	public static boolean SWM_6;
	public static boolean SWM_7;
	public static boolean SWM_8;
	public static boolean SWM_9;
	public static boolean SWM_10;
	public static boolean SWM_11;
	public static boolean SWM_12;
	public static boolean SWM_13;
	public static boolean SWM_14;
	public static boolean SWM_15;
	public static boolean SWM_16;
	public static boolean SWM_17;
	public static boolean SWM_18;
	public static boolean SWM_19;
	public static boolean SWM_20;
	public static boolean SWM_21;
	public static boolean SWM_22;
	public static boolean SWM_23;
	public static boolean SWM_24;
	public static boolean SWM_25;
	public static boolean SWM_26;
	public static boolean SWM_27;
	public static boolean SWM_28;
	public static boolean SWM_29;
	public static boolean SWM_30;
	public static boolean SWM_31;
	public static boolean SWM_32;
	public static boolean SWM_33;
	public static boolean SWM_34;
	public static boolean SWM_35;
	public static boolean SWM_36;
	public static boolean SWM_37;
	public static boolean SWM_38;
	public static boolean SWM_39;
	public static boolean SWM_40;
	public static boolean SWM_41;
	public static boolean SWM_42;
	public static boolean SWM_43;
	public static boolean SWM_44;
	public static boolean SWM_45;
	public static boolean SWM_46;
	public static boolean SWM_47;
	public static boolean SWM_48;
	public static boolean SWM_49;
	public static boolean SWM_50;
	public static boolean SWM_51;
	public static boolean SWM_52;
	public static boolean SWM_53;
	public static boolean SWM_54;
	public static boolean SWM_55;
	public static boolean SWM_56;
	public static boolean SWM_57;
	public static boolean SWM_58;
	public static boolean SWM_59;
	public static boolean SWM_60;
	public static boolean SWM_61;
	public static boolean SWM_62;
	public static boolean SWM_63;
	public static boolean SWM_64;
	public static boolean SWM_65;
	public static boolean SWM_66;
	public static boolean SWM_67;
	public static boolean SWM_68;
	public static boolean PM_0;
	public static boolean PM_1;
	public static boolean PM_2;
	public static boolean PM_3;
	public static boolean PM_4;
	public static boolean PM_5;
	public static boolean PM_6;
	public static boolean PM_7;
	public static boolean PM_8;
	public static boolean PM_9;
	public static boolean PM_10;
	public static boolean PM_11;
	public static boolean PM_12;
	public static boolean PM_13;
	public static boolean PM_14;
	public static boolean PM_15;
	public static boolean PM_16;
	public static boolean PM_17;
	public static boolean PM_18;
	public static boolean PM_19;
	public static boolean PM_20;
	public static boolean PM_21;
	public static boolean PM_22;
	public static boolean TF2STUFF_0;
	public static boolean TF2STUFF_1;
	public static boolean TF2STUFF_2;
	public static boolean TF2STUFF_3;
	public static boolean TF2STUFF_4;
	public static boolean TF2STUFF_5;
	public static boolean TF2STUFF_6;
	public static boolean TF2STUFF_7;
	public static boolean TF2STUFF_8;
	public static boolean TF2STUFF_9;
	public static boolean TF2STUFF_10;
	public static boolean TF2STUFF_11;
	public static boolean TF2STUFF_12;
	public static boolean TF2STUFF_13;
	public static boolean TF2STUFF_14;
	public static boolean TF2STUFF_15;
	public static boolean TF2STUFF_16;
	public static boolean TF2STUFF_17;
	public static boolean TF2STUFF_18;
	
	
	public static boolean AUTOTROPHYLOADER = true;


	public static void Manage(FMLPreInitializationEvent event) {


		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		event.getModConfigurationDirectory();
		event.getModConfigurationDirectory();
		event.getModLog();
		event.getModMetadata();
		event.getModState();
		event.getSide();
		event.getVersionProperties();
		
		/*
		 * Config Start
		 */
		ENABLE_0 = config.get(CATEGORY_MC, "Enable Bat Trophy", true).getBoolean(true);
		ENABLE_1 = config.get(CATEGORY_MC, "Enable CaveSpider Trophy", true).getBoolean(true);
		ENABLE_2 = config.get(CATEGORY_MC, "Enable Chicken Trophy", true).getBoolean(true);
		ENABLE_3 = config.get(CATEGORY_MC, "Enable Cow Trophy", true).getBoolean(true);
		ENABLE_4 = config.get(CATEGORY_MC, "Enable Creeper Trophy", true).getBoolean(true);
		ENABLE_5 = config.get(CATEGORY_MC, "Enable EnderCrystal Trophy", false).getBoolean(false);
		ENABLE_6 = config.get(CATEGORY_MC, "Enable EnderDragon Trophy", false).getBoolean(false);
		ENABLE_7 = config.get(CATEGORY_MC, "Enable Enderman Trophy", true).getBoolean(true);
		ENABLE_8 = config.get(CATEGORY_MC, "Enable Horse Trophy", false).getBoolean(false);
		ENABLE_9 = config.get(CATEGORY_MC, "Enable Ghast Trophy", true).getBoolean(true);
		ENABLE_10 = config.get(CATEGORY_MC, "Enable Giant Trophy", false).getBoolean(false);
		ENABLE_11 = config.get(CATEGORY_MC, "Enable Magma Cube Trophy", true).getBoolean(true);
		ENABLE_12 = config.get(CATEGORY_MC, "Enable Mooshroom Trophy", true).getBoolean(true);
		ENABLE_13 = config.get(CATEGORY_MC, "Enable Ozelot Trophy", true).getBoolean(true);
		ENABLE_14 = config.get(CATEGORY_MC, "Enable ZombiePigMan Trophy", true).getBoolean(true);
		ENABLE_15 = config.get(CATEGORY_MC, "Enable Sheep Trophy", true).getBoolean(true);
		ENABLE_16 = config.get(CATEGORY_MC, "Enable Silverfish Trophy", true).getBoolean(true);
		ENABLE_17 = config.get(CATEGORY_MC, "Enable Skeleton Trophy", true).getBoolean(true);
		ENABLE_18 = config.get(CATEGORY_MC, "Enable Slime Trophy", true).getBoolean(true);
		ENABLE_19 = config.get(CATEGORY_MC, "Enable SnowMan Trophy", true).getBoolean(true);
		ENABLE_20 = config.get(CATEGORY_MC, "Enable Spider Trophy", true).getBoolean(true);
		ENABLE_21 = config.get(CATEGORY_MC, "Enable Squid Trophy", true).getBoolean(true);
		ENABLE_22 = config.get(CATEGORY_MC, "Enable Villager Trophy", true).getBoolean(true);
		ENABLE_23 = config.get(CATEGORY_MC, "Enable IronGolem Trophy", true).getBoolean(true);
		ENABLE_24 = config.get(CATEGORY_MC, "Enable Witch Trophy", true).getBoolean(true);
		ENABLE_25 = config.get(CATEGORY_MC, "Enable WitherBoss Trophy", false).getBoolean(false);
		ENABLE_26 = config.get(CATEGORY_MC, "Enable Wolf Trophy", true).getBoolean(true);
		ENABLE_27 = config.get(CATEGORY_MC, "Enable Zombie Trophy", true).getBoolean(true);
		
		if (Loader.isModLoaded("starwarsmod")) {
		SWM_0 = config.get(CATEGORY_SWM, "Enable atatPilot", true).getBoolean(true);
		SWM_1 = config.get(CATEGORY_SWM, "Enable atst", false).getBoolean(false);
		SWM_2 = config.get(CATEGORY_SWM, "Enable atstPilot", true).getBoolean(true);
		SWM_3 = config.get(CATEGORY_SWM, "Enable awing", false).getBoolean(false);
		SWM_4 = config.get(CATEGORY_SWM, "Enable bantha", false).getBoolean(false);
		SWM_5 = config.get(CATEGORY_SWM, "Enable blasterBolt", false).getBoolean(true);
		SWM_6 = config.get(CATEGORY_SWM, "Enable blasterEzraBolt", false).getBoolean(false);
		SWM_7 = config.get(CATEGORY_SWM, "Enable blasterHeavyBolt", false).getBoolean(false);
		SWM_8 = config.get(CATEGORY_SWM, "Enable blasterProbeBolt", false).getBoolean(false);
		SWM_9 = config.get(CATEGORY_SWM, "Enable blasterRifleBolt", false).getBoolean(false);
		SWM_10 = config.get(CATEGORY_SWM, "Enable blasterSpeederRifleBolt", false).getBoolean(false);
		SWM_11 = config.get(CATEGORY_SWM, "Enable blasterTIEBolt", false).getBoolean(false);
		SWM_12 = config.get(CATEGORY_SWM, "Enable blasterXWingBolt", false).getBoolean(false);
		SWM_13 = config.get(CATEGORY_SWM, "Enable bountyhunter", true).getBoolean(true);
		SWM_14 = config.get(CATEGORY_SWM, "Enable commoner", true).getBoolean(true);
		SWM_15 = config.get(CATEGORY_SWM, "Enable defaultBiped", true).getBoolean(true);
		SWM_16 = config.get(CATEGORY_SWM, "Enable destructionBolt", true).getBoolean(true);
		SWM_17 = config.get(CATEGORY_SWM, "Enable dewback", false).getBoolean(false);
		SWM_18 = config.get(CATEGORY_SWM, "Enable droidAstromech", true).getBoolean(true);
		SWM_19 = config.get(CATEGORY_SWM, "Enable droidAstromech2", true).getBoolean(true);
		SWM_20 = config.get(CATEGORY_SWM, "Enable droidAstromechBb8", true).getBoolean(true);
		SWM_21 = config.get(CATEGORY_SWM, "Enable droidAstromechImperial", true).getBoolean(true);
		SWM_22 = config.get(CATEGORY_SWM, "Enable droidGonk", true).getBoolean(true);
		SWM_23 = config.get(CATEGORY_SWM, "Enable droidMouse", true).getBoolean(true);
		SWM_24 = config.get(CATEGORY_SWM, "Enable droidProbe", true).getBoolean(true);
		SWM_25 = config.get(CATEGORY_SWM, "Enable droidProtocol", true).getBoolean(true);
		SWM_26 = config.get(CATEGORY_SWM, "Enable droidProtocol2", true).getBoolean(true);
		SWM_27 = config.get(CATEGORY_SWM, "Enable droidSurgical", true).getBoolean(true);
		SWM_28 = config.get(CATEGORY_SWM, "Enable droidTrainingRemote", true).getBoolean(true);
		SWM_29 = config.get(CATEGORY_SWM, "Enable endorRebel", false).getBoolean(false);
		SWM_30 = config.get(CATEGORY_SWM, "Enable ewok", true).getBoolean(true);
		SWM_31 = config.get(CATEGORY_SWM, "Enable gamorrean", true).getBoolean(true);
		SWM_32 = config.get(CATEGORY_SWM, "Enable hothRebel", true).getBoolean(true);
		SWM_33 = config.get(CATEGORY_SWM, "Enable hothSpeederBike", false).getBoolean(false);
		SWM_34 = config.get(CATEGORY_SWM, "Enable imperialOfficer", true).getBoolean(true);
		SWM_35 = config.get(CATEGORY_SWM, "Enable jakkuSpeeder", false).getBoolean(false);
		SWM_36 = config.get(CATEGORY_SWM, "Enable jawa", true).getBoolean(true);
		SWM_37 = config.get(CATEGORY_SWM, "Enable landspeeder", false).getBoolean(false);
		SWM_38 = config.get(CATEGORY_SWM, "Enable landspeederNpc", false).getBoolean(false);
		SWM_39 = config.get(CATEGORY_SWM, "Enable protonTorpedo", true).getBoolean(true);
		SWM_40 = config.get(CATEGORY_SWM, "Enable rebelPilot", true).getBoolean(true);
		SWM_41 = config.get(CATEGORY_SWM, "Enable rebelPilotA", true).getBoolean(true);
		SWM_42 = config.get(CATEGORY_SWM, "Enable rebelPilotY", true).getBoolean(true);
		SWM_43 = config.get(CATEGORY_SWM, "Enable rebelTechnician", true).getBoolean(true);
		SWM_44 = config.get(CATEGORY_SWM, "Enable rebelWorker", true).getBoolean(true);
		SWM_45 = config.get(CATEGORY_SWM, "Enable sandtrooper", true).getBoolean(true);
		SWM_46 = config.get(CATEGORY_SWM, "Enable scootemaround", false).getBoolean(false);
		SWM_47 = config.get(CATEGORY_SWM, "Enable scootemaroundHoth", false).getBoolean(false);
		SWM_48 = config.get(CATEGORY_SWM, "Enable scouttrooper", true).getBoolean(true);
		SWM_49 = config.get(CATEGORY_SWM, "Enable skyhopper", false).getBoolean(false);
		SWM_50 = config.get(CATEGORY_SWM, "Enable snowspeeder", false).getBoolean(false);
		SWM_51 = config.get(CATEGORY_SWM, "Enable snowtrooper", true).getBoolean(true);
		SWM_52 = config.get(CATEGORY_SWM, "Enable speederBike", false).getBoolean(false);
		SWM_53 = config.get(CATEGORY_SWM, "Enable stormtrooper", true).getBoolean(true);
		SWM_54 = config.get(CATEGORY_SWM, "Enable tauntaun", false).getBoolean(false);
		SWM_55 = config.get(CATEGORY_SWM, "Enable thrownSaber", false).getBoolean(false);
		SWM_56 = config.get(CATEGORY_SWM, "Enable tie", false).getBoolean(false);
		SWM_57 = config.get(CATEGORY_SWM, "Enable tieAdvanced", false).getBoolean(false);
		SWM_58 = config.get(CATEGORY_SWM, "Enable tieBomb", false).getBoolean(false);
		SWM_59 = config.get(CATEGORY_SWM, "Enable tieBomber", false).getBoolean(false);
		SWM_60 = config.get(CATEGORY_SWM, "Enable tieInterceptor", false).getBoolean(false);
		SWM_61 = config.get(CATEGORY_SWM, "Enable tiePilot", true).getBoolean(true);
		SWM_62 = config.get(CATEGORY_SWM, "Enable tusken", true).getBoolean(true);
		SWM_63 = config.get(CATEGORY_SWM, "Enable wampa", true).getBoolean(true);
		SWM_64 = config.get(CATEGORY_SWM, "Enable wookiee", true).getBoolean(true);
		SWM_65 = config.get(CATEGORY_SWM, "Enable xwing", false).getBoolean(true);
		SWM_66 = config.get(CATEGORY_SWM, "Enable xwingNpc", false).getBoolean(false);
		SWM_67 = config.get(CATEGORY_SWM, "Enable yodaBiped", true).getBoolean(true);
		SWM_68 = config.get(CATEGORY_SWM, "Enable ywing", false).getBoolean(false);
			}
		
		if (Loader.isModLoaded("primitivemobs")) {
			
			PM_0 = config.get(CATEGORY_PM, "Enable BabySpider", true).getBoolean(true);
			PM_1 = config.get(CATEGORY_PM, "Enable Ball", false).getBoolean(false);
			PM_2 = config.get(CATEGORY_PM, "Enable BewitchedTome", true).getBoolean(true);
			PM_3 = config.get(CATEGORY_PM, "Enable BlazingJuggernaut", true).getBoolean(true);
			PM_4 = config.get(CATEGORY_PM, "Enable BrainSlime", true).getBoolean(true);
			PM_5 = config.get(CATEGORY_PM, "Enable Chameleon", true).getBoolean(true);
			PM_6 = config.get(CATEGORY_PM, "Enable FestiveCreeper", true).getBoolean(true);
			PM_7 = config.get(CATEGORY_PM, "Enable HauntedTool", false).getBoolean(false);
			PM_8 = config.get(CATEGORY_PM, "Enable Lily", true).getBoolean(true);
			PM_9 = config.get(CATEGORY_PM, "Enable LilyLurker", true).getBoolean(true);
			PM_10 = config.get(CATEGORY_PM, "Enable LostMiner", true).getBoolean(true);
			PM_11 = config.get(CATEGORY_PM, "Enable MimicChest", true).getBoolean(true);
			PM_12 = config.get(CATEGORY_PM, "Enable Minion", true).getBoolean(true);
			PM_13 = config.get(CATEGORY_PM, "Enable MotherSpider", true).getBoolean(true);
			PM_14 = config.get(CATEGORY_PM, "Enable RocketCreeper", true).getBoolean(true);
			PM_15 = config.get(CATEGORY_PM, "Enable Sheepman", true).getBoolean(true);
			PM_16 = config.get(CATEGORY_PM, "Enable SheepmanSmith", true).getBoolean(true);
			PM_17 = config.get(CATEGORY_PM, "Enable SkeletonWarrior", true).getBoolean(true);
			PM_18 = config.get(CATEGORY_PM, "Enable SpawnEgg", false).getBoolean(false);
			PM_19 = config.get(CATEGORY_PM, "Enable Summoner", true).getBoolean(true);
			PM_20 = config.get(CATEGORY_PM, "Enable SupportCreeper", true).getBoolean(true);
			PM_21 = config.get(CATEGORY_PM, "Enable TravelingMerchant", true).getBoolean(true);
			PM_22 = config.get(CATEGORY_PM, "Enable TreasureSlime", true).getBoolean(true);
			
		}
		
		if (Loader.isModLoaded("rafradek_tf2_weapons")) {
			
		TF2STUFF_0 = config.get(CATEGORY_TF2STUFF, "Enable demoman", true).getBoolean(true);
		TF2STUFF_1 = config.get(CATEGORY_TF2STUFF, "Enable dispenser", false).getBoolean(false);
		TF2STUFF_2 = config.get(CATEGORY_TF2STUFF, "Enable engineer", true).getBoolean(true);
		TF2STUFF_3 = config.get(CATEGORY_TF2STUFF, "Enable flame", false).getBoolean(false);
		TF2STUFF_4 = config.get(CATEGORY_TF2STUFF, "Enable grenade", false).getBoolean(false);
		TF2STUFF_5 = config.get(CATEGORY_TF2STUFF, "Enable hale", true).getBoolean(true);
		TF2STUFF_6 = config.get(CATEGORY_TF2STUFF, "Enable heavy", true).getBoolean(true);
		TF2STUFF_7 = config.get(CATEGORY_TF2STUFF, "Enable medic", true).getBoolean(true);
		TF2STUFF_8 = config.get(CATEGORY_TF2STUFF, "Enable pyro", true).getBoolean(true);
		TF2STUFF_9 = config.get(CATEGORY_TF2STUFF, "Enable rocket", false).getBoolean(false);
		TF2STUFF_10 = config.get(CATEGORY_TF2STUFF, "Enable scout", true).getBoolean(true);
		TF2STUFF_11 = config.get(CATEGORY_TF2STUFF, "Enable sentry", false).getBoolean(false);
		TF2STUFF_12 = config.get(CATEGORY_TF2STUFF, "Enable sniper", true).getBoolean(true);
		TF2STUFF_13 = config.get(CATEGORY_TF2STUFF, "Enable soldier", true).getBoolean(true);
		TF2STUFF_14 = config.get(CATEGORY_TF2STUFF, "Enable spy", true).getBoolean(true);
		TF2STUFF_15 = config.get(CATEGORY_TF2STUFF, "Enable sticky", false).getBoolean(false);
		TF2STUFF_16 = config.get(CATEGORY_TF2STUFF, "Enable syringe", false).getBoolean(false);
		TF2STUFF_17 = config.get(CATEGORY_TF2STUFF, "Enable teleporter", false).getBoolean(false);
		
		
		}
		
		AUTOTROPHYLOADER = config.get(CATEGORY_TWEAKS, "Enable Auto Trophy Loader", false).getBoolean(false);
		
		/*
		 * Config Stop
		 */
		config.load();
		config.getLoadedConfigVersion();
		
		config.save();
		
		event.getModLog();
		event.getModState();
		//Configuration configFile = new Configuration(event.getSuggestedConfigurationFile());
		
		//loadConfiguration(configFile);
		
		System.out.println(MoreTrophies.MODID + " >>> Configuration File Loaded");
	}

}

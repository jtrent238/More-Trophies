package com.jtrent238.moretrophies;

import java.io.*; 
import java.util.*;
import java.util.Random;

import com.jim.obstrophiesaoa.trophy.TrophyAoA;
import com.jim.obstrophiesaoa.trophy.TrophyRegistry;

public class AutoTrophyLoader{

		
  public static ArrayList<String> entity_ids;
  private static String modid = "minecraft";

  //Construct String from file
  @SuppressWarnings("resource")
  public static void constructor(String filename) throws IOException{

  ArrayList entity_ids = new ArrayList();
  BufferedReader read = new BufferedReader(new FileReader("obscore_entity_ids.txt"));
  String line = read.readLine();
  read.lines().count();


    	entity_ids.add(line.indexOf(-1));
    	
    	IgnoringEntityIDs();
    	entity_ids.remove("Arrow");
    	entity_ids.remove("Bat");
    	entity_ids.remove("Blaze");
    	entity_ids.remove("Boat");
    	entity_ids.remove("CaveSpider");
    	entity_ids.remove("Chicken");
    	entity_ids.remove("Cow");
    	entity_ids.remove("Creeper");
    	entity_ids.remove("EnderCrystal");
    	entity_ids.remove("EnderDragon");
    	entity_ids.remove("Enderman");
    	entity_ids.remove("EntityHorse");
    	entity_ids.remove("EyeOfEnderSignal");
    	entity_ids.remove("FallingSand");
    	entity_ids.remove("Fireball");
    	entity_ids.remove("FireworksRocketEntity");
    	entity_ids.remove("Ghast");
    	entity_ids.remove("Giant");
    	entity_ids.remove("Item");
    	entity_ids.remove("ItemFrame");
    	entity_ids.remove("LavaSlime");
    	entity_ids.remove("LeashKnot");
    	entity_ids.remove("MinecartChest");
    	entity_ids.remove("MinecartCommandBlock");
    	entity_ids.remove("MinecartFurnace");
    	entity_ids.remove("MinecartHopper");
    	entity_ids.remove("MinecartRideable");
    	entity_ids.remove("MinecartSpawner");
    	entity_ids.remove("MinecartTNT");
    	entity_ids.remove("Mob");
    	entity_ids.remove("Monster");
    	entity_ids.remove("MushroomCow");
    	entity_ids.remove("Ozelot");
    	entity_ids.remove("Painting");
    	entity_ids.remove("Pig");
    	entity_ids.remove("PigZombie");
    	entity_ids.remove("PrimedTnt");
    	entity_ids.remove("Sheep");
    	entity_ids.remove("Silverfish");
    	entity_ids.remove("Skeleton");
    	entity_ids.remove("Slime");
    	entity_ids.remove("SmallFireball");
    	entity_ids.remove("SnowMan");
    	entity_ids.remove("Snowball");
    	entity_ids.remove("Spider");
    	entity_ids.remove("Squid");
    	entity_ids.remove("ThrownEnderpearl");
    	entity_ids.remove("ThrownExpBottle");
    	entity_ids.remove("ThrownPotion");
    	entity_ids.remove("Villager");
    	entity_ids.remove("VillagerGolem");
    	entity_ids.remove("Witch");
    	entity_ids.remove("WitherBoss");
    	entity_ids.remove("WitherSkull");
    	entity_ids.remove("Wolf");
    	entity_ids.remove("XPOrb");
    	entity_ids.remove("Zombie");
      //line = reader.readline();
    }
    





	private static void IgnoringEntityIDs() {

		System.out.println("[DEBUG]: Ignoreing Entity with ID: Arrow, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Bat, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Blaze, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Boat, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: CaveSpider, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Chicken, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Cow, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Creeper, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: EnderCrystal, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: EnderDragon, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Enderman, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: EntityHorse, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: EyeOfEnderSignal, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: FallingSand, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Fireball, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: FireworksRocketEntity, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Ghast, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Giant, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Item, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: ItemFrame, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: LavaSlime, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: LeashKnot, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: MinecartChest, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: MinecartCommandBlock, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: MinecartFurnace, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: MinecartHopper, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: MinecartRideable, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: MinecartSpawner, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: MinecartTNT, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Mob, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Monster, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: MushroomCow, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Ozelot, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Painting, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Pig, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: PigZombie, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: PrimedTnt, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Sheep, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Silverfish, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Skeleton, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Slime, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: SmallFireball, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: SnowMan, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Snowball, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Spider, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Squid, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: ThrownEnderpearl, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: ThrownExpBottle, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: ThrownPotion, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Villager, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: VillagerGolem, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Witch, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: WitherBoss, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: WitherSkull, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Wolf, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: XPOrb, It was not added");
    	System.out.println("[DEBUG]: Ignoreing Entity with ID: Zombie, It was not added");
    	
}





	public static void registerTrophies() {
		
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA(modid, entity_ids.toString())});
		System.out.println("Attempted to register a trophy for entity with ID: " + entity_ids.toString());
	}
	
}
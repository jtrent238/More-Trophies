package com.jtrent238.moretrophies;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.jim.obstrophiesaoa.trophy.TrophyAoA;
import com.jim.obstrophiesaoa.trophy.TrophyRegistry;

public class ManualTrophyLoader extends AutoTrophyLoader{

	
	public static ArrayList<String> entity_ids;
	  private static String modid = "minecraft";
	private static int lineCount = 0;
	  
			
	  //Construct String from file
	  @SuppressWarnings("resource")
	  public static void constructor(String filename) throws IOException{
		  
		  File manTrophies = new File(filename);
		  manTrophies.createNewFile(); //Create the file if it don't already exist
		  
		  List<String> entity_ids = new ArrayList<String>();
		  BufferedReader reader = new BufferedReader(new FileReader(filename));
		  String line;

		  while ((line = reader.readLine()) != null) {
			  entity_ids.add(line);
			  	TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA(modid, line)});
			  	System.out.println("Found entity with ID: " + line);
				System.out.println("Attempted to register a trophy for entity with ID: " + line);
		  }
		  
		  reader.close();
	    }

	
	public static void registerTrophies() {
		
		for (int i = 0; i < lineCount ; i++) {
			
		TrophyRegistry.getInstance().addTrophies(new TrophyAoA[] { new TrophyAoA(modid, entity_ids.get(i))});
		System.out.println("Attempted to register a trophy for entity with ID: " + entity_ids.get(i));
	}
	
}
}

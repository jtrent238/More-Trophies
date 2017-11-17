package com.jtrent238.moretrophies.trophy;

import com.jim.obscore.lib.ObsLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.minecraft.item.ItemStack;

public class PlayerTrophyRegistry
{
  private static PlayerTrophyRegistry instance = new PlayerTrophyRegistry();
  HashMap<String, String> entityNameToTrophyIDCache;
  HashMap<String, TrophyPlayer> trophies;
  
  private PlayerTrophyRegistry()
  {
    this.trophies = new HashMap();
    this.entityNameToTrophyIDCache = new HashMap();
  }
  
  public static PlayerTrophyRegistry getInstance()
  {
    if (instance == null) {
      instance = new PlayerTrophyRegistry();
    }
    return instance;
  }
  
  public boolean addTrophy(TrophyPlayer trophy)
  {
    if (trophyExists(trophy.getID()))
    {
      ObsLog.warn("Registry already contains Trophy with id %s. Registration failed.", new Object[] { trophy.getID() });
      return false;
    }
    this.trophies.put(trophy.getID(), trophy);
    this.entityNameToTrophyIDCache.put(trophy.getRegisteredEntityName(), trophy.getID());
    return true;
  }
  
  public boolean addTrophies(TrophyPlayer... trophies)
  {
    for (TrophyPlayer trophy : trophies) {
      addTrophy(trophy);
    }
    return true;
  }
  
  public TrophyPlayer getTrophyFromID(String trophyID)
  {
    if (this.trophies.containsKey(trophyID)) {
      return (TrophyPlayer)this.trophies.get(trophyID);
    }
    return null;
  }
  
  public TrophyPlayer getTrophyFromEntityName(String entityName)
  {
    if (this.entityNameToTrophyIDCache.containsKey(entityName))
    {
      String trophyID = (String)this.entityNameToTrophyIDCache.get(entityName);
      if (this.trophies.containsKey(trophyID)) {
        return (TrophyPlayer)this.trophies.get(trophyID);
      }
    }
    return null;
  }
  
  public TrophyPlayer getTrophy(String modID, String entityID, String playerName)
  {
    String trophyID = TrophyPlayer.idGenerator(modID, entityID, playerName);
    if (this.trophies.containsKey(trophyID)) {
      return (TrophyPlayer)this.trophies.get(trophyID);
    }
    return null;
  }
  
  public ItemStack getTrophyIS(String trophyID)
  {
    ItemStack stack = null;
    TrophyPlayer trophy = getTrophyFromID(trophyID);
    if (trophy != null) {
      stack = trophy.getItemStack();
    }
    return stack;
  }
  
  public List<ItemStack> getAllTrophyItemStacks()
  {
    List<ItemStack> stacks = new ArrayList();
    for (TrophyPlayer trophy : this.trophies.values()) {
      stacks.add(trophy.getItemStack());
    }
    return stacks;
  }
  
  public boolean trophyExists(String trophyID)
  {
    return this.trophies.containsKey(trophyID);
  }
  
  private ItemStack getBlankTrophyIS()
  {
    TrophyPlayer trophy = getTrophy("minecraft", "EntityPlayer", "jtrent238");
    if (trophy == null)
    {
      ObsLog.warn("[TrophyRegistry] Unable to locate blank trophy", new Object[0]);
      return null;
    }
    return trophy.getItemStack();
  }
}

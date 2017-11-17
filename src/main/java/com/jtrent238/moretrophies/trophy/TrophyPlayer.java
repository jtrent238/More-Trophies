package com.jtrent238.moretrophies.trophy;

import com.jim.obscore.lib.ObsLog;
import com.jim.obstrophiesaoa.ObsTrophiesAoA;
import com.jim.obstrophiesaoa.trophy.EntityCache;
import com.jim.obstrophiesaoa.trophy.TrophyAoA;
import com.jim.obstrophiesaoa.trophy.TrophyRegistry;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class TrophyPlayer
{
  protected String id;
  public String modID;
  public String entityName;
  protected String registeredEntityName;
  protected String displayName;
  private String playerName;
  private double defaultScale = DEFAULT_SCALE;
  private double scale = DEFAULT_SCALE;
  private double defaultVerticalOffset = DEFAULT_VERTICAL_OFFSET;
  private double verticalOffset = DEFAULT_VERTICAL_OFFSET;
  public boolean renderError = false;
  private static String ign = "jtrent238";
  protected static double DEFAULT_VERTICAL_OFFSET = 0.0D;
  protected static double DEFAULT_SCALE = 0.4D;

  
  public TrophyPlayer(String modID, String entityName, String playerName, double verticalOffset, double scale)
  {
    this.modID = modID;
    this.entityName = entityName;
    this.playerName = playerName;
    this.id = generateID();
    this.defaultVerticalOffset = verticalOffset;
    this.verticalOffset = verticalOffset;
    this.defaultScale = scale;
    this.scale = scale;
    initRegisteredEntityName();
    this.renderError = false;
  }
  
  public TrophyPlayer(String modID, String entityName, String playerName)
  {
    this(modID, entityName, playerName, DEFAULT_VERTICAL_OFFSET, DEFAULT_SCALE);
  }
  
  public TrophyPlayer()
  {
    this("Minecraft", "EntityPlayer", ign);
  }
  
  public static String idGenerator(String modID, String entityID, String playerName)
  {
    return String.format("%s:%s", new Object[] { modID, entityID, playerName, });
  }
  
  protected String generateID()
  {
    return idGenerator(this.modID, this.entityName, this.playerName);
  }
  
  public String getID()
  {
    return this.id;
  }
  
  public String getEntityName()
  {
    return this.entityName;
  }
  
  public String getPlayerName()
  {
    return this.playerName;
  }
  
  public String getRegisteredEntityName()
  {
    return this.registeredEntityName;
  }
  
  protected void initRegisteredEntityName()
  {
    if (this.modID.toLowerCase().equals("minecraft")) {
      this.registeredEntityName = this.entityName;
    } else {
      this.registeredEntityName = String.format("%s.%s", new Object[] { this.modID, this.entityName });
    }
    String localizedEntityName = StatCollector.translateToLocalFormatted(
      String.format("entity.%s.name", new Object[] { this.registeredEntityName }));
    
    this.displayName = String.format(
      StatCollector.translateToLocalFormatted("tile.otaoablocktrophy0.entity.name"), new Object[] { localizedEntityName });
  }
  
  public double getScale()
  {
    return this.scale;
  }
  
  public double getDefaultScale()
  {
    return this.defaultScale;
  }
  
  public double getVerticalOffset()
  {
    return this.verticalOffset;
  }
  
  public double getDefaultVerticalOffset()
  {
    return this.defaultVerticalOffset;
  }
  
  public void fromTrophy(TrophyPlayer other)
  {
    this.id = other.id;
    this.modID = other.modID;
    this.entityName = other.entityName;
    this.playerName = other.playerName;
    this.verticalOffset = other.verticalOffset;
    this.defaultScale = other.getDefaultScale();
    this.scale = other.getScale();
    this.defaultVerticalOffset = other.getDefaultVerticalOffset();
    initRegisteredEntityName();
  }
  
  public String getDisplayName()
  {
    return this.displayName;
  }
  
  public ItemStack getItemStack()
  {
    return getItemStack(1);
  }
  
  public ItemStack getItemStack(int amount)
  {
    ItemStack stack = new ItemStack(ObsTrophiesAoA.blockTrophy, amount);
    stack.setTagCompound(writeToNBT());
    stack.setStackDisplayName(getDisplayName());
    return stack;
  }
  
  
  public NBTTagCompound writeToNBT()
  {
    NBTTagCompound compound = new NBTTagCompound();
    compound.setString("id", this.id);
    compound.setString("modID", this.modID);
    compound.setString("entityName", this.entityName);
    compound.setString("playerName", this.playerName);
    compound.setLong("scale", (long) this.scale);
    compound.setLong("verticalOffset", (long) this.verticalOffset);
    return compound;
  }
  
  public void readFromNBT(NBTTagCompound compound)
  {
    this.id = compound.getString("id");
    this.modID = compound.getString("modID");
    this.entityName = compound.getString("entityName");
    this.playerName = compound.getString("playerName");
    this.scale = compound.getLong("scale");
    this.verticalOffset = compound.getLong("verticalOffset");
    TrophyAoA registered = TrophyRegistry.getInstance().getTrophyFromID(this.id);
    if (registered != null)
    {
      this.defaultScale = registered.getDefaultScale();
      this.defaultVerticalOffset = registered.getDefaultVerticalOffset();
    }
    initRegisteredEntityName();
  }
  
  public void toByteBuf(ByteBuf buf)
  {
    buf.writeInt(this.id.length());
    buf.writeBytes(this.id.getBytes());
    
    buf.writeInt(this.modID.length());
    buf.writeBytes(this.modID.getBytes());
    
    buf.writeInt(this.entityName.length());
    buf.writeBytes(this.entityName.getBytes());
    
    buf.writeInt(this.playerName.length());
    buf.writeBytes(this.playerName.getBytes());
    
    buf.writeDouble(this.scale);
    buf.writeDouble(this.verticalOffset);
    buf.writeDouble(this.defaultScale);
    buf.writeDouble(this.defaultVerticalOffset);
  }
  
  public void fromByteBuf(ByteBuf buf)
  {
    int length = buf.readInt();
    this.id = new String(buf.readBytes(length).array());
    
    length = buf.readInt();
    this.modID = new String(buf.readBytes(length).array());
    
    length = buf.readInt();
    this.entityName = new String(buf.readBytes(length).array());
    
    length = buf.readInt();
    this.playerName = new String(buf.readBytes(length).array());
    
    this.scale = buf.readDouble();
    this.verticalOffset = buf.readDouble();
    this.defaultScale = buf.readDouble();
    this.defaultVerticalOffset = buf.readDouble();
    if ((this.id == null) || (this.id.isEmpty()))
    {
      ObsLog.warn("ERROR reading Trophy ByteBuf.", new Object[0]);
      this.modID = "minecraft";
      this.entityName = "EntityPlayer";
      this.playerName = ign;
      this.id = generateID();
      this.scale = DEFAULT_SCALE;
      this.verticalOffset = DEFAULT_VERTICAL_OFFSET;
    }
    initRegisteredEntityName();
  }
}

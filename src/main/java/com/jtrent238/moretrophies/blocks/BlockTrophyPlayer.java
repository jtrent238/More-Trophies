package com.jtrent238.moretrophies.blocks;

import java.util.List;
import java.util.Random;

import com.jim.obscore.blocks.BlockMultiTE;
import com.jim.obscore.lib.Direction;
import com.jim.obscore.lib.ObsLog;
import com.jim.obscore.lib.WorldInterface;
import com.jim.obstrophiesaoa.ObsTrophiesAoA;
import com.jim.obstrophiesaoa.tileentity.TileEntityTrophy;
import com.jim.obstrophiesaoa.trophy.TrophyRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockTrophyPlayer extends BlockMultiTE
{
	  public BlockTrophyPlayer(String blockName, Material material)
	  {
	    super(blockName, material, "obstrophiesaoa", 1, ObsTrophiesAoA.creativeTab);
	    this.setBlockBounds(0.2F, 0.0F, 0.2F, 0.8F, 0.2F, 0.8F);
	    //func_149658_d("nostand");
	  }
	  
	  public boolean func_149662_c()
	  {
	    return false;
	  }
	  
	  public boolean func_149686_d()
	  {
	    return false;
	  }
	  
	  public int func_149645_b()
	  {
	    return 0;
	  }
	  
	  public TileEntity createNewTileEntity(World world, int metadata)
	  {
	    return new TileEntityTrophy();
	  }
	  
	  public void func_149749_a(World world, int x, int y, int z, Block block, int meta)
	  {
	    TileEntity te = world.getTileEntity(x, y, z);
	    if (((te instanceof TileEntityTrophy)) && 
	      (!((TileEntityTrophy)te).breakingInCreative))
	    {
	      ItemStack trophyIS = ((TileEntityTrophy)te).getTrophy().getItemStack();
	      float f = 0.7F;
	      float dx = world.rand.nextFloat() * f + (1.0F - f) * 0.5F;
	      float dy = world.rand.nextFloat() * f + (1.0F - f) * 0.5F;
	      float dz = world.rand.nextFloat() * f + (1.0F - f) * 0.5F;
	      EntityItem entityitem = new EntityItem(world, x + dx, y + dy, z + dz, trophyIS);
	      //entityitem.field_145804_b = 10;
	      //entityitem.func_92059_d().func_77982_d((NBTTagCompound)trophyIS.stackTagCompound.func_150296_c());
	      WorldInterface.spawnEntityInWorld(world, entityitem);
	    }
	    super.func_149749_a(world, x, y, z, block, meta);
	  }
	  
	  public boolean removedByPlayer(World world, EntityPlayer player, int x, int y, int z, boolean willHarvest)
	  {
	    if ((player != null) && (player.capabilities.isCreativeMode))
	    {
	      TileEntity te = world.getTileEntity(x, y, z);
	      if ((te instanceof TileEntityTrophy)) {
	        ((TileEntityTrophy)te).breakingInCreative = true;
	      }
	    }
	    return super.removedByPlayer(world, player, x, y, z, willHarvest);
	  }
	  
	  public Item func_149650_a(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	  {
	    return null;
	  }
	  
	  public AxisAlignedBB func_149668_a(World world, int x, int y, int z)
	  {
	    return AxisAlignedBB.getBoundingBox(x + 0.2D, y + 0.0D, z + 0.2D, x + 0.8D, y + 0.8D, z + 0.8D);
	  }
	  
	  public AxisAlignedBB func_149633_g(World world, int x, int y, int z)
	  {
	    return AxisAlignedBB.getBoundingBox(x + 0.2D, y + 0.0D, z + 0.2D, x + 0.8D, y + 1.0D, z + 0.8D);
	  }
	  
	  public void func_149683_g()
	  {
		  setBlockBounds(0.2F, 0.0F, 0.2F, 0.8F, 0.8F, 0.8F);
	  }
	  
	  public void func_149689_a(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack)
	  {
	    TileEntity te = WorldInterface.getTileEntity(world, x, y, z);
	    if ((te instanceof TileEntityTrophy))
	    {
	      ((TileEntityTrophy)te).updateTrophyFromStack(itemStack);
	      ((TileEntityTrophy)te).setFacing(Direction.getFacingCompass(entity));
	      ((TileEntityTrophy)te).setScale(((TileEntityTrophy)te).getTrophy().getDefaultScale());
	      te.getRenderBoundingBox();
	    }
	  }
	  
	  @SideOnly(Side.CLIENT)
	  public void func_149666_a(Item item, CreativeTabs creativeTabs, List itemStacks)
	  {
	    for (ItemStack stack : TrophyRegistry.getInstance().getAllTrophyItemStacks()) {
	      itemStacks.add(stack);
	    }
	  }
	  
	  public boolean func_149727_a(World world, int x, int y, int z, EntityPlayer entityPlayer, int hitX, float hitY, float hitZ, float meta)
	  {
	    TileEntity te = WorldInterface.getTileEntity(world, x, y, z);
	    if ((te instanceof TileEntityTrophy))
	    {
	      if (entityPlayer.isSneaking())
	      {
	        ((TileEntityTrophy)te).increaseScale();
	      }
	      else
	      {
	        TileEntityTrophy tet = (TileEntityTrophy)te;
	        boolean standInteraction = false;
	        ItemStack itemInUse = entityPlayer.getCurrentEquippedItem().copy();
	        if (itemInUse != null) {
	          if (!tet.hasStand())
	          {
	            if (tet.isDefaultStandItem(itemInUse))
	            {
	              ObsLog.info("Adding Blank Stand to Trophy", new Object[0]);
	              tet.addStand();
	              tet.setStandBlock(itemInUse);
	              standInteraction = true;
	            }
	          }
	          else if ((tet.hasDefaultStand()) && 
	            (tet.setStandBlock(itemInUse)))
	          {
	            ObsLog.info("Added new Block to Trophy Stand", new Object[0]);
	            standInteraction = true;
	          }
	        }
	        if (!standInteraction) {
	          ((TileEntityTrophy)te).playTrophySound(world, x, y, z);
	        }
	      }
	      return true;
	    }
	    return false;
	  }
	  
	  public void func_149699_a(World world, int x, int y, int z, EntityPlayer entityPlayer)
	  {
	    TileEntity te = WorldInterface.getTileEntity(world, x, y, z);
	    if (((te instanceof TileEntityTrophy)) && 
	      (entityPlayer.isSneaking())) {
	      ((TileEntityTrophy)te).decreaseScale();
	    }
	  }
	  
	  public void func_149695_a(World world, int x, int y, int z, Block neighbourBlock)
	  {
	    TileEntity te = WorldInterface.getTileEntity(world, x, y, z);
	    if (((te instanceof TileEntityTrophy)) && (world.blockExists(x, y, z))) {
	      ((TileEntityTrophy)te).playTrophySound(world, x, y, z);
	    }
	  }
	  
	  public void func_149674_a(World world, int x, int y, int z, Random par5Random)
	  {
	    TileEntity te = WorldInterface.getTileEntity(world, x, y, z);
	    if (((te instanceof TileEntityTrophy)) && (world.blockExists(x, y, z))) {
	      ((TileEntityTrophy)te).playTrophySound(world, x, y, z);
	    }
	  }
	  
	  @SideOnly(Side.CLIENT)
	  public IIcon func_149673_e(IBlockAccess blockAccess, int x, int y, int z, int side)
	  {
	    TileEntity te = WorldInterface.getTileEntity(blockAccess, x, y, z);
	    if ((te instanceof TileEntityTrophy))
	    {
	      TileEntityTrophy tet = (TileEntityTrophy)te;
	      if (tet.hasStand())
	      {
	        IIcon iicon = null;
	        String standBlockModID = tet.getTypeBlockModID();
	        String standBlockName = tet.getTypeBlockName();
	        if ((standBlockModID != null) && (!standBlockModID.equals("")) && (standBlockName != null) && (!standBlockName.equals("")))
	        {
	          Block standBlock = GameRegistry.findBlock(standBlockModID, standBlockName);
	          if (standBlock != null) {
	            iicon = standBlock.func_149735_b(side, tet.getTypeBlockMeta());
	          }
	        }
	        if (iicon != null) {
	          return iicon;
	        }
	      }
	    }
	    return super.getIcon(blockAccess, x, y, z, side);
	  }

	}

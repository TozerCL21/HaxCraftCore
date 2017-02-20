package com.haxcraft.corelib;
import net.minecraft.block.Block;
import net.minecrat.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
public class BlockFlamableStone extends Block
{
	String name = "flamablestone"
	
	public BlockFlamableStone()
	{
		super(Material.rock);
		setBlockName(HaxCraftCore.MODID + "_" + name);
		setBlockTextureName(HaxCraftCore.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(2F);
		setResistance(5F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 2);
	}
}

		

package com.haxcraft.corelib.items;
import com.haxcraft.corelib;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class ItemHaxCraftCoreGeneric extends Item
{
	public ItemHaxCraftCoreGeneric(String name)
	{
		setUnlocalizedName(HaxCraftCore.MODID + "_" + name);
		setTextureName(HaxCraftCore.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabMisc);
	}
}

package com.haxcraft.corelib

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemKey extends Item
{
	public ItemKey(String itemName)
	{
		setUnlocalizedName(HaxCraftCore.MODID + "_" + itemName);
		setTextureName(HaxCraftCore.MODID + ":" + itemName);
		setCreativeTab(CreativeTabs.tabMisc);
	}
}

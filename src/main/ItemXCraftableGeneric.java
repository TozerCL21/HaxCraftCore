package com.haxcraft.corelib.items;
import com.haxcraft.corelib;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class ItemXCraftableGeneric extends Item
{
	public ItemXCraftableGeneric(String name)
	{
		setUnlocalizedName(HaxCraftCore.MODID + "_" + name);
		setTextureName(HaxCraftCore.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabMisc);
	}
}

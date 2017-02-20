package com.haxcraft.corelib
import net.minecraft.tool.ToolMaterial
import net.minecraft.item.ItemHoe

public class ItemFlamableHoe extends ItemSword
{
	public ItemFlamableHoe(TooMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName(HaxCraftCore.MODID + "_" + name);
		setTextureName(HaxCraftCore.MODID + ":" + name);
	}
}

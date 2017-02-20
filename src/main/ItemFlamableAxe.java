package com.haxcraft.corelib
import net.minecraft.tool.ToolMaterial
import net.minecraft.item.ItemAxe

public class ItemFlamableAxe extends ItemAxe
{
	public ItemFlamableAxe(TooMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName(HaxCraftCore.MODID + "_" + name);
		setTextureName(HaxCraftCore.MODID + ":" + name);
	}
}

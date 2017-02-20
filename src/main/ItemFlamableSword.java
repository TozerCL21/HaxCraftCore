package com.haxcraft.corelib
import net.minecraft.tool.ToolMaterial
import net.minecraft.item.ItemSword

public class ItemFlamableSword extends ItemSword
{
	public ItemFlamableSword(TooMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName(HaxCraftCore.MODID + "_" + name);
		setTextureName(HaxCraftCore.MODID + ":" + name);
	}
}

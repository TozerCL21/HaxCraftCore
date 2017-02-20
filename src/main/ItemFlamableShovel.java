package com.haxcraft.corelib
import net.minecraft.tool.ToolMaterial
import net.minecraft.item.ItemShovel

public class ItemFlamableShovel extends ItemShovel
{
	public ItemFlamableShovel(TooMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName(HaxCraftCore.MODID + "_" + name);
		setTextureName(HaxCraftCore.MODID + ":" + name);
	}
}

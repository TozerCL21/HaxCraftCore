package com.haxcraft.corelib
import net.minecraft.tool.ToolMaterial
import net.minecraft.item.ItemPickaxe

public class ItemFlamablePick extends ItemPickaxe 
{
	public ItemFlamablePick(TooMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName(HaxCraftCore.MODID + "_" + name);
		setTextureName(HaxCraftCore.MODID + ":" + name);
	}
}
		

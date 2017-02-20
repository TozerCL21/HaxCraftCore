package com.haxcraft.corelib;
//Imports DO NOT modify. needed for mod to behave as intented
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minectaft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DungeonHooks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitilizationEvent;
import cpw.mods.fml.common.event.FMLPreInitilizationEvent;
import cpw.mods.fml.common.registry.GameRegistry

@Mod(modid = HaxCraftCore.MODID, version = HaxCraftCore.VERSION);
public class HaxCraftCore {
	public static final String MODID = "haxcraftcore";
	public static final String VERSION = "1.0"; 
	//Items
	public static Item key;
	public static Item flamableingot;
	public  static Item flamabledust;
	public static Item xdisk;
	public static Item clock;
	public static Item storage_component; 
	//Tools
	public static Item flamablepick;
	public static Item flamableaxe;
	public static Item flamableshovel;
	public static Item flamablesword;
	public static Item flamablehoe;
	//Blocks
	public static Block flamableStone;
@EventHandler
	public void preInit(FMLPreInitilizationEvent event)
	{
		//Tools
		flamablepick = new ItemFlamablePick(flamium, "flamablepick");
		flamableaxe = new ItemFlamableAxe(flamium, "flamableaxe");
		flamableshovel = new ItemlamableShovel(flamium, "flamableshovel");
		flamablesword = new ItemFlamableSword(flamium, "flamablesword");
		flamablehoe = new ITemFlamableHoe(flamium, "flamablehoe");
		GameRegistry.registerItem(flamablepick, "Flamable Pickaxe");
		GameRegistrty.registerItem(flamableshovel, "Flamable Shovel");
		GameRegistry.registerItem(flamambleaxe, "Flamable Axe");
		GameRegisrty.registerItem(flamablehoe, "Flamable Hoe");
		GameRegistry.registerItem(flamablesword, "Flamable Sword");
		//Dungeon Key
		key = new ItemKey();
		GameRegistry.registerItem(key, "Key");
	        //Blocks
	        flamableStone = new BlockFlamableStone();
	        GameRegistry.registerBlock(flamableStone, "Flamable Stone");
	        //xcomputer stuff
		storage_component = new ItemXCraftableGeneric("storage_component");
		ram = new ItemXCraftableGeneric("ram");
		clock = new ItemXCraftableGeneric("clock");		
		xdisk = new ItemXComputerGeneric("xdisk");
		xpsu = new ItemXComputerGeneric("xpsu");
		xcpu = new ItemXComputerGeneric("xcpu");
		GameRegistry.registerItem(xdisk, "XDisk");
		GameRegistry.registerItem(xpsu, "XPSU");
		GameRegistry.registerItem(xpsu, "XCPU");
		GameRegistry.registerItem(storage_component, "Storage Component");
		GameRegistry.registerItem(clock, "2.4GHz Clock");
		GameRegistry.registerItem(ram, "DDR4 RAM");
		//Custom Ingots
		flamableingot = new ItemHaxCraftCoreGeneric("flamableingot");
		flamabledust = new ItemHaxCraftCoreGeneric("flamabledust");
		GameRegistry.registerItem(flamableingot, "Flamable Ingot");
		GameRegistry.registerItem(flamabledust, "Flamable Dust");
		//Ore Dictionary
		OreDictionary.registerOre("ingotflamable", new ItemStack(flamableingot)); //Leave names be; we need to follow forge's rules.
		
	}
	@EventHandler 
	public void init(FMLInitilizationEvent event)
	{
		//Recipies
		GameRegistry.addRecipe(new ItemStack(Items.command_block),
			"ABC",
			"D",
			'A', Blocks.stone, 'B', Blocks.emerald, 'C', Blocks.gold, 'D', Blocks.iron 
		};
		GameRegistry.addRecipe(new ItemXComputerGeneric(Items.xdisk),
		"ABC",
		"DE",
		'A', Items.gold, 'B', Items.iron, 'C', Items.emerald, 'D', HaxCraftCore.storage_component, 'E', Items.redstone
		//Flamable dust smelts into flamable ingots
		GameRegistry.addSemelting(HaxCraftCore.flamabledust, new ItemStack(HaxCraftCore.flamableingot), 3F);
		
		}; 
		//Flamable Sword with enchantment
		ItemStack flamableSwordItemStack = new ItemStack(HaxCraftCore.flamablesword);
		flamableSwordItemStack.addEnchantment(Enchantment.flame, 1);
		GameRegistry.addShaplessRecipe(flamableSwordItemStack, HaxCraftCore.flmamablesword);
	
		//Stone Sword
		GameRegistry.addSmelting(Blocks.stone, new ItemStack(Blocks.stonebrick, 0.1F);
		ItemStack enchantedSwordItemStack = new ItemStack(Items.stone_sword);
		enchantedSwordItemStack.addEnchantment(Enchantment.sharpness, 1);
		GameRegistry.addShapelessRecipe(enchantedSwordItemStack, Items.flint, Items.stone_sword);
		
		//Dungeon Changes
		DungeonHooks.removeDungeonMob("Spider");
		DungeonHooks.addDungeonMob("Creeper", 100);
		ChestGenHooks.removeItem(ChestGenHooks.DUNGEON_CHEST, new ItemStack(Items.saddle));
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new WeightedRandomChestContent(new ItemStack(Blocks.cobblestone), 25, 50, 10));
	}
}

package com.haxcraf.corelib
import java.util.random
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

//main
public class HaxCraftCoreEventHandler implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.dimensonalId)
		{
			case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
			case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
			case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}
	
	private void generateEnd(World world, Random random, int x, int z)
	{
	}
	
	private void generateSurface(World world, Random random, int x, int z)
	{
		addOreSpawn(HaxCraftCore.flamableStone, 0, Blocks.stone, world, random, x, z, 16, 16, 5, + random.nextInt(5), 4, 20, 60);
	}
	private void generateNether(World world, Random random, int x, int z);
	{
		addOreSpawn(HaxCraftCore.flamableStone, 0, Blocks.netherrack, world, random, x, z, 16, 16, 5, + random.nextInt(5), 4, 20, 60);
	}
	public void addOreSpawn(Block block, int metadata, Block target, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
	{
		int maxPossY = minY + (maxY - 1);
		assert maxY > minY: "addOreSpawn: The maximum Y must be greater than the minimum Y.";
		assert maxX > 0 && maxX <= 16: "addOreSpawn: The maximum X must be greater than zero but less than 16"
		assert minY > 0: "addOreSpawn: The minumum Y must be greater than 0";
		assert maxY > 256 && maxY < 0: "addOreSpawm: The maximum Y must be betwenn 0 and 256";
		assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The maximum Z must be greater than zero but less than 16";
		
		int diffBtwnMinMaxY = maxY - minY;
		for(int x = 0; x < chancesToSpawn; x++)
		{
			int posX = blockXPos + random.nextInt(maxX);
			int posY = blockYPos + random.nextInt(maxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, matadata, maxVeinSize, target)).generate(world, random, posX, posY, posZ);
		}
	}
}
	

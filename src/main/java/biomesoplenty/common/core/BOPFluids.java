package biomesoplenty.common.core;

import static biomesoplenty.common.core.BOPBlocks.registerBlock;
import static biomesoplenty.common.core.BOPItems.registerItem;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidContainerRegistry.FluidContainerData;
import net.minecraftforge.fluids.FluidRegistry;
import biomesoplenty.api.BOPBlockHelper;
import biomesoplenty.common.fluids.HoneyFluid;
import biomesoplenty.common.fluids.PoisonFluid;
import biomesoplenty.common.fluids.SpringWaterFluid;
import biomesoplenty.common.fluids.blocks.BlockHoneyFluid;
import biomesoplenty.common.fluids.blocks.BlockPoisonFluid;
import biomesoplenty.common.fluids.blocks.BlockSpringWaterFluid;
import biomesoplenty.common.items.ItemBOPBucket;

public class BOPFluids 
{
	public static Fluid poison;
	public static Fluid spring_water;
	public static Fluid honey;
	
	public static void init()
	{
		registerFluids();
		registerFluidBlocks();
	}

	private static void registerFluids()
	{
		registerFluid(poison = new PoisonFluid("poison"));
		registerFluid(spring_water = new SpringWaterFluid("spring_water"));
		registerFluid(honey = new HoneyFluid("honey"));
	}

	private static void registerFluidBlocks()
	{
		registerBlock(new BlockPoisonFluid().setBlockName("poison"));
		registerBlock(new BlockSpringWaterFluid().setBlockName("springWater"));
		registerBlock(new BlockHoneyFluid().setBlockName("honey"));
		
		poison.setBlock(BOPBlockHelper.get("poison"));
		spring_water.setBlock(BOPBlockHelper.get("springWater"));
		honey.setBlock(BOPBlockHelper.get("honey"));
	}
	
	public static void registerFluid(Fluid fluid)
	{
		FluidRegistry.registerFluid(fluid);
	}
}
package net.mcreator.beavers.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.beavers.network.BeaversModVariables;
import net.mcreator.beavers.entity.BeaverEntity;
import net.mcreator.beavers.BeaversMod;

public class BeaverOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 200) == 1) {
			if (entity instanceof BeaverEntity) {
				((BeaverEntity) entity).setAnimation("shakeears");
			}
		}
		if (Mth.nextInt(RandomSource.create(), 1, 5) == 1) {
			BeaversModVariables.WorldVariables.get(world).ywaterplace = Mth.nextInt(RandomSource.create(), 1, 14);
			BeaversModVariables.WorldVariables.get(world).syncData(world);
			if ((world.getBlockState(BlockPos.containing(x, y - BeaversModVariables.WorldVariables.get(world).ywaterplace, z))).getBlock() == Blocks.WATER) {
				world.setBlock(BlockPos.containing(x, y - BeaversModVariables.WorldVariables.get(world).ywaterplace, z), Blocks.OAK_WOOD.defaultBlockState(), 3);
			}
		}
		if (Mth.nextInt(RandomSource.create(), 1, 100) == 1) {
			if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.WATER) {
				if (entity instanceof BeaverEntity) {
					((BeaverEntity) entity).setAnimation("carve");
				}
				BeaversMod.queueServerWork(20, () -> {
					world.setBlock(BlockPos.containing(x + 1, y - 1, z), Blocks.OAK_WOOD.defaultBlockState(), 3);
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.OAK_WOOD.defaultBlockState()));
				});
			}
			if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.WATER) {
				if (entity instanceof BeaverEntity) {
					((BeaverEntity) entity).setAnimation("carve");
				}
				BeaversMod.queueServerWork(20, () -> {
					world.setBlock(BlockPos.containing(x - 1, y - 1, z), Blocks.OAK_WOOD.defaultBlockState(), 3);
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.OAK_WOOD.defaultBlockState()));
				});
			}
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.WATER) {
				if (entity instanceof BeaverEntity) {
					((BeaverEntity) entity).setAnimation("carve");
				}
				BeaversMod.queueServerWork(20, () -> {
					world.setBlock(BlockPos.containing(x, y - 1, z + 1), Blocks.OAK_WOOD.defaultBlockState(), 3);
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.OAK_WOOD.defaultBlockState()));
				});
			}
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.WATER) {
				if (entity instanceof BeaverEntity) {
					((BeaverEntity) entity).setAnimation("carve");
				}
				BeaversMod.queueServerWork(20, () -> {
					world.setBlock(BlockPos.containing(x, y - 1, z - 1), Blocks.OAK_WOOD.defaultBlockState(), 3);
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.OAK_WOOD.defaultBlockState()));
				});
			}
		}
	}
}

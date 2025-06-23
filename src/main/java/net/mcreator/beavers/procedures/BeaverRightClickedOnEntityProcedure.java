package net.mcreator.beavers.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.beavers.entity.BeaverEntity;
import net.mcreator.beavers.BeaversMod;

public class BeaverRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.OAK_LOG.asItem()) {
			if (entity instanceof BeaverEntity) {
				((BeaverEntity) entity).setAnimation("carve");
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")), SoundSource.NEUTRAL, (float) 0.5, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
				}
			}
			BeaversMod.queueServerWork(2, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")), SoundSource.NEUTRAL, (float) 0.5, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
					}
				}
				BeaversMod.queueServerWork(2, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")), SoundSource.NEUTRAL, (float) 0.5, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
						}
					}
					BeaversMod.queueServerWork(2, () -> {
						world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.OAK_LOG.defaultBlockState()));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
						BeaversMod.queueServerWork(2, () -> {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")), SoundSource.NEUTRAL, (float) 0.5, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
								}
							}
							BeaversMod.queueServerWork(2, () -> {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")), SoundSource.NEUTRAL, (float) 0.5, 1);
									} else {
										_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
									}
								}
								BeaversMod.queueServerWork(2, () -> {
									world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.OAK_LOG.defaultBlockState()));
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")), SoundSource.NEUTRAL, (float) 0.5, 1);
										} else {
											_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
										}
									}
									BeaversMod.queueServerWork(2, () -> {
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")), SoundSource.NEUTRAL, (float) 0.5, 1);
											} else {
												_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
											}
										}
										BeaversMod.queueServerWork(2, () -> {
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")), SoundSource.NEUTRAL, (float) 0.5, 1);
												} else {
													_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
												}
											}
											BeaversMod.queueServerWork(2, () -> {
												world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.OAK_LOG.defaultBlockState()));
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")), SoundSource.NEUTRAL, (float) 0.5, 1);
													} else {
														_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
													}
												}
												BeaversMod.queueServerWork(2, () -> {
													if (world instanceof Level _level) {
														if (!_level.isClientSide()) {
															_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")), SoundSource.NEUTRAL, (float) 0.5, 1);
														} else {
															_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.hit")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
														}
													}
												});
											});
										});
									});
								});
							});
						});
					});
				});
			});
			BeaversMod.queueServerWork(20, () -> {
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.OAK_LOG.defaultBlockState()));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.break")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.wood.break")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				for (int index0 = 0; index0 < (int) Mth.nextDouble(RandomSource.create(), 2, 5); index0++) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.OAK_PLANKS));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			});
		}
	}
}

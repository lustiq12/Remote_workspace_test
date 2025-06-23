
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beavers.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.beavers.item.TestItem;
import net.mcreator.beavers.item.HardHatYellowItem;
import net.mcreator.beavers.item.HardHatWhiteItem;
import net.mcreator.beavers.item.HardHatRedItem;
import net.mcreator.beavers.item.HardHatPurpleItem;
import net.mcreator.beavers.item.HardHatPinkItem;
import net.mcreator.beavers.item.HardHatOrangeItem;
import net.mcreator.beavers.item.HardHatMagentaItem;
import net.mcreator.beavers.item.HardHatLimeItem;
import net.mcreator.beavers.item.HardHatLightGrayItem;
import net.mcreator.beavers.item.HardHatLightBlueItem;
import net.mcreator.beavers.item.HardHatGreenItem;
import net.mcreator.beavers.item.HardHatGrayItem;
import net.mcreator.beavers.item.HardHatCyanItem;
import net.mcreator.beavers.item.HardHatBrownItem;
import net.mcreator.beavers.item.HardHatBlueItem;
import net.mcreator.beavers.item.HardHatBlackItem;
import net.mcreator.beavers.BeaversMod;

public class BeaversModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(BeaversMod.MODID);
	public static final DeferredItem<Item> BEAVER_SPAWN_EGG = REGISTRY.register("beaver_spawn_egg", () -> new DeferredSpawnEggItem(BeaversModEntities.BEAVER, -11514785, -13425884, new Item.Properties()));
	public static final DeferredItem<Item> TEST_CHESTPLATE = REGISTRY.register("test_chestplate", TestItem.Chestplate::new);
	public static final DeferredItem<Item> HARD_HAT_YELLOW_HELMET = REGISTRY.register("hard_hat_yellow_helmet", HardHatYellowItem.Helmet::new);
	public static final DeferredItem<Item> HARD_HAT_BLACK_HELMET = REGISTRY.register("hard_hat_black_helmet", HardHatBlackItem.Helmet::new);
	public static final DeferredItem<Item> HARD_HAT_BLUE_HELMET = REGISTRY.register("hard_hat_blue_helmet", HardHatBlueItem.Helmet::new);
	public static final DeferredItem<Item> HARD_HAT_BROWN_HELMET = REGISTRY.register("hard_hat_brown_helmet", HardHatBrownItem.Helmet::new);
	public static final DeferredItem<Item> HARD_HAT_CYAN_HELMET = REGISTRY.register("hard_hat_cyan_helmet", HardHatCyanItem.Helmet::new);
	public static final DeferredItem<Item> HARD_HAT_GRAY_HELMET = REGISTRY.register("hard_hat_gray_helmet", HardHatGrayItem.Helmet::new);
	public static final DeferredItem<Item> HARD_HAT_GREEN_HELMET = REGISTRY.register("hard_hat_green_helmet", HardHatGreenItem.Helmet::new);
	public static final DeferredItem<Item> HARD_HAT_LIGHT_BLUE_HELMET = REGISTRY.register("hard_hat_light_blue_helmet", HardHatLightBlueItem.Helmet::new);
	public static final DeferredItem<Item> HARD_HAT_LIGHT_GRAY_HELMET = REGISTRY.register("hard_hat_light_gray_helmet", HardHatLightGrayItem.Helmet::new);
	public static final DeferredItem<Item> HARD_HAT_LIME_HELMET = REGISTRY.register("hard_hat_lime_helmet", HardHatLimeItem.Helmet::new);
	public static final DeferredItem<Item> HARD_HAT_MAGENTA_HELMET = REGISTRY.register("hard_hat_magenta_helmet", HardHatMagentaItem.Helmet::new);
	public static final DeferredItem<Item> HARD_HAT_ORANGE_HELMET = REGISTRY.register("hard_hat_orange_helmet", HardHatOrangeItem.Helmet::new);
	public static final DeferredItem<Item> HARD_HAT_PINK_HELMET = REGISTRY.register("hard_hat_pink_helmet", HardHatPinkItem.Helmet::new);
	public static final DeferredItem<Item> HARD_HAT_PURPLE_HELMET = REGISTRY.register("hard_hat_purple_helmet", HardHatPurpleItem.Helmet::new);
	public static final DeferredItem<Item> HARD_HAT_RED_HELMET = REGISTRY.register("hard_hat_red_helmet", HardHatRedItem.Helmet::new);
	public static final DeferredItem<Item> HARD_HAT_WHITE_HELMET = REGISTRY.register("hard_hat_white_helmet", HardHatWhiteItem.Helmet::new);
	// Start of user code block custom items
	// End of user code block custom items
}

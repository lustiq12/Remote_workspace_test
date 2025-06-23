
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beavers.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.beavers.BeaversMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class BeaversModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BeaversMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(BeaversModItems.BEAVER_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(BeaversModItems.TEST_CHESTPLATE.get());
			tabData.accept(BeaversModItems.HARD_HAT_YELLOW_HELMET.get());
			tabData.accept(BeaversModItems.HARD_HAT_BLACK_HELMET.get());
			tabData.accept(BeaversModItems.HARD_HAT_BLUE_HELMET.get());
			tabData.accept(BeaversModItems.HARD_HAT_BROWN_HELMET.get());
			tabData.accept(BeaversModItems.HARD_HAT_CYAN_HELMET.get());
			tabData.accept(BeaversModItems.HARD_HAT_GRAY_HELMET.get());
			tabData.accept(BeaversModItems.HARD_HAT_GREEN_HELMET.get());
			tabData.accept(BeaversModItems.HARD_HAT_LIGHT_BLUE_HELMET.get());
			tabData.accept(BeaversModItems.HARD_HAT_LIGHT_GRAY_HELMET.get());
			tabData.accept(BeaversModItems.HARD_HAT_LIME_HELMET.get());
			tabData.accept(BeaversModItems.HARD_HAT_MAGENTA_HELMET.get());
			tabData.accept(BeaversModItems.HARD_HAT_ORANGE_HELMET.get());
			tabData.accept(BeaversModItems.HARD_HAT_PINK_HELMET.get());
			tabData.accept(BeaversModItems.HARD_HAT_PURPLE_HELMET.get());
			tabData.accept(BeaversModItems.HARD_HAT_RED_HELMET.get());
			tabData.accept(BeaversModItems.HARD_HAT_WHITE_HELMET.get());
		}
	}
}

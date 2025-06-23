package net.mcreator.beavers.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.beavers.entity.BeaverEntity;

public class BeaverModel extends GeoModel<BeaverEntity> {
	@Override
	public ResourceLocation getAnimationResource(BeaverEntity entity) {
		return ResourceLocation.parse("beavers:animations/beaver.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BeaverEntity entity) {
		return ResourceLocation.parse("beavers:geo/beaver.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BeaverEntity entity) {
		return ResourceLocation.parse("beavers:textures/entities/" + entity.getTexture() + ".png");
	}

}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nihility.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.nihility.item.WaterBucketItem;
import net.mcreator.nihility.NihilityMod;

public class NihilityModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NihilityMod.MODID);
	public static final RegistryObject<Item> WATER_BUCKET = REGISTRY.register("water_bucket", () -> new WaterBucketItem());
	// Start of user code block custom items
	// End of user code block custom items
}

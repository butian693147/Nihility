
package net.mcreator.nihility.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class WaterBucketItem extends Item {
	public WaterBucketItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}

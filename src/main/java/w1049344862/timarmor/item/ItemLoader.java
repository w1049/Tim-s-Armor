package w1049344862.timarmor.item;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader {
	public static ItemArmor timHelmet = new ItemTimArmor.Helmet();
	public static ItemArmor timChestplate = new ItemTimArmor.Chestplate();
	public static ItemArmor timLeggings = new ItemTimArmor.Leggings();
	public static ItemArmor timBoots = new ItemTimArmor.Boots();

	public ItemLoader(FMLPreInitializationEvent event) {
		register(timHelmet, "tim_helmet");
		register(timChestplate, "tim_chestplate");
		register(timLeggings, "tim_leggings");
		register(timBoots, "tim_boots");
	}

	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		registerRender(timHelmet);
		registerRender(timChestplate);
		registerRender(timLeggings);
		registerRender(timBoots);
	}

	private static void register(Item item, String name) {
		GameRegistry.registerItem(item, name);
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(Item item) {
		String name = GameData.getItemRegistry().getNameForObject(item).toString();
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(name, "inventory"));
	}
}
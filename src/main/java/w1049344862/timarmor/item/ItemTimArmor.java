package w1049344862.timarmor.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ItemTimArmor extends ItemArmor

{
	public static final ItemArmor.ArmorMaterial TIMARMOR = EnumHelper.addArmorMaterial("TIMARMOR", "timarmor:timarmor",
			34, new int[] { 4, 9, 7, 6 }, 45);

	public ItemTimArmor(int armorType) {
		super(TIMARMOR, TIMARMOR.ordinal(), armorType);
	}

	public static class Helmet extends ItemTimArmor {
		public Helmet() {
			super(0);
			this.setMaxDamage(0);
			this.setUnlocalizedName("timHelmet");
			this.setCreativeTab(CreativeTabs.tabCombat);
		}

		@Override
		public boolean isItemTool(ItemStack stack) {
			return true;
		}

	}

	public static class Chestplate extends ItemTimArmor {
		public Chestplate() {
			super(1);
			this.setMaxDamage(0);
			this.setUnlocalizedName("timChestplate");
			this.setCreativeTab(CreativeTabs.tabCombat);

		}

		@Override
		public boolean isItemTool(ItemStack stack) {
			return true;
		}

	}

	public static class Leggings extends ItemTimArmor {
		public Leggings() {
			super(2);
			this.setMaxDamage(0);
			this.setUnlocalizedName("timLeggings");
			this.setCreativeTab(CreativeTabs.tabCombat);
		}

		@Override
		public boolean isItemTool(ItemStack stack) {
			return true;
		}
	}

	public static class Boots extends ItemTimArmor {
		public Boots() {
			super(3);
			this.setMaxDamage(0);
			this.setUnlocalizedName("timBoots");
			this.setCreativeTab(CreativeTabs.tabCombat);

		}

		@Override
		public boolean isItemTool(ItemStack stack) {
			return true;
		}
	}
}
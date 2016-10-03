package w1049344862.timarmor.common;

import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import w1049344862.timarmor.item.ItemLoader;

public class EventLoader {
	public EventLoader() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void onLivingHurt(LivingHurtEvent event) {
		if (event.source.getDamageType().equals("fall")) {
			if (event.entityLiving.getEquipmentInSlot(1) != null) {
				Item I = event.entityLiving.getEquipmentInSlot(1).getItem();
				if (I == ItemLoader.timBoots) {
					event.ammount /= 5;
				}

			}
		}
	}

	@SubscribeEvent
	public void onAttackEntity(AttackEntityEvent event) {
		if (event.entityLiving.getEquipmentInSlot(1) != null && event.entityLiving.getEquipmentInSlot(2) != null
				&& event.entityLiving.getEquipmentInSlot(3) != null
				&& event.entityLiving.getEquipmentInSlot(4) != null) {
			if (event.entityLiving.getEquipmentInSlot(1).getItem() == ItemLoader.timBoots
					&& event.entityLiving.getEquipmentInSlot(2).getItem() == ItemLoader.timLeggings
					&& event.entityLiving.getEquipmentInSlot(3).getItem() == ItemLoader.timChestplate
					&& event.entityLiving.getEquipmentInSlot(4).getItem() == ItemLoader.timHelmet) {
				event.target.attackEntityFrom(DamageSource.lightningBolt, 8);
			}
		}
	}
}
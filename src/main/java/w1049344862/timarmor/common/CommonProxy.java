package w1049344862.timarmor.common;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import w1049344862.timarmor.item.ItemLoader;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		new ItemLoader(event);
	}

	public void init(FMLInitializationEvent event) {
		new EventLoader();
	}

	public void postInit(FMLPostInitializationEvent event) {

	}
}
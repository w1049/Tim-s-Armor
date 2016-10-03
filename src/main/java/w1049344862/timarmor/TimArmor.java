package w1049344862.timarmor;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import w1049344862.timarmor.common.CommonProxy;

@Mod(modid = TimArmor.MODID, name = TimArmor.NAME, version = TimArmor.VERSION, acceptedMinecraftVersions = "1.8.9")
public class TimArmor {
	public static final String MODID = "timarmor";
	public static final String NAME = "Tim's Armor";
	public static final String VERSION = "@version@";

	@Instance(TimArmor.MODID)
	public static TimArmor instance;

	@SidedProxy(clientSide = "w1049344862.timarmor.client.ClientProxy", serverSide = "w1049344862.timarmor.common.CommonProxy")
	public static CommonProxy p;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		p.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		p.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		p.postInit(event);
	}
}
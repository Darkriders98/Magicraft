package net.Darkriders98.Magicraft;

import net.Darkriders98.Magicraft.utils.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.Darkriders98.Magicraft.proxy.*;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)

public class Magicraft {
	
	@SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY)
	public static CommonProxy proxy;
	
	@Mod.Instance(References.MODID)
	public static Magicraft instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e){
		proxy.preInit();
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent e){
		proxy.Init();
	}
}

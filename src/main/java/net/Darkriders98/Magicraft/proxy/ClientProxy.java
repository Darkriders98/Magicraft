package net.Darkriders98.Magicraft.proxy;

import net.Darkriders98.Magicraft.init.ModItems;

public class ClientProxy extends net.Darkriders98.Magicraft.proxy.CommonProxy{

	@Override
	public void preInit(){
		super.preInit();
		ModItems.RegisterRenders();
	}
	
	@Override
	public void Init(){
		super.Init();
	}
	
}

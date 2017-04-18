package net.Darkriders98.Magicraft.proxy;

import net.Darkriders98.Magicraft.init.ModItems;

public class CommonProxy {

	public void preInit(){
		ModItems.InitItems();
		ModItems.RegisterItems();
	}
	
	public void Init(){
		
	}
	
}

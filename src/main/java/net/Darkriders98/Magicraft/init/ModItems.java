package net.Darkriders98.Magicraft.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.Darkriders98.Magicraft.utils.*;

public class ModItems {
	
	public ModItems(){
		InitItems();
		RegisterItems();
		RegisterRenders();
	}
	
	public Item fire_element;
	public Item water_element;
	public Item earth_element;
	public Item lightning_element;
	public Item life_element;
	public Item arcane_element;
	public Item frost_element;
	public Item shield_element;
	public Item steam_element;
	public Item ice_element;
	public Item staff;
	
	public void InitItems(){
		fire_element = new Item().setRegistryName("fire_element").setUnlocalizedName("fire_element");
		water_element = new Item().setRegistryName("water_element").setUnlocalizedName("water_element");
		earth_element = new Item().setRegistryName("earth_element").setUnlocalizedName("earth_element");
		lightning_element = new Item().setRegistryName("lightning_element").setUnlocalizedName("lightning_element");
		life_element = new Item().setRegistryName("life_element").setUnlocalizedName("life_element");
		arcane_element = new Item().setRegistryName("arcane_element").setUnlocalizedName("arcane_element");
		frost_element = new Item().setRegistryName("frost_element").setUnlocalizedName("frost_element");
		shield_element = new Item().setRegistryName("shield_element").setUnlocalizedName("shield_element");
		staff = new Item().setRegistryName("staff").setUnlocalizedName("staff");
		
	}

	public void RegisterItems(){
		registerItem(fire_element);
		registerItem(water_element);
		registerItem(earth_element);
		registerItem(lightning_element);
		registerItem(life_element);
		registerItem(arcane_element);
		registerItem(frost_element);
		registerItem(shield_element);
		registerItem(staff);
	}
	
	@SideOnly(Side.CLIENT)
	public void RegisterRenders(){
		registerRender(staff, 0);
		registerRender(fire_element, 1);
		registerRender(water_element, 2);
		registerRender(earth_element, 3);
		registerRender(lightning_element, 4);
		registerRender(life_element, 5);
		registerRender(frost_element, 6);
		registerRender(arcane_element, 7);
		registerRender(shield_element, 8);
	}
	
	private void registerItem(Item item){
		GameRegistry.register(item);
	}
	
	private void registerRender(Item item,int meta){
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(References.MODID, item.getUnlocalizedName().substring(5)), "inventory"));		
	}
}

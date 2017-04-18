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
	
	public static Item fire_element;
	public static Item water_element;
	public static Item earth_element;
	public static Item lightning_element;
	public static Item life_element;
	public static Item arcane_element;
	public static Item frost_element;
	public static Item shield_element;
	public static Item steam_element;
	public static Item ice_element;
	public static Item staff;
	
	public static void InitItems(){
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

	public static void RegisterItems(){
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
	public  static void RegisterRenders(){
		registerRender(staff, 0);
		registerRender(fire_element, 0);
		registerRender(water_element, 0);
		registerRender(earth_element, 0);
		registerRender(lightning_element, 0);
		registerRender(life_element, 0);
		registerRender(frost_element, 0);
		registerRender(arcane_element, 0);
		registerRender(shield_element, 0);
	}
	
	private static void registerItem(Item item){
		GameRegistry.register(item);
	}
	
	private static void registerRender(Item item,int meta){
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(References.MODID, item.getUnlocalizedName().substring(5)), "inventory"));		
	}
}

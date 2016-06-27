package hud.spark.mod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Hud.MODID, name = Hud.NAME, version = Hud.VERSION, guiFactory = Hud.GUI_FACTORY, clientSideOnly = true)
public class Hud {
	
	public static final String MODID = "HPHud";
	public static final String NAME = "HP Hud Mod";
	public static final String VERSION = "1.0";
	public static final String GUI_FACTORY = "hud.spark.mods.GuiFactory";
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		HudConfig.init(event.getSuggestedConfigurationFile());
		
		MinecraftForge.EVENT_BUS.register(new HealthBarRenderer());
	}

}

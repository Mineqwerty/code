package mineqwerty.diamines.proxy;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import mineqwerty.diamines.Diamines;
import mineqwerty.diamines.client.gui.GuiHandler;
import mineqwerty.diamines.init.ModBlocks;
import mineqwerty.diamines.init.ModItems;
import mineqwerty.diamines.init.ModTools;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void init() {
		NetworkRegistry.INSTANCE.registerGuiHandler(Diamines.instance, new GuiHandler());
	}
	
	
	@Override
	public void registerRenders() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ModTools.registerRenders();
	}
}

package mineqwerty.diamines.proxy;

import mineqwerty.diamines.reference;
import mineqwerty.diamines.tileentity.TileEntityEssenceExtractinator;
import mineqwerty.diamines.worldgen.OreGen;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void init() {
		GameRegistry.registerWorldGenerator(new OreGen(), 0);
	}
	
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityEssenceExtractinator.class, reference.MODID + ":EssenceExtractinator");
	}
	public void registerRenders() {
		
	}
}

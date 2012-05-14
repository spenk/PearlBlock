import java.io.File;


public class PearlBlockListener extends PluginListener{
	boolean useenderpearl;
	public void loadprops(){
		File fz = new File("plugins/config");
		fz.mkdir();
		PropertiesFile f = new PropertiesFile("plugins/config/PearlBlock.properties");
		useenderpearl = f.getBoolean("Disable-Ender-Pearl", true);
	}
	
	public boolean onItemUse(Player player,Block blockPlaced,Block blockClicked,Item iih){
		if (iih.getItemId() == 368){
			if (!player.canUseCommand("/ignorepearlblock")){
			if (useenderpearl){player.sendMessage("§4You are not allowed to use this item!");}
			return useenderpearl;
			}
			return false;
		}
		return false;
	}

}

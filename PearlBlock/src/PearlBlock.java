import java.util.logging.Logger;


public class PearlBlock extends Plugin{
		  String name = "PearlBlock";
		  String version = "1.0";
		  String author = " spenk";
		  static Logger log = Logger.getLogger("Minecraft");
		  
		  
	public void initialize(){
		PearlBlockListener listener = new PearlBlockListener();
		listener.loadprops();
	log.info(this.name +" version "+ this.version + " by " +this.author+(" is initialized!"));
	etc.getLoader().addListener(PluginLoader.Hook.ITEM_USE, listener, this, PluginListener.Priority.MEDIUM);
	}
	public void enable(){
		log.info(this.name + " version " + this.version + " by " + this.author + " is enabled!");
	}

	public void disable(){
		log.info(this.name + " version " + this.version + " is disabled!");
	}
	}

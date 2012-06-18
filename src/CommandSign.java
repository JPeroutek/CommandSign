import java.util.logging.Logger;

public class CommandSign extends Plugin
{
	private Logger log = Logger.getLogger("Minecraft");
	public static CommandSignListener listener;
	public static String name = "CommandSign"; 
	public static String version = "0.3"; 
	public static String author = "Partatoes"; 
	//Props file!
	public static PropertiesFile props = new PropertiesFile("plugins/config/CommandSign.properties");
	
	public CommandSign()
	{
		listener = new CommandSignListener();
	}
	
	@Override
	public void disable() 
	{
		log.info(name + " plugin disabled");
	}
	
	@Override
	public void enable() 
	{
		log.info(name + " plugin enabled");
	}
	
	public void initialize()
	{
		etc.getLoader().addListener(PluginLoader.Hook.BLOCK_RIGHTCLICKED, listener, this, PluginListener.Priority.MEDIUM);
		log.info(name + " v" + version + " made by " + author + " initialized.");
	}
}

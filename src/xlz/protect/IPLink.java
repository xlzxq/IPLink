package xlz.protect;

import org.bukkit.plugin.java.JavaPlugin;

public class IPLink extends JavaPlugin {

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new JoinListener(), this);
		getCommand("iplink").setExecutor(new InfoCommand());
	}

	@Override
	public void onDisable() {}

}

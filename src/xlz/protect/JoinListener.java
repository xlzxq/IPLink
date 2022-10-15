package xlz.protect;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent.Result;

public class JoinListener implements Listener {

	@EventHandler
	public void onPlayerJoin(AsyncPlayerPreLoginEvent event) {
		if (event.getName().equalsIgnoreCase("USERNAME"))
			if (!event.getAddress().getHostAddress().equalsIgnoreCase("IP-ADDRESS"))
				event.disallow(Result.KICK_BANNED, "KICK-REASON");
	}

}

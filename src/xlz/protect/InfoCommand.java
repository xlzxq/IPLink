package xlz.protect;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InfoCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		if (arg0 instanceof Player)
			if (arg1.getName().equalsIgnoreCase("iplink"))
				((Player) arg0).sendMessage("§7IPLink §81.0 §7coded by §fxlzxq");

		return true;
	}

}

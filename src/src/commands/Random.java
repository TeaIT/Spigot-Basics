package commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Random implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		if (cs instanceof Player) {
			if(cmd.getName().equalsIgnoreCase("random")) {
				Player p = (Player ) cs;
				int a = (int) (Math.random()*10);
				p.sendMessage("Die Zufallszahl lautet: §4" + a);
			}
		}
		return true;
	}
}

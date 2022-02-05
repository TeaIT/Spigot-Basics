package commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class Jump implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		if (cs instanceof Player) {
			Player p = (Player) cs;
			p.setVelocity(new Vector(0,1,0));
		}
		return true;
		//return gibt an, ob etwas beim benutzen des Befehls schief gegangen ist, für hat diese Meldung keine Wirkung
	}

}

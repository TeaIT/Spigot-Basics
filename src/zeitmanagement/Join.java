package zeitmanagement;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		if(Verlauf.phase == Phase.A) {
			p.sendMessage("Willkommen in Phase A!");
		} else if(Verlauf.phase == Phase.B) {
			p.sendMessage("Willkommen in Phase B!");
		} else if(Verlauf.phase == Phase.C) {

			p.sendMessage("Willkommen in Phase C!");
		}
	}
}

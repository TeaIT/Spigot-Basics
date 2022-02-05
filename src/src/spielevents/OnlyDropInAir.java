package spielevents;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class OnlyDropInAir implements Listener {
	
	@SuppressWarnings("deprecation") //die Methode isOnGround() ist in der Spigot 1.17 veraltet, wird also in kommenden Versionen ersetzt
	@EventHandler
	public void onDrop(PlayerDropItemEvent e) {
		Player p = e.getPlayer(); //hiermit wird der Spieler erfasst, der im Zusammenhang mit dem Event steht
		if(p.isOnGround()) e.setCancelled(true); //auf diese Weise kann der Spieler keine Items droppen, solange er sich auf dem Boden befindet
	}
}

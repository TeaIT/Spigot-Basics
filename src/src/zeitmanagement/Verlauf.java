package zeitmanagement;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import main.Main;

public class Verlauf {
	public static Phase phase = Phase.A;
	
	private static int max_A = 30;
	private static int max_B = 20;
	private static int max_C = 10;
	
	private static int time_A;
	private static int time_B;
	private static int time_C;
	
	//Beispiel für Plugins mit Zeitmanagement
	public static void start() {
		//in Abhängigkeit von Phasen lassen sich auch Events verändern
		Bukkit.getPluginManager().registerEvents(new Join(), Main.plugin);
		
		A();
	}
	
	private static void A() {
		phase = Phase.A;
		time_A = max_A;
		
		new BukkitRunnable() { //jeden Runnable kann man sich von der Funktionsweise ähnlich einem Thread vorstellen	
			@Override
			public void run() {
				if(time_A == 0) {
					B();
					cancel();
					return;
				}
				for(Player p : Bukkit.getOnlinePlayers()) p.sendMessage("Phase §aA§r: §a" + time_A + " §rSekunden");
				time_A--;
			}
		}.runTaskTimer(Main.plugin, 0, 20); //Zeit für vorm ersten Durchlauf, Zeit bis zum nächsten Durchlauf, 20 ticks entsprechen einer Sekunden
	}
	
	private static void B() {
		phase = Phase.B;
		time_B = max_B;
		
		new BukkitRunnable() {	
			@Override
			public void run() {
				if(time_B == 0) {
					C();
					cancel();
					return;
				}
				for(Player p : Bukkit.getOnlinePlayers()) p.sendMessage("Phase §aB§r: §a" + time_B + " §rSekunden");
				time_B--;
			}
		}.runTaskTimer(Main.plugin, 0, 20);
	}
	
	private static void C() {
		phase = Phase.C;
		time_C = max_C;
		
		new BukkitRunnable() {	
			@Override
			public void run() {
				if(time_C == 0) {
					A();
					cancel();
					return;
				}
				for(Player p : Bukkit.getOnlinePlayers()) p.sendMessage("Phase §aC§r: §a" + time_C + " §rSekunden");
				time_C--;
			}
		}.runTaskTimer(Main.plugin, 0, 20);
	}
}

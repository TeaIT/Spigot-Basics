package main;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import commands.Jump;
import commands.Random;
import spielevents.OnlyDropInAir;
import zeitmanagement.Verlauf;

// Hinweis 1: Der Pfad zur Main muss in der 'plugin.yml' angegeben werden!
public class Main extends JavaPlugin {
	public static Plugin plugin;
	
	//Hinweis 2: diese Methode wird ausgef�hrt sobald das Plugin geladen wird
	@Override
	public void onEnable() {
		plugin=this; //um auch von au�en auf das Plugin zugreifen zu k�nnen
		
		//Hinweis 3: auf diese Weise werden Spielevents registriert
		//mit Hilfe von Events l�sst sich das normale Spielgeschehen manipulieren, z.B. lassen sich Events auch unterdr�cken
		getServer().getPluginManager().registerEvents(new OnlyDropInAir(), this);
		
		//Hinweis 4: auf diese Weise werden Minecraft-Befehle registriert, diese gilt es in der plugin.yml zu dokumentieren
		getCommand("random").setExecutor(new Random());
		getCommand("jump").setExecutor(new Jump());
		
		//Zeitmanagement starten
		Verlauf.start();
	}
	
	//Hinweis 5: diese Methode wird ausgef�hrt sobald der Server herunterf�hrt oder reloadet und das Plugin dementsprechend deaktiviert wird
	@Override
	public void onDisable() {
		for(Player p : Bukkit.getOnlinePlayers()) p.kickPlayer("�4Der Server restartet!");
	}
}

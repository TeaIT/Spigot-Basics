# Spigot-Basics
Dieses Projekt bietet einen Einblick in simple Konzepte der Spigot-Programmierung.


# Coding
Um ein funktionsfähiges Spigot-Plugin zu schreiben, benötig man:
- das Java Devolopment Kit oder eine IDE mit integriertem JDK
- die Spigot-API 'spigot.jar' in der gewünschten Minecraft-Version (https://getbukkit.org/download/spigot)
- einen Verweis auf diese API
- die Datei 'plugin.yml' im src-Ordner (WICHTIG! Hier sind keine Tabulatorzeichen erlaubt)
- eine Main-Klasse, die von 'JavaPlugin' erbt und 'onEnable()', 'onDisable()' überschreibt

Sind diese Bedingungen nicht erfüllt, wird das Plugin nicht funktionieren.
Weitere nützliche Implementierungen sind in den Klassen des Projektes zu finden.


# Server aufsetzen
Um einen Spigot-Server aufzusetzen, benötigt man:
- die JRE (Java Runtime Environment)
- die Datei 'spigot.jar' der gewünschten Minecraft-Version (siehe #Coding)

Schritt 1:
- führe die Datei 'spigot.jar' über eine Konsole aus: 'java -jar spigot.jar'
- im Folgenden wird die Ordnerstruktur eines funktionsfähigen Minecraft-Servers generiert
- die Generation stoppt ab einem gewissen Punkt mit dem Hinweis, dass man die EULA bestätigen muss, um den Server starten zu können

Schritt 2:
- suche die Datei 'eula.txt' in den generierten Dateien und editiere sie, um der EULA zuzustimmen

Schritt 3:
- starte den Server erneut mit: 'java -jar spigot.jar' (auf diese Weise lässt er sich auch erneut starten)

Plugins hinzufügen:
- im Ordner 'plugins' müssen die gewünschten Plugins ergänzt werden
- mit '/reload' lässt sich der Server aktualisieren

Ergänzungen:
- der Ordner 'world' lässt sich durch jede beliebige Minecraft-Welt ersetzen
- die Datei 'server-icon.png' beeinflusst das Icon des Minecraft-Servers und lässt sich durch Bilder der Dimension 64y64 ersetzen

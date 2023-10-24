package histoire;

import personnages.Humains;

public class HistoireTP4 {
	public static void main() {
	Humains prof = new Humains("Prof","Kombucha",100);	
	prof.direBonjour();
	prof.parler("j'ai"+prof.getArgent()+"sous en poche ");
	prof.acheter("Kombucha", 10);
	prof.parler("j'ai"+prof.getArgent()+"sous en poche ");
	prof.acheter("jeux", 15);
	}
}

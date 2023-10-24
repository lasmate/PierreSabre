package personnages;
import java.util.concurrent.ThreadLocalRandom;
public class Humains {
	private String nom;
	private String boisson;
	private int argent;
	private int minArgent;
	private int maxArgent;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getBoisson() {
		return boisson;
	}
	public void setBoisson(String boisson) {
		this.boisson = boisson;
	}
	public int getArgent() {
		return argent;
	}
	public void setArgent(int argent) {
		this.argent = ThreadLocalRandom.current().nextInt(minArgent,maxArgent+1);
	}
	public void parler(String texte) {
		System.out.println( "«" + texte + "»");
	}
	public void direBonjour() {
		 this.parler( "Bonjour ! Je m'appelle" + nom + "et j'aime boire du " + boisson);
	}
	public void boire() {
		this.parler("Mmmm, un bon verre de "+boisson+"! GLOUPS!");
	}
	public void acheter(String bien, int prix) {
		if (this.argent<prix){
			this.parler("Je n'ai pas assez d'argent pour acheter ce " + bien + "!");
		}
		else {
			this.parler("J'achète ce " + bien + " pour " + prix + " pièces d'or.");
			this.perdreArgent(prix);
		}
	}
	public void gagnerArgent(int gain) {
		this.argent= argent + gain;
	}
	public void perdreArgent(int perte ) {
		this.argent= argent - perte;
	}
	public static void main() {
		
	}
}

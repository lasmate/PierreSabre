package personnages;
import java.util.concurrent.ThreadLocalRandom;
public class Humains {
	private String nom;//nom de l'humain
	private String boisson;//boisson favorite de l'humain
	private int argent;//argent du l'humain
	private int minArgent =0;//argent minimum initial
	private int maxArgent =100;//argent maximal initial
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
	public void setArgent() {
		this.argent = ThreadLocalRandom.current().nextInt(minArgent,maxArgent+1); 

	}
	public void parler(String texte) {
		System.out.println( "«" + texte + "»");
	}
	public void direBonjour() {
		 this.parler( "Bonjour ! Je m'appelle" + getNom() + "et j'aime boire du " + getBoisson());
	}
	public void boire() {
		this.parler("Mmmm, un bon verre de "+boisson+"! GLOUPS!");
	}
	public void acheter(String bien, int prix) {
		if (this.argent<prix){
			this.parler("Je n'ai pas assez d'argent pour acheter ce " + bien + "!");
		}
		else {
			this.parler("je vais pouvoir m'acheter une  " + bien + " a " + prix+"sous" );
			this.perdreArgent(prix);
			boire();
		}
	}
	public void gagnerArgent(int gain) {
		this.argent= argent + gain;
	}
	public void perdreArgent(int perte ) {
		this.argent= argent - perte;
	}
	public static void main() {
		new Humains();

	}
}

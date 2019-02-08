import java.util.ArrayList;

public class Livre {
	// Variables
	private String titre;
	private ArrayList<Auteur> auteurs;
	private int anneePP;
	private ArrayList<Personnage> persos;
	
	/**
	 * @param titre
	 * @param auteurs
	 * @param anneePP
	 * @param persos
	 */
	public Livre(String titre, ArrayList<Auteur> auteurs, int anneePP, ArrayList<Personnage> persos) {
		super();
		this.titre = titre;
		this.auteurs = auteurs;
		this.anneePP = anneePP;
		this.persos = persos;
	}
	
	// Getters and setters
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getAnneePP() {
		return anneePP;
	}
	public void setAnneePP(int anneePP) {
		this.anneePP = anneePP;
	}
	
	// Methods
	public void affichePerso() {
		for (int i = 0; i < persos.size(); i++) {
			System.out.println(persos.get(i).toString());
		}
	}
	public void ajoutPerso(Personnage p) {
		persos.add(p);
	}
	public boolean contient(String nom) {
		for(int i = 0; i < persos.size(); i++) {
			if (persos.get(i).getNom() == nom) {
				return true;
			}
		}
		return false;
	}
	public String getAuteurs() {
		String temp = "";
		for (int i = 0; i < auteurs.size(); i++) {
			temp = temp + "Auteur " + i + " :\n" + auteurs.get(i).toString() + "\n";
		}
		return temp;
	}
	public ArrayList<String> nomAuteurs() {
		ArrayList<String> temp = new ArrayList<String>();
		for (int i = 0; i < auteurs.size(); i++) {
			temp.add(auteurs.get(i).getNom());
		}
		return temp;
	}
	public String toString() {
		String temp = "Titre : " + this.getTitre() + "\nAuteur : " + this.getAuteurs() + "\nAnnee Premiere Parution : " + Integer.toString(this.getAnneePP()) + "\n";
		for (int i = 0; i < persos.size(); i++) {
			temp = temp + "Personnage " + i + " :\n" + persos.get(i).toString() + "\n";
		}
		return temp;
	}
}

import java.util.ArrayList;

public class Personnage {
	// Variables
	private String nom;
	private String Descr;
	private ArrayList<String> pouvoirs;
	
	/**
	 * @param nom
	 * @param descr
	 * @param pouvoirs
	 */
	public Personnage(String nom, String descr, ArrayList<String> pouvoirs) {
		super();
		this.nom = nom;
		Descr = descr;
		this.pouvoirs = pouvoirs;
	}

	// Getters and setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescr() {
		return Descr;
	}

	public void setDescr(String descr) {
		Descr = descr;
	}
	
	// Methods 
	public String toString() {
		String temp = "Nom : " + this.getNom() + "\nDescription : " + this.getDescr() + "\n";
		for (int i = 0; i < pouvoirs.size(); i++) {
			temp = temp + "   Pouvoir " + i + " : " + pouvoirs.get(i) + "\n";
		}
		return temp;
	}
	public void ajoutPouvoir(String p) {
		this.pouvoirs.add(p);
	}
	public boolean aUnPouvoir(String p) {
		return this.pouvoirs.contains(p);
	}
}


public class Auteur {
	// Variables
	private String nom;
	private String prenom;
	private String langue;
	
	// Constructor
	/**
	 * @param nom
	 * @param prenom
	 * @param langue
	 */
	public Auteur(String nom, String prenom, String langue) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.langue = langue;
	}
	
	// Getters and setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getLangue() {
		return langue;
	}
	public void setLangue(String langue) {
		this.langue = langue;
	}
	
	// Methods
	public String toString() {
		return "Nom : " + this.getNom() + "\nPrenom : " + this.getPrenom() + "\nLangue : " + this.getLangue();
	}
}

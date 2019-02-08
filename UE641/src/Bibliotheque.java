import java.util.ArrayList;

public class Bibliotheque {
	private String nom;
	private ArrayList<Livre> listeLivres = new ArrayList<Livre>();
	
	/**
	 * @param nom
	 * @param listeLivres
	 */
	public Bibliotheque(String nom, ArrayList<Livre> listeLivres) {
		super();
		this.nom = nom;
		this.listeLivres = listeLivres;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void ajoutLivre(Livre l) {
		listeLivres.add(l);
	}
	public boolean existe(String titre) {
		for(int i = 0; i < listeLivres.size(); i++) {
			if (listeLivres.get(i).getTitre() == titre) {
				return true;
			}
		}
		return false;
	}
	public void livreDAuteur(String nomAuteur) {
		for(int i = 0; i < listeLivres.size(); i++) {
			if (listeLivres.get(i).nomAuteurs().contains(nomAuteur)) {
				System.out.println(listeLivres.get(i));
			}
		}
	}
	public ArrayList<Livre> listeLivresAuteur(String nomAuteur) {
		ArrayList<Livre> temp = new ArrayList<Livre>();
		for(int i = 0; i < listeLivres.size(); i++) {
			if (listeLivres.get(i).nomAuteurs().contains(nomAuteur)) {
				temp.add(listeLivres.get(i));
			}
		}
		return temp;
	}
}

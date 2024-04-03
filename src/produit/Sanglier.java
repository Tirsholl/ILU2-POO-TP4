package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private personnages.Gaulois chasseur;
	private int poid;
	
	public Sanglier(Gaulois chasseur, int poid) {
		super("Sanglier", Unite.KILOGRAMME);
		this.poid = poid;
		
	}

	@Override
	public String getDescription() {
		return ("sanglier de " + poid + "  kg chassé par " + chasseur);
	}
}

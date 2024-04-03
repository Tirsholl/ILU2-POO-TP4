package produit;

public class Poisson extends Produit{
	private String dateDePeche;
	private int nbPiece;
	
	public Poisson(String dateDePeche, int nbPiece) {
		super("Poisson", Unite.PIECE);
		this.dateDePeche = dateDePeche;
		this.nbPiece= nbPiece;
	}

	@Override
	public String getDescription() {
		return nbPiece + "Pièce \n" + "poisson pêchés " + dateDePeche;
	}

}


package Grossiste;

public class Fournisseur {

	private String name;
	private Fabrique usine;
	private FactoryCommerce factory = new FactoryCommerce() ;
	// private List<Fabrique> powerplants;
	
	public Fournisseur(String n) {
		this.setName(n);
		this.setUsine(new Fabrique());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Fabrique getUsine() {
		return usine;
	}

	public void setUsine(Fabrique usine) {
		this.usine = usine;
	}
	
	public void creerProduit(Produit p) {
		usine.addProduct(p);
	}
}

package Grossiste;

import java.util.*;

public class Fabrique {

	private List<Produit> catalogue;
	
	public Fabrique() {
		List<Produit> catalogue = new ArrayList<Produit>();
	}

	public List<Produit> getCatalogue() {
		return catalogue;
	}

	public void setCatalogue(List<Produit> catalogue) {
		this.catalogue = catalogue;
	}
	public void addProduct(Produit p) {
		if(!this.catalogue.contains(p))	this.catalogue.add(p);
	}
}

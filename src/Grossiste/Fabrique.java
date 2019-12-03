package Grossiste;

import java.time.LocalDate;
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

	
	public Produit getProduct(String name, double prix, LocalDate tmp) {
		
		for (int i = 0; i < this.catalogue.size(); i++) {
			if(this.catalogue.get(i).getName().equals(name) 
					&& this.catalogue.get(i).getPrix() == prix 
					&& this.catalogue.get(i).getPeremption().toString().equals(tmp.toString()) ) {	
				return this.catalogue.get(i);
			}
		}
		Produit temp = new Produit(name, prix, tmp);
		this.catalogue.add(temp);
		return temp;
	}
	
	public void deleteProduit(String name, double prix, LocalDate tmp) {
		for (int i = 0; i < this.catalogue.size(); i++) {
			if(this.catalogue.get(i).getName().equals(name) 
					&& this.catalogue.get(i).getPrix() == prix 
					&& this.catalogue.get(i).getPeremption().toString().equals(tmp.toString()) ) {	
				this.catalogue.remove(i);
			}
		}
	}
}

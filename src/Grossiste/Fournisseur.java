package Grossiste;

import java.util.ArrayList;
import java.time.LocalDate;

public class Fournisseur {

	protected String name;
	protected Fabrique usine;
	protected FactoryCommerce factory = new FactoryCommerce() ;
	protected ArrayList<BuyedProduct> catalogue;
	protected ArrayList<Commerce> commerceList;
	// private List<Fabrique> powerplants;
	
	public Fournisseur(String n) {
		this.setName(n);
		this.setUsine(new Fabrique());
		this.setCommerceList(new ArrayList<Commerce>());
		this.catalogue = new ArrayList<BuyedProduct>();
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
	
	public void creerProduit(String name, double prix, LocalDate tmp, int nombre) {		
		this.catalogue.add(new BuyedProduct(nombre, usine.getProduct(name, prix, tmp)));
	}
	
	public void deleteProduit(String name, double prix, LocalDate tmp) {
		this.catalogue.remove(usine.getProduct(name, prix, tmp));
	}
	
	public void deleteProduitInt(String name, double prix, LocalDate tmp, int n) {
		Produit p = usine.getProduct(name, prix, tmp);
		for(int i = 0 ;i<this.catalogue.size();i++)
		{
			if(this.catalogue.get(i).isEqualTo(p))
			{
				if(this.catalogue.get(i).getNombre()<= n)
				{
					this.catalogue.remove(i);
				}
				else
				{
					this.catalogue.get(i).removeProductNumber(n);
				}
			}
		}
	}
	
	public String catalogueToString()
	{
		return this.catalogue.toString();
	}

	public ArrayList<Commerce> getCommerceList() {
		return commerceList;
	}

	public void setCommerceList(ArrayList<Commerce> commercelist) {
		this.commerceList = commercelist;
	}
	
	public void addCommerce(Commerce c)
	{
		this.commerceList.add(c);
	}
	
	public void removeCommerce(Commerce c)
	{
		this.commerceList.remove(c);
	}
}

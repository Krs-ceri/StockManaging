package Grossiste;

public class BuyedProduct extends Produit {

	protected double nombre;
	
	public BuyedProduct(double n, Produit o) {
		super(o.getName(), o.getPrix(), o.getPeremption());
		this.nombre = n;
	}

}

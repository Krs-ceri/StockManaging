package Grossiste;

public class BuyedProduct extends Produit {

	protected double nombre;
	
	public BuyedProduct(double n, Produit o) {
		super(o.getName(), o.getPrix(), o.getPeremption());
		this.nombre = n;
	}
	
	public void addProductNumber(double n)
	{
		this.nombre += n;
	}
	
	public void removeProductNumber(double n)
	{
		this.nombre -= n;
	}
	
	public double getNombre()
	{
		return this.getNombre();
	}

}

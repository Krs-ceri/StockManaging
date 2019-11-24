package Grossiste;

import java.util.*;

public abstract class Commerce implements Cloneable{
	protected String name ;

	protected String nbEmp ;
	protected String year ;
	protected List<BuyedProduct> stock ;
	protected String surface ;
	protected String siret ;
	protected String minquantite ;
	protected String ristourne ;
	//protected String maisonMere ;
	protected String pays ;
	//protected CompteEnBanque compte ;
	protected String type ;
	protected double banque;

	public Commerce(String n, String nbE, String years, String s,
				String siret, String min, String r, String p, String commerce, double bank) {
		// TODO Auto-generated constructor stub
		this.name = n;
		this.nbEmp = nbE;
		this.year = years;
		this.surface = s;
		this.siret = siret;
		this.minquantite = min;
		this.ristourne = r;
		this.pays = p;
		this.type = commerce;
		
		List<BuyedProduct> stock = new ArrayList<BuyedProduct>();
	}
	
	public abstract void remboursement(double montant);
	public abstract void achat(List<BuyedProduct> stack);
	public abstract void afficherStock();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNbEmp() {
		return nbEmp;
	}

	public void setNbEmp(String nbEmp) {
		this.nbEmp = nbEmp;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public List<BuyedProduct> getStock() {
		return stock;
	}

	public void setStock(List<BuyedProduct> stock) {
		this.stock = stock;
	}

	public String getSurface() {
		return surface;
	}

	public void setSurface(String surface) {
		this.surface = surface;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getMinquantite() {
		return minquantite;
	}

	public void setMinquantite(String minquantite) {
		this.minquantite = minquantite;
	}

	public String getRistourne() {
		return ristourne;
	}

	public void setRistourne(String ristourne) {
		this.ristourne = ristourne;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}

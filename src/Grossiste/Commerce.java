package Grossiste;

import java.util.*;

public abstract class Commerce {
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
	
}

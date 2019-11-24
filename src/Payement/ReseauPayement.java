package Payement;



public abstract class ReseauPayement  {	

	protected double valeur ;
	protected String nom ;
	
	public ReseauPayement(double cout, String nom) {
		this.nom = nom ;
	}
	
	public abstract double achat(double montant) ;
	public abstract double vente(double montant) ;
	public abstract double remboursement(double montant);
	public abstract double getValeur();
	public abstract void setRetenue(double retenue) ;
	
	public String getMoyenDePaiement() {
		return this.nom ;
	}
}
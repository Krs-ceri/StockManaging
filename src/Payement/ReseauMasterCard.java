package Payement;


public class ReseauMasterCard extends ReseauPayement  {	
	/**
	 * Constructeur du ReseauxMastecard
	 */
	public ReseauMasterCard() {
		super(0.005, "Masterard") ;
	}

	@Override
	public double achat(double montant) {
		double tmp = 1 + this.valeur ;
		return (montant*tmp) ;
	}

	@Override
	public double vente(double montant) {
		double tmp = 1 - this.valeur ;
		return (montant*tmp) ;
	}

	@Override
	public double remboursement(double montant) {
		return montant ;
	}

	@Override
	public double getValeur() {
		return this.valeur ;
	}

	@Override
	public void setRetenue(double retenue) {}
}
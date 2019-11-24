package Payement;

public class ReseauVisa extends ReseauPayement {

	private double retenueRemboursement ;
	

	private String payString ;
	

	public ReseauVisa(String pays) {
		super(0.0025, "Visa") ;
		this.retenueRemboursement = this.coutParPays(pays);
	}
	

	private double coutParPays(String pays) {
		if(pays.equals("Espagne")) {
			return 0.0010 ;
		}
		else if(pays.equals("France")) {
			return 0.0 ;
		}
		else if(pays.equals("Etats-Unis")) {
			return 0.0020 ;
		}
		else if(pays.equals("Portugal")) {
			return 0.0015 ;
		}
		else if(pays.equals("Royaume-Uni")) {
			return 0.0025 ;
		}
		else {
			return 0.0030 ;
		}
	}

	@Override
	public double achat(double montant) {
		double tmp = this.valeur + 1 ;
		return (montant*tmp);
	}

	@Override
	public double vente(double montant) {
		double tmp = 1 - this.valeur ;
		return(montant*tmp) ;
	}

	@Override
	public double remboursement(double montant) {
		double tmp = 1 - this.retenueRemboursement ;
		
		return (montant*tmp);
	}

	@Override
	public void setRetenue(double retenue) {
		this.retenueRemboursement = retenueRemboursement;
	}
	

	public double getCout() {
		return valeur;
	}


	public double getRetenueRemboursement() {
		return retenueRemboursement;
	}


	public void setCout(double cout) {
		this.valeur = cout;
	}

	@Override
	public double getValeur() {
		// TODO Auto-generated method stub
		return 0;
	}

}
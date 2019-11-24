package Payement;



public class CompteBancaireCla extends CompteBancaire  {

	private String type ;
	

	public CompteBancaireCla(double montantCompteEnBanque, String reseaux, String pays) {
		super(montantCompteEnBanque, reseaux, pays) ;
		this.type = "Classique" ;
	}

	@Override
	public boolean achat(double montant) {
		if(this.montantCompteEnBanque > (montant + montant*(0+this.reseauxPayement.getValeur()))) {
			this.montantCompteEnBanque -= this.reseauxPayement.achat(montant);
			return true ;
		}
		
		System.out.println("Montant insuffisant pour l'achat");
		return false ;
	}
	
	@Override
	public void setMontantCompteEnBanque(double montant) {
		this.montantCompteEnBanque = montant ;
	}

	@Override
	public void remboursement(double montant) {
		this.montantCompteEnBanque += this.reseauxPayement.remboursement(montant) ;
	}

	@Override
	public double getMontant() {
		return this.montantCompteEnBanque;
	}

	@Override
	public void vente(double montant) {
		this.montantCompteEnBanque += this.reseauxPayement.vente(montant) ;
	}

	@Override
	public void paiementGrossiste() {}

	@Override
	public String getMoyenDePaiement() {
		return this.reseauxPayement.getMoyenDePaiement();
	}

	@Override
	public String getType() {
		return this.type;
	}
	

}
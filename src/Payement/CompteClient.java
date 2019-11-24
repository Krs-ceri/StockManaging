package Payement;

import java.util.Vector;

public class CompteClient extends CompteBancaire  {
	
	private Vector<Double> paiment ;
	private String nomCommerce ;
	private String pays ;
	private String type ;
	

	public CompteClient(double montantCompteEnBanque, String reseaux, String pays, String nomCommerce) {
		super(montantCompteEnBanque, reseaux, pays) ;

		this.paiment = new Vector<Double>() ;
		this.nomCommerce = nomCommerce ;
		this.pays = pays ;
		this.type = "Client" ;
	}

	private double calculTotalAchat() {
		return montantCompteEnBanque;
		//TODO
		
	}

	@Override
	public void paiementGrossiste() {
		//TODO
	}

	@Override
	public boolean achat(double montant) {
		return false;
		//TODO
	}

	@Override
	public void setMontantCompteEnBanque(double montant) {
		this.montantCompteEnBanque = montant;

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
		this.montantCompteEnBanque += this.reseauxPayement.vente(montant);
	}

	@Override
	public String getMoyenDePaiement() {
		return this.reseauxPayement.getMoyenDePaiement();
	}

	@Override
	public String getType() {
		return this.type;
	}
}
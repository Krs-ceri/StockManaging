package Payement;



/**
 * Public interface de compte en banque
 * @author MATHIEU Thomas
 * @author GARCIA Jérémy
 *
 */
public abstract class CompteBancaire  {

	protected ReseauPayement reseauxPayement ;
	

	protected double montantCompteEnBanque ;
	

	public CompteBancaire(double montantCompteEnBanque, String reseaux, String pays) {
		this.montantCompteEnBanque = montantCompteEnBanque;
		if(reseaux.equals("Mastercard")) this.reseauxPayement = new ReseauMasterCard() ;
		else this.reseauxPayement = new ReseauVisa(pays) ;
	}

	public abstract boolean achat(double montant) ;
	public abstract void remboursement(double montant) ;
	public abstract void vente(double montant) ;
	public abstract  double getMontant() ;
	public abstract void setMontantCompteEnBanque(double montant) ;
	public abstract void paiementGrossiste() ;
	public abstract String getMoyenDePaiement() ;
	public abstract String getType() ;
}
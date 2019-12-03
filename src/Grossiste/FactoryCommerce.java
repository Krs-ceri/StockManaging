package Grossiste;

import Payement.CompteBancaire;

public class FactoryCommerce {
	/**
	 * Commerce
	 */
	private Commerce commerce ;
	
	public Commerce getCommerce(String nomCommerce, String nombreEmploye, String anciennete,
			String surfaceCarre, String numeroSIREN,
			String quantiteMinimum, String ristourne, String maisonMere,
			String pays, String type, CompteBancaire typeCompteEnBanque, String montant, String reseau) {
		
		if(type.equals("Franchise")) {
			this.commerce = new CommerceFranchise(nomCommerce, nombreEmploye, 
					anciennete, surfaceCarre, quantiteMinimum, ristourne, 
					maisonMere, pays, typeCompteEnBanque);
			//this.commerce = new CommerceFranchise(nomCommerce, nombreEmploye, anciennete, surfaceCarre, numeroSIREN, quantiteMinimum, 
					//ristourne, maisonMere, pays, typeCompteEnBanque) ;
		}
		else {
			
			this.commerce = new CommerceIndependant(nomCommerce, nombreEmploye, anciennete, surfaceCarre,  
					quantiteMinimum, null, maisonMere, pays,  typeCompteEnBanque) ;
		}
		
		return this.commerce ;
	}
	

	public void setCommerce(Commerce c) {
		this.commerce = c ;
	}

	public Commerce getCommerceControlleur() {
		return this.commerce ;
	}
}
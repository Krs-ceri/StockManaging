package Grossiste;

import java.util.ArrayList;
import java.util.List;

import Payement.CompteBancaire;

public class CommerceFranchise extends Commerce{

	protected String siret;
	public CommerceFranchise(String nom, String nombre, String an,String surface
			, String minimum,String ristourne, String maisonMere, String pays,
			CompteBancaire typeCompteEnBanque ) {
		super(nom, nombre, an, surface, minimum, ristourne, pays,"Franchise", 0.0, typeCompteEnBanque);
		this.siret = siret;
	}


	

	@Override
	public void remboursement(double montant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void achat(ArrayList<Produit> stack) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void afficherStock() {
		// TODO Auto-generated method stub
		
	}


}
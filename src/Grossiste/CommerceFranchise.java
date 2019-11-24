package Grossiste;

import java.util.List;

public class CommerceFranchise extends Commerce{

	protected String mere;
	public CommerceFranchise(String nom, String nombre, String an,String surface,
			String siret, String minimum,String ristourne, String maisonMere, String pays,
			String typeCompteEnBanque ) {
		super(nom, nombre, an, surface, siret, minimum, ristourne, pays,"Independant", 0.0);
		this.mere = maisonMere;
	}


	

	@Override
	public void remboursement(double montant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void achat(List<BuyedProduct> stack) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void afficherStock() {
		// TODO Auto-generated method stub
		
	}
}
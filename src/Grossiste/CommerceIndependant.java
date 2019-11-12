package Grossiste;

import java.util.List;

public class CommerceIndependant extends Commerce{

	protected String maison;
	public CommerceIndependant(String nom, String nombre, String an,String surface,
			String siret, String minimum,String ristourne, String maisonMere, String pays,
			String typeCompteEnBanque ) {
		super(nom, nombre, an, surface, siret, minimum, ristourne, pays,"Independant", 0.0);
		this.maison = maisonMere;
	}



	@Override
	public void remboursement(double montant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void achat(List<BuyedProduct> stack) {
		// TODO Auto-generated method stub
		
	}
}
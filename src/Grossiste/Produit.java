package Grossiste;

import java.time.LocalDate;

public class Produit {
	
	private String name ;
	private double prix ;
	private LocalDate peremption ;
	
	
	public Produit(String name, double prixP, LocalDate date) {
		this.setName(name);
		this.setPrix(prixP);
		this.setPeremption(date);
	}
	public boolean equals(Produit o) {
		return name.equals(o.getName()) &&
				prix == o.getPrix() &&
				peremption.equals(o.getPeremption().toString());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public LocalDate getPeremption() {
		return peremption;
	}
	public void setPeremption(LocalDate peremption) {
		this.peremption = peremption;
	}
}

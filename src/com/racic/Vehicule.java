package com.racic;

public abstract class Vehicule {

	//attributs
	protected String marque;
	protected String modele;
	protected String couleur;
	protected int prix;
	
	
	
	
	//constructeur
	public Vehicule (String marqueCopy,String modeleCopy,String couleurCopy,int prixCopy) {
		marque = marqueCopy;
		modele = modeleCopy;
		couleur=couleurCopy;
		prix = prixCopy;
	}
	
	@Override
	public String toString() {
		return "marque = " + marque + ", modele = " + modele + ", couleur = " + couleur + ", prix = " + prix;
	}
	public String getMarque() {
		return marque;
	}
	
	public String getModele() {
		return modele;
	}
	
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	
	
}

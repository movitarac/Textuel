package com.racic;

public class Voiture extends Vehicule {

	protected String type;
	
	public Voiture(String marqueCopy, String modeleCopy, String couleurCopy, int prixCopy,String typeCopy) {
		super(marqueCopy, modeleCopy, couleurCopy, prixCopy);
		type=typeCopy;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String s = super.toString(); 
		return "Voiture \n" + super.toString() + ", type = " + type + " .";
	}
}

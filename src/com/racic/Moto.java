package com.racic;

public class Moto extends Vehicule {

	protected int cylindree;
	
	public Moto(String marqueCopy, String modeleCopy, String couleurCopy, int prixCopy, int cylindreeCopy) {
		super(marqueCopy, modeleCopy, couleurCopy, prixCopy);
		cylindree = cylindreeCopy;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String s = super.toString(); 
		return "Moto \n" + super.toString() + ", cylindree = " + cylindree + " .";
	}

}

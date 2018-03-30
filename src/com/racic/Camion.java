package com.racic;

public class Camion extends Vehicule {

	protected int PTAC;
	
	public Camion(String marqueCopy, String modeleCopy, String couleurCopy, int prixCopy, int ptacCopy) {
		super(marqueCopy, modeleCopy, couleurCopy, prixCopy);
		PTAC=ptacCopy;
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		String s = super.toString(); 
		return "Camion \n" + super.toString() + ", PTAC = " + PTAC + " tonnes.";
	}

}

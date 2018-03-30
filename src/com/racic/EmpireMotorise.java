package com.racic;

import java.util.ArrayList;

public class EmpireMotorise {

	protected String nomEmpire;
	protected ArrayList<Concessions> listeConcessions = new ArrayList<Concessions>();
	protected int tresorerieEmpire=0;

	//Constructeur
	public EmpireMotorise (String nomEmpireCopy) {
		nomEmpire = nomEmpireCopy;

	}

	public String inventaireConcession() {
		//on appele toString de Vehicule pour chaque vehicule
		String s = "Voici les listes de concessions appartenues par " + nomEmpire ;
		int idConcession=0;
		if (listeConcessions.size() == 0) { 
			return nomEmpire + " ne connait pas cette concession!" ;
		} else {
			for (Concessions c : listeConcessions) {
				s +="\n";
				s +="(";
				s +=idConcession++;
				s += ") ";
				s += c.descriptionConcession();
				s += "\n";
			}
			return s ;
		}
	}

	public void ajouterConcession(Concessions nouvelleConcession) {
		listeConcessions.add(nouvelleConcession);	

	}

	public int getValeurConcession() {
		int sommeC = 0;
		if (listeConcessions.size() == 0) { 
			return 0;
		} else {
			for (Concessions c : listeConcessions) {
				sommeC += c.getValeurStock() ;
			}
			return sommeC;
		}
	}

	public int getTresorieConcession() {
		return tresorerieEmpire;
		
	}

	public int valeurEmpire() {
		int somme = 0;


		return 0;	
	}





}

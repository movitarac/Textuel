package com.racic;

import java.util.ArrayList;

public class Concessions {

	protected String nomConcession;
	protected ArrayList<Vehicule> listeVehicule = new ArrayList<Vehicule>();
	protected int tresorerieConcession=0;


	//Constructeur
	public Concessions (String nomCopy) {
		nomConcession = nomCopy;

	}

	public String getNomConcession() {
		return nomConcession;
	}

	public void setNomConcession(String nomConcession) {
		this.nomConcession = nomConcession;
	}

	/**Ajouter un vehicule dans la liste
	 * 
	 * @param nouveauVehicule
	 */
	public void ajouterVehicule(Vehicule nouveauVehicule) {
		listeVehicule.add(nouveauVehicule);	

	}

	public int getNombreVehicules() {
		return listeVehicule.size();
	}

	/**Inventaire 
	 * afficher des listes
	 * @return
	 */
	public String inventaire() {
		//on appele toString de Vehicule pour chaque vehicule
		String s = "Voici les listes de vehicules disponibles dans " + nomConcession ;
		int idVehicule=0;
		if (listeVehicule.size() == 0) { 
			return nomConcession + " n'a pas de vehicule dans la boutique!" ;
		} else {
			for (Vehicule v : listeVehicule) {
				s +="\n";
				s +="(";
				s +=idVehicule++;
				s += ") ";
				s += v.toString();
				s += "\n";
			}
			return s ;
		}
	}

	public int getValeurStock() {
		int somme=0;
		if (listeVehicule.size() == 0) { 
			return 0;
		} else {
			for (Vehicule v : listeVehicule) {
				somme += v.getPrix();
			}
			return somme;
		}
	}
	
	

	public void vendre(int indexVehicule) {
		if (listeVehicule.size() <= indexVehicule) { 
			System.out.println("Attention, le numero id ne correspond à aucun vehicule!! Ca n'existe pas!");

		} else {
			tresorerieConcession +=listeVehicule.get(indexVehicule).getPrix();
			System.out.println("Le vehicule " + listeVehicule.get(indexVehicule).getMarque() + " - " +  listeVehicule.get(indexVehicule).getModele() +" est vendu!");
			System.out.println("Apres cette vente, notre tresorerie est: "+ tresorerieConcession + " euros");			
			listeVehicule.remove(indexVehicule);

		}
	}
	public String descriptionConcession() {
		return "Concessions [nom Concession= " + nomConcession + ", tresorerie= " + tresorerieConcession + "]";
	}
	
	public int nombreTypeVehicule (String typeVehicule) {
		int compteur=0;

		for (Vehicule v: listeVehicule) {
			if (v.getClass().getSimpleName().equalsIgnoreCase(typeVehicule)) {
				compteur++;
			}
		}
		return compteur;
	}

	public void reduction (int pourcentageReduction) {
		int prixVR=0;
		for (Vehicule v : listeVehicule) {
			prixVR = v.getPrix() - ((v.getPrix()*pourcentageReduction/100));
			v.setPrix(prixVR);
			System.out.println("Le nouveau prix de " + v.getMarque() + " est "+ prixVR + " euros.");
		}


	}
	public void augmentation (int pourcentageAugmentation) {
		int prixVA=0;
		for (Vehicule v : listeVehicule) {
			prixVA = v.getPrix() - ((v.getPrix()*pourcentageAugmentation/100));
			v.setPrix(prixVA);
			System.out.println("Le nouveau prix de " + v.getMarque() + " est "+ prixVA + " euros.");
		}
	}


	/**
	 * Vendre tous les vehicules de la meme marque
	 * on doit parcourir la liste du bas en haut
	 * @param marqueVehicule
	 */
	public void liquidationMarque (String marqueVehicule) {
		for (int i = listeVehicule.size() -1; i>=0; i--) {
			listeVehicule.get(i); {
				if (listeVehicule.get(i).getMarque().equalsIgnoreCase(marqueVehicule)) {
					vendre(i);
				}
			}
		}
	}


	//SURCHARGER pour reduction ou augmentation sur l'un des 3 types de vehicule
	public void reduction (int pourcentageReduction, String typeVehicule) {
		int prixVR=0;
		for (Vehicule v : listeVehicule) {

			if (v.getClass().getSimpleName().equalsIgnoreCase(typeVehicule)) {
				prixVR = v.getPrix() - ((v.getPrix()*pourcentageReduction/100));
				v.setPrix(prixVR);
				System.out.println("Le nouveau prix de " + v.getMarque() + " est "+ prixVR + " euros.");
			}
		}
	}

	public void augmentation (int pourcentageAugmentation, String typeVehicule) {
		int prixVA=0;
		for (Vehicule v : listeVehicule) {

			if (v.getClass().getSimpleName().equalsIgnoreCase(typeVehicule)) {
				prixVA = v.getPrix() - ((v.getPrix()*pourcentageAugmentation/100));
				v.setPrix(prixVA);
				System.out.println("Le nouveau prix de " + v.getMarque() + " est "+ prixVA + " euros.");
			}
		}
	}
}
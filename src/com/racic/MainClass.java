package com.racic;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Moto moto1 = new Moto("Ronax","Ronax 500","noir",100000,4);
		//System.out.println(moto1);
		Moto moto2 = new Moto("BMW", "HP 4 Race","bleu",80500,4);
		Moto moto3 = new Moto("Vespa", "Scooper","jaune",1000,2);
		Moto moto4 = new Moto("BMW","Gorilla","noir",1690,3);
		Moto moto5 = new Moto("Harley Davidson","B20","noir",20000,3);
		Moto moto6 = new Moto("Honda","Shimitzu","rouge",25000,2);
		Moto moto7 = new Moto("Skyteam","Great X","bleu",2000,2);
		Moto moto8 = new Moto("Suzuki","Hara","noir",1800,4);
		Moto moto9 = new Moto("Vespa","G20","vert",800,2);
		Moto moto10 = new Moto("Skyteam","Great X","bleu",2600,3);
		Moto moto11 = new Moto("Ronax","Great X","bleu",18550,4);




		Voiture voiture1 = new Voiture ("Toyota","Corolla","grise metallique",6000,"citadine");
		//System.out.println(voiture1);
		Voiture voiture2 = new Voiture ("Renault","Clio","rouge",1200,"coupe");
		Voiture voiture3 = new Voiture ("Mini Cooper", "Hatch", "verte",30000,"citadine");
		Voiture voiture4 = new Voiture ("Toyota","Yaris Hybrid","bleue",20000,"citadine");
		Voiture voiture5 = new Voiture ("Mazda","X5","grise",25000,"citadine");
		Voiture voiture6 = new Voiture ("Mini Cooper","Beetle","jaune",31000,"coupe");
		Voiture voiture7 = new Voiture ("Mazda","the 2","blanche",29000,"citadine");
		Voiture voiture8 = new Voiture ("lamborghini", "Aventador", "orange",260000,"coupe");
		Voiture voiture9 = new Voiture ("Mercedez Benz", "X100", "noire",300000,"limousin");
		Voiture voiture10 = new Voiture ("Renault", "Espace", "maroon",26000,"citadine");
		Voiture voiture11 = new Voiture ("Toyota", "Kijang", "grise",20000,"citadine");


		Camion camion1 = new Camion("Iveco","Trakker","bleu",300000,40);
		//System.out.println(camion1);
		Camion camion2 = new Camion("Renault","Premium","blanc",26000,19);
		Camion camion3 = new Camion("Ford","Transit","gris",11000,4);
		Camion camion4 = new Camion("Iveco","Tranker X","noir",15000,8);
		Camion camion5 = new Camion("Suzuki","Transit T2","bleu",21000,20);
		Camion camion6 = new Camion("Hertz","Goolum","gris",26500,50);
		Camion camion7 = new Camion("Ford","F210","gris blanc",12000,10);
		Camion camion8 = new Camion("Suzuki","Uru","gris noir",6000,5);
		Camion camion9 = new Camion("Ford","Motoro","jaune",150000,9);
		Camion camion10 = new Camion("Mitsubishi","Gropi","vert",27000,10);
		Camion camion11 = new Camion("Hertz","Transit","gris bleu",68000,25);

		//Concession
		Concessions conces1 = new Concessions("Viva La Vehicula");
		Concessions conces2 = new Concessions("Auto-Matique");
		Concessions conces3 = new Concessions("The Empire Auto");
		Concessions conces4 = new Concessions("The Showroom");
		Concessions conces5 = new Concessions("La Mototo");

		//créer la liste de vehicules pour plusieurs concessions
		conces1.ajouterVehicule(voiture1);
		conces1.ajouterVehicule(voiture2);
		conces1.ajouterVehicule(voiture3);
		conces1.ajouterVehicule(camion1);
		conces1.ajouterVehicule(camion2);
		conces1.ajouterVehicule(camion3);
		conces1.ajouterVehicule(moto1);
		conces1.ajouterVehicule(moto2);
		conces1.ajouterVehicule(moto3);

		conces2.ajouterVehicule(voiture4);
		conces2.ajouterVehicule(voiture5);
		conces2.ajouterVehicule(moto4);
		conces2.ajouterVehicule(moto5);
		conces2.ajouterVehicule(camion4);
		conces2.ajouterVehicule(camion5);

		conces3.ajouterVehicule(voiture6);
		conces3.ajouterVehicule(voiture9);
		conces2.ajouterVehicule(moto6);
		conces2.ajouterVehicule(moto9);
		conces2.ajouterVehicule(camion6);
		conces2.ajouterVehicule(camion9);

		conces4.ajouterVehicule(voiture7);
		conces4.ajouterVehicule(voiture10);
		conces4.ajouterVehicule(moto7);
		conces4.ajouterVehicule(moto10);
		conces4.ajouterVehicule(camion7);
		conces4.ajouterVehicule(camion10);


		conces5.ajouterVehicule(voiture8);
		conces5.ajouterVehicule(voiture11);
		conces5.ajouterVehicule(moto8);
		conces5.ajouterVehicule(moto11);
		conces5.ajouterVehicule(camion8);
		conces5.ajouterVehicule(camion11);


		//System.out.print("Total vehicules dans notre boutique: ");
		//System.out.print(conces1.getNombreVehicules());
		//System.out.println(" vehicules.");

		//inventaire
		/*
		System.out.println(conces1.inventaire());
		System.out.println(conces2.inventaire());
		System.out.println(conces3.inventaire());
		System.out.println(conces4.inventaire());
		System.out.println(conces5.inventaire());
		 */

		
		//get Valeur Stock
		System.out.print("Les prix total de vehicules dans "+ conces1.getNomConcession() + " est:");
		System.out.println(conces1.getValeurStock() + " euros.");
		
		System.out.print("Les prix total de vehicules dans "+ conces2.getNomConcession() + " est:");
		System.out.println(conces2.getValeurStock() + " euros.");
		

		System.out.print("Les prix total de vehicules dans "+ conces3.getNomConcession() + " est:");
		System.out.println(conces3.getValeurStock() + " euros.");
		
		System.out.print("Les prix total de vehicules dans "+ conces4.getNomConcession() + " est:");
		System.out.println(conces4.getValeurStock() + " euros.");
		
		
		System.out.print("Les prix total de vehicules dans "+ conces5.getNomConcession() + " est:");
		System.out.println(conces5.getValeurStock() + " euros.");
		
		
		
		//Vendre
		//conces1.vendre(2);
		//System.out.println(conces1.inventaire());


		/*
		//Nombre type vehicule
		conces1.nombreTypeVehicule("Moto");
		System.out.println("Nombre Moto : " + conces1.nombreTypeVehicule("Moto"));
		System.out.println("Nombre Camion : " +conces1.nombreTypeVehicule("Camion"));
		System.out.println("Nombre Voiture : " +conces1.nombreTypeVehicule("Voiture"));
		 */
		/*
		//reduction
		System.out.println(conces1.reduction(20));
		System.out.println("La prix apres la reduction: ");
		System.out.println(conces1.inventaire());

		//augmentation
		System.out.println(conces1.augmentation(20));
		System.out.println("La prix apres l'augmentation");
		System.out.println(conces1.inventaire());

		/*
		//liquidation marque
		conces1.liquidationMarque("Renault");

		//reducation et augmentation sur l'un des 3 types
		conces1.reduction(20,"Moto");
		System.out.println(conces1.inventaire());
		conces1.augmentation(5,"voiture");
		 */

		//creer une empire
		EmpireMotorise empireMoto = new EmpireMotorise ("Empire State of Vehicule");

		//liste Concession
		empireMoto.ajouterConcession(conces1);
		empireMoto.ajouterConcession(conces2);
		empireMoto.ajouterConcession(conces3);
		empireMoto.ajouterConcession(conces4);

		//System.out.println(empireMoto.inventaireConcession());

		/*
		//INTERFACES GRAPHIQUES
		//Creation de la fenetre
		AfficheInfoVehicule fenetreV = new AfficheInfoVehicule();
		//text sur label

		fenetreV.getLabel().setText("<html>Voici les informations sur des vehicules dans <br> "+ conces1.nomConcession +":");
		fenetreV.getLabelV1().setText(voiture1.toString());
		fenetreV.getLabelV2().setText(voiture2.toString());
		fenetreV.getLabelV3().setText(voiture3.toString());

		fenetreV.getLabelC1().setText(camion1.toString());
		fenetreV.getLabelC2().setText(camion2.toString());
		fenetreV.getLabelC3().setText(camion3.toString());
		fenetreV.getLabelM1().setText(moto1.toString());
		fenetreV.getLabelM2().setText(moto2.toString());
		fenetreV.getLabelM3().setText(moto3.toString());
		 */


		//Get valeur stocks de tous les vehicules de toutes les concessions
		System.out.print("Les prix total de vehicules dans toutes les concessions ");
		System.out.println(empireMoto.getValeurConcession() + " euros.");

	}

}

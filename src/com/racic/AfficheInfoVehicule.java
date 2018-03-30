package com.racic;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class AfficheInfoVehicule extends JFrame {


	//Attributs de la classe : éléments graphiques
	private JPanel panneauV;
	private JLabel labelV;
	//public ArrayList<JLabel> listLabel = new ArrayList<JLabel>();
	private JLabel labelV1;
	private JLabel labelV2;
	private JLabel labelV3;
	private JLabel labelC1;
	private JLabel labelC2;
	private JLabel labelC3;
	private JLabel labelM1;
	private JLabel labelM2;
	private JLabel labelM3;

	//Constructeur par defaut
	public AfficheInfoVehicule() {
		//this. ici correspond à l'instance ProtoFenetre
		//Titre de la fenetre
		this.setTitle("Application sur Textuel");
		//Taille de la fenetre
		this.setSize(1000, 1000);
		//On place la fenetre au centre de l'écran
		this.setLocationRelativeTo(null);
		//Rend la fenetre visible
		this.setVisible(true);
		//Fait que la croix rouge ferme le programme
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//creation du panneau
		panneauV = new JPanel();
		//Panneau sans layout 
		panneauV.setLayout(null);
		//fixe le panneau a la fenetre
		this.setContentPane(panneauV);



		//creation du label introduction
		labelV = new JLabel();
		//position et taille
		//gauche haut largeur hauteur
		labelV.setBounds(80, 15, 900,60 );
		//ajoute le label au panneau
		panneauV.add(labelV);

		//creation du label info Voiture
		//1
		labelV1 = new JLabel();
		//position et taille
		//gauche haut largeur hauteur
		labelV1.setBounds(80, 60, 900,60 );
		//ajoute le label au panneau
		panneauV.add(labelV1);
		
		//2
		labelV2 = new JLabel();
		//position et taille
		//gauche haut largeur hauteur
		labelV2.setBounds(80, 80, 900,60 );
		
		//ajoute le label au panneau
		panneauV.add(labelV2);
	
		//3
		labelV3 = new JLabel();
		//position et taille
		//gauche haut largeur hauteur
		labelV3.setBounds(80, 100, 900,60 );
		//ajoute le label au panneau
		panneauV.add(labelV3);
	
		//creation du label info Camion
		//1
		labelC1 = new JLabel();
		//position et taille
		//gauche haut largeur hauteur
		labelC1.setBounds(80, 140, 900,60 );
		//ajoute le label au panneau
		panneauV.add(labelC1);
		
		//2
		labelC2 = new JLabel();
		//position et taille
		//gauche haut largeur hauteur
		labelC2.setBounds(80, 160, 900,60 );
		//ajoute le label au panneau
		panneauV.add(labelC2);
		
		//3
		labelC3 = new JLabel();
		//position et taille
		//gauche haut largeur hauteur
		labelC3.setBounds(80, 180, 900,60 );
		//ajoute le label au panneau
		panneauV.add(labelC3);
		
		//creation du label info Moto
		//1
		labelM1 = new JLabel();
		//position et taille
		//gauche haut largeur hauteur
		labelM1.setBounds(80, 220, 900,60 );
		//ajoute le label au panneau
		panneauV.add(labelM1);
		//2
		labelM2 = new JLabel();
		//position et taille
		//gauche haut largeur hauteur
		labelM2.setBounds(80, 240, 900,60 );
		//ajoute le label au panneau
		panneauV.add(labelM2);
		//3
		labelM3 = new JLabel();
		//position et taille
		//gauche haut largeur hauteur
		labelM3.setBounds(80, 260, 900,60 );
		//ajoute le label au panneau
		panneauV.add(labelM3);
		
	}


	public JLabel getLabelV3() {
		return labelV3;
	}


	public void setLabelV3(JLabel labelV3) {
		this.labelV3 = labelV3;
	}


	public JLabel getLabelC1() {
		return labelC1;
	}


	public void setLabelC1(JLabel labelC1) {
		this.labelC1 = labelC1;
	}


	public JLabel getLabelC2() {
		return labelC2;
	}


	public void setLabelC2(JLabel labelC2) {
		this.labelC2 = labelC2;
	}


	public JLabel getLabelC3() {
		return labelC3;
	}


	public void setLabelC3(JLabel labelC3) {
		this.labelC3 = labelC3;
	}


	public JLabel getLabelM1() {
		return labelM1;
	}


	public void setLabelM1(JLabel labelM1) {
		this.labelM1 = labelM1;
	}


	public JLabel getLabelM2() {
		return labelM2;
	}


	public void setLabelM2(JLabel labelM2) {
		this.labelM2 = labelM2;
	}


	public JLabel getLabelM3() {
		return labelM3;
	}


	public void setLabelM3(JLabel labelM3) {
		this.labelM3 = labelM3;
	}


	public JLabel getLabelV() {
		return labelV;
	}


	public void setLabelV(JLabel labelV) {
		this.labelV = labelV;
	}


	public JLabel getLabelV2() {
		return labelV2;
	}


	public void setLabelV2(JLabel labelV2) {
		this.labelV2 = labelV2;
	}


	public JPanel getPanneau() {
		return panneauV;
	}

	public void setPanneau(JPanel panneau) {
		this.panneauV = panneau;
	}

	public JLabel getLabel() {
		return labelV;
	}

	public void setLabel(JLabel label) {
		this.labelV = label;
	}


	public JLabel getLabelV1() {
		return labelV1;
	}


	public void setLabelV1(JLabel labelV1) {
		this.labelV1 = labelV1;
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.view;

import javafx.scene.layout.GridPane;

/**
 *
 * @author Formation
 */
public class EcranJeuView extends GridPane{
    private VBoxRessource vbrCarotte = new VBoxRessource(0,"file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\atelier-java-M2i\\src\\images\\carrot2.png");
    private VBoxRessource vbrBle = new VBoxRessource(0,"file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\atelier-java-M2i\\src\\images\\Wheat2.png");  
    private VBoxRessource vbrFermier = new VBoxRessource(0, "file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\atelier-java-M2i\\src\\images\\fermiers2.png");
    private VBoxRessource vbrChevre = new VBoxRessource(0, "file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\atelier-java-M2i\\src\\images\\chevre2.png");
    private VBoxRessource vbrFromage = new VBoxRessource(0,"file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\atelier-java-M2i\\src\\images\\cheese2.png");

    public EcranJeuView() {
        this.add(vbrFermier, 0,0);
        this.add(vbrCarotte, 1,0);
        this.add(vbrBle, 2, 0);
        this.add(vbrChevre, 3, 0);
        this.add(vbrFromage, 4, 0);
    }
    
    
}
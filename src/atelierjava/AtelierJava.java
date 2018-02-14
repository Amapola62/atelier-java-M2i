/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava;

import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class AtelierJava {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList();
        
        liste.add("Rouge");
        liste.add("Vert");
        liste.add("Jaune");
       
        //afficher avec une boucle chaque élément de la liste
        for(int i=0; i<liste.size() ; i++) {
            System.out.println(liste.get(i)); 
        }
        
        //for version moderne
        for(Object couleur : liste) {
            System.out.println(couleur);
        }
         
    }

    public static void mainFerme(String[] args) {
         Fermier fermier1 = new Fermier();
        
        fermier1.setNom("Douchet");
        fermier1.setPrenom("Guillaume");
        fermier1.setSpecialite("agriculteur");
        
        System.out.println( fermier1 );
    }
    /**
     * @param args the command line arguments
     */
    public static void mainAnimal(String[] args) {
        // TODO code application logic here

        Animal a1 = new Animal();
        Animal a2 = new Animal();

        a1.espece = "cochon";
        a1.poidsenKg = 12;
        a1.genre = "Sus";

        System.out.println(a1);
     
        System.out.println("Total:  " + Animal.nbAnimaux);
    }

    public static void mainVarStatiques(String[] args) {

        Personne personne1 = new Personne();
        Personne personne2 = new Personne();
        Personne personne3 = new Personne();

        personne1.setAge(30);
        personne1.setNom("Laura");
        personne2.setNom("Clara");
        personne2.setAge(0);
        personne3.setNom("Hugo");
        personne3.setAge(1);

        System.out.println("Age mini:" + Personne.getAgeMini() + ", Age maxi:"
                + Personne.getAgeMaxi());
        
       
                

    }

}

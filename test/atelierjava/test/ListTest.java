/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.test;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class ListTest {

//    @Test
    public void removeOK() {
        ArrayList<String> prenoms = new ArrayList<>();

        prenoms.add("Laura");
        prenoms.add("Lucas");
        prenoms.add("Christophe");

        prenoms.remove("Christophe");
        
        prenoms.add("Laura");
        prenoms.remove("Laura");

        for (String prenom : prenoms) {
            System.out.println(prenom);                
        }
    }
    @Test
    public void removeAllOk() {
        ArrayList<String> couleurs = new ArrayList<>();
        
        couleurs.add("Rouge");
        couleurs.add("Vert");
        couleurs.add("Jaune");
        couleurs.add("Rouge");
        
        ArrayList<String> couleurs2 = new ArrayList<>();
        
        couleurs2.add("Rouge");
        couleurs2.add("Jaune");
        
        couleurs.removeAll(couleurs2);
        
        for (String couleur : couleurs) {
            System.out.println(couleur);
        }
        
    }

//    @Test
    public void addAvecIndiceOK() {
        ArrayList<Integer> nombresPremiers = new ArrayList<>();

        nombresPremiers.add(2);
        nombresPremiers.add(5);
        nombresPremiers.add(1, 3);

        for (Integer premiers : nombresPremiers) {
            System.out.println(premiers);

        }
    }

//    @Test
    public void multipleDeDeux() {
        //Créer la liste
        ArrayList<Integer> multiplesDeDeux = new ArrayList<>();

        //Remplir la liste
        for (int i = 0; i <= 22; i = i + 2) {

            multiplesDeDeux.add(i);
        }

        //Afficher la liste
        for (Integer multiplesdeux : multiplesDeDeux) {
            System.out.println(multiplesdeux);
        }
    }

//    @Test
    public void nombresPremiers() {
        //Créer la liste
        ArrayList<Integer> nombresPremiers = new ArrayList<>();

        //Evaluer le nombre i de 
        for (int i = 2; i <= 100; i++) {

            boolean premier = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    premier = false;
                }
            }

            if (premier == true) {
                nombresPremiers.add(i);
            }

        }
        //Afficher la liste
        for (Integer premiers : nombresPremiers) {
            System.out.println(premiers);
        }
    }

//    @Test
    public void addOK() {

        ArrayList<String> capitales = new ArrayList<>();

        capitales.add("Paris");
        capitales.add("Madrid");
        capitales.add("Londres");

        for (String cap : capitales) {
            System.out.println(cap);
        }
    }

    public int factorielle(int n) {
        int res = n;
        for (int i = n - 1; i > 1; i--) {
            res = res * i;
        }
        return res;
    }

//    @Test
    public void factorielleOK() {
        int res = factorielle(4);
        System.out.println(res);
    }
}

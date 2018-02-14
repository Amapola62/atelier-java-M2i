/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava;

/**
 *
 * @author Formation
 */
public class Personne {
    private static int ageMini=0;
    private static int ageMaxi=0;
    
    private String nom;
    private int age;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public static int getAgeMini() {
        return ageMini;
    }

 
    public static int getAgeMaxi() {
        return ageMaxi;
    }

     

    public void setAge(int age) {
        this.age = age;
        
        // Met à jour l'âge maximum si age > ageMaxi
        
        if( age>Personne.ageMaxi ) {
            Personne.ageMaxi = age;
        }
        // Met à jour ageMini si ageMini=0
        //OU ageMini!=0 ET age<ageMini
        if (Personne.ageMini == -1 ) {
            Personne.ageMini = age;
        }
        if(age<Personne.ageMini)
          Personne.ageMini = age;
    }
    
    
}

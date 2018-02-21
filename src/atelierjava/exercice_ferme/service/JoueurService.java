/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.service;

import atelierjava.exercice_ferme.dao.JoueurDAO;
import atelierjava.exercice_ferme.entite.Joueur;

/**
 *
 * @author Formation
 */
/**
 * Pseudo : - mini 3 lettres, maxi 8 - unique
 *
 * Mdp: mini 5 lettres, maxi 10 -au moins une Maj et un chiffre
 *
 * @param pseudo
 * @param mdp
 */
public class JoueurService {
    
    public void inscription(String pseudo, String mdp) {
        //Erreur si pseudo a moins de 3 caractères ou plus de 10
        if (!pseudo.matches(".{3,10}")) {
            throw new RuntimeException("Le pseudo doit être compris entre 3 et 8 caractères");
        }
        //Erreur si mdp a moins de 5 caractères ou plus de 10
        if (!mdp.matches(".{5,10}")) {
            throw new RuntimeException("Le mot de passe doit être compris entre 5 et 10 caractères");
        }
        //Erreur si le mdp ne contient pas de majuscule
        if (!mdp.matches(".*[A-Z].*")) {
            throw new RuntimeException("Le mdp doit contenir une majuscule");
        }

        //Erreur si le mdp ne contient pas de chiffre
        if (!mdp.matches(".*[0-9].*")) {
            throw new RuntimeException("Le mdp doit contenir un chiffre");
        }
        //Vérifier que le pseudo est encore dispo
        JoueurDAO dao = new JoueurDAO();
        if (dao.existe(pseudo)) {
            throw new RuntimeException("Ce pseudo existe déjà");
        }
        //Ajouter la ferme dans la base de donnée
        Joueur ferme = new Joueur();
        ferme.setPseudo(pseudo);
        ferme.setMotdePasse(mdp);
        dao.ajouter(ferme);
    }
    public void connexion(String pseudo, String mdp) {
        JoueurDAO dao = new JoueurDAO();
        if (!dao.existe(pseudo, mdp)== true)
            throw new RuntimeException("Echec de connexion");
    }
}


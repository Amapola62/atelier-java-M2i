/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.service;

import atelierjava.exercice_ferme.dao.JoueurDAO;
import atelierjava.exercice_ferme.dao.RessourceDAO;
import atelierjava.exercice_ferme.entite.Joueur;
import atelierjava.exercice_ferme.entite.Ressource;
import atelierjava.exercice_ferme.exception.PseudoExisteException;
import atelierjava.exercice_ferme.exception.ValidationException;

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
    
    public void ajouterRessource(long joueurId, 
            Ressource.TypeRessource typeRessource,
            long quantite) {
        JoueurDAO dao = new JoueurDAO();
        
        Joueur joueur = dao.rechercher(joueurId);
       
            
            //1. Ajouter 5 carottes
            for( int i = 1; i<=quantite; i++){
                
                Ressource ressource = new Ressource();
                ressource.setDesignation(typeRessource);
                ressource.setJoueur(joueur);
                joueur.getRessourcesPossedees().add(ressource);
                RessourceDAO ressourceDAO = new RessourceDAO();
                ressourceDAO.ajouter(ressource);
            }
    }
        
        
   
    
    public void rejoindrePartie(long idJoueur) {
        //1. Génére les ressources SI aucune ressource pour ce joueur
        JoueurDAO dao = new JoueurDAO();
        
        Joueur joueur = dao.rechercher(idJoueur);
        if( joueur.getRessourcesPossedees().isEmpty() ) {
            
            //1. Ajouter 5 carottes
           this.ajouterRessource(idJoueur, Ressource.TypeRessource.CARROTE, 5);
                
            //2. Ajouter 5 blés
            this.ajouterRessource(idJoueur, Ressource.TypeRessource.BLE, 5);
            
            //3. Ajouter 5 chèvres
            this.ajouterRessource(idJoueur, Ressource.TypeRessource.CHEVRE, 5);
            
            //4. Ajouter 2 fermiers
            this.ajouterRessource(idJoueur, Ressource.TypeRessource.FERMIER, 2);
        }
    }
    
    public void inscription(String pseudo, String mdp) throws ValidationException, PseudoExisteException{
        //Erreur si pseudo a moins de 3 caractères ou plus de 10
        if (!pseudo.matches(".{3,10}")) {
            throw new ValidationException("Le pseudo doit être compris entre 3 et 8 caractères");
            //);
        }
        //Erreur si mdp a moins de 5 caractères ou plus de 10
        if (!mdp.matches(".{5,10}")) {
            throw new ValidationException("Le mot de passe doit être compris entre 5 et 10 caractères");
        }
        //Erreur si le mdp ne contient pas de majuscule
        if (!mdp.matches(".*[A-Z].*")) {
            throw new ValidationException("Le mdp doit contenir une majuscule");
        }

        //Erreur si le mdp ne contient pas de chiffre
        if (!mdp.matches(".*[0-9].*")) {
            throw new ValidationException("Le mdp doit contenir un chiffre");
        }
        //Vérifier que le pseudo est encore dispo
        JoueurDAO dao = new JoueurDAO();
        if (dao.existe(pseudo)) {
            throw new PseudoExisteException("Ce pseudo existe déjà");
        }
        //Ajouter la ferme dans la base de donnée
        Joueur ferme = new Joueur();
        ferme.setPseudo(pseudo);
        ferme.setMotdePasse(mdp);
        dao.ajouter(ferme);
    }
    public Joueur connexion(String pseudo, String mdp) {
        JoueurDAO dao = new JoueurDAO();
       Joueur j = dao.rechercher(pseudo, mdp);
       return j;
    }
}


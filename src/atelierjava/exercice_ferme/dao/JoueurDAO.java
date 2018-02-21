/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.dao;

import atelierjava.exercice_ferme.entite.Joueur;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class JoueurDAO {

    private static ArrayList<Joueur> joueurs = new ArrayList<>();

    public void ajouter(Joueur ferme) {
        joueurs.add(ferme);
    }

    public Joueur recherche(String pseudo) {

        for (Joueur fermeAct : joueurs) {
            if (pseudo.equals(fermeAct.getPseudo())) {
                return fermeAct;
            }
        }

        return null;
    }

    public boolean existe(String pseudo, String mdp) {
        for (Joueur joueurAct : joueurs) {
            if (joueurAct.getPseudo().equals(pseudo)
                    && joueurAct.getMotdePasse().equals(mdp)) {
                return true;
            }
        }
        return false;
    }

    public boolean existe(String login) {
        Joueur f = this.recherche(login);

        if (f == null) {
            return false;
        }

        return true;
    }
}

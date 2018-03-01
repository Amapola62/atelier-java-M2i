package atelierjava.exercice_ferme.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import atelierjava.exercice_ferme.entite.Joueur;
import atelierjava.exercice_ferme.exception.PseudoExisteException;
import atelierjava.exercice_ferme.exception.ValidationException;
import atelierjava.exercice_ferme.service.JoueurService;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class JoueurServicetTest {

    @Test
    public void inscriptionOK() throws ValidationException, PseudoExisteException {
        JoueurService service = new JoueurService();
        service.inscription("Amapola63", "EaFnb72");
    }

    @Test(expected = RuntimeException.class)
    public void inscriptionKO() throws PseudoExisteException, ValidationException {
        JoueurService service = new JoueurService();
        service.inscription("Amapola62", "BerliozPlume");
    }

    @Test
    public void connexionOK() throws ValidationException, PseudoExisteException {
       JoueurService service = new JoueurService();
       service.inscription("Amapola62", "EaFnb72");
       service.connexion("Amapola62", "EaFnb72");
    }
    @Test(expected = RuntimeException.class)
    public void connexionKO() {
        JoueurService service = new JoueurService();
        service.connexion("Robert", "Ab24utp");
    }
    @Test
    public void rejoindrePartieOK() throws ValidationException, PseudoExisteException {
        JoueurService service = new JoueurService();
        service.inscription("Amapola64", "EaFnb72");
        Joueur joueur = service.connexion("Amapola64", "EaFnb72");
        service.rejoindrePartie( joueur.getId());
    }
   
    
}

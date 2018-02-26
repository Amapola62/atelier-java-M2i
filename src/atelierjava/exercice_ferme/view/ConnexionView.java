/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.view;

import atelierjava.exercice_ferme.service.JoueurService;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Formation
 */
public class ConnexionView extends GridPane{
    private Label lPseudo = new Label("Pseudo");
    private TextField tfPseudo = new TextField();
    private Label lMdp = new Label("Mot de passe");
    private PasswordField pfMdp = new PasswordField();
    private Button bConnexion = new Button("Connexion");

    public ConnexionView() {
        this.add(lPseudo, 0, 0);
        this.add(tfPseudo, 1, 0);
        this.add(lMdp, 0, 1);
        this.add(pfMdp, 1, 1);
        this.add(bConnexion, 1, 2);

        this.bConnexion.setOnAction(e -> {
            JoueurService js = new JoueurService();
            js.connexion(tfPseudo.getText(), pfMdp.getText());
        });

    }
}

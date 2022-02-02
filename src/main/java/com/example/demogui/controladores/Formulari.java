package com.example.demogui.controladores;

import com.example.demogui.Ekonos_GUI;
import javafx.application.Application;
import javafx.fxml.FXML;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class Formulari {


    @FXML
    private Label player4_lbl;

    @FXML
    private Label player5_lbl;

    @FXML
    private Label player6_lbl;

    @FXML
    private Button addPlayer;

    @FXML
    private Button btnContinuar;

    @FXML
    private TextField player1_txt;

    @FXML
    private TextField player2_txt;

    @FXML
    private TextField player3_txt;

    @FXML
    private TextField player4_txt;

    @FXML
    private TextField player5_txt;

    @FXML
    private TextField player6_txt;

    @FXML
    private AnchorPane formulari_GUI;

    int numPlayers = 3;


    @FXML
    private void historial() throws IOException {
        Ekonos_GUI.setRoot("Historial");
    }


    @FXML
    private void continuar() throws IOException {

        List<String> jugadorsAux = new ArrayList<>();

        for (Node n : formulari_GUI.getChildren()) {
            if (n instanceof TextField) {
                if (!((TextField) n).getText().equals("")) {
                    Ekonos_GUI.nomJugadors.add(((TextField) n).getText());
                }
            }
        }

        Ekonos_GUI.setRoot("Ekonos");


    }

    @FXML
    private void validarMinimJugadors () {
        if (player1_txt != null || player2_txt != null || player3_txt != null) {
            btnContinuar.setDisable(false);
        }
    }

    @FXML
    private void addPlayer () {
        numPlayers++;
        switch (numPlayers) {
            case (4):
                player4_lbl.setVisible(true);
                player4_txt.setVisible(true);
                break;
            case (5):
                player5_lbl.setVisible(true);
                player5_txt.setVisible(true);
                break;
            case (6):
                player6_lbl.setVisible(true);
                player6_txt.setVisible(true);
                addPlayer.setVisible(false);
                break;
        }
    }

}

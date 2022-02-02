package com.example.demogui.controladores;

import com.example.demogui.Ekonos_GUI;
import javafx.application.Application;
import javafx.fxml.FXML;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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


    int numPlayers = 3;


    @FXML
    private void historial() throws IOException {
        Ekonos_GUI.setRoot("Historial");
    }


    @FXML
    private void continuar() throws IOException {

        List<String> jugadorsAux = new ArrayList<>();

        jugadorsAux.add(player1_txt.getText());
        jugadorsAux.add(player2_txt.getText());
        jugadorsAux.add(player3_txt.getText());
        jugadorsAux.add(player4_txt.getText());
        jugadorsAux.add(player5_txt.getText());
        jugadorsAux.add(player6_txt.getText());

        for (String s : jugadorsAux) {
            if (!s.isEmpty()) {
                Ekonos_GUI.nomJugadors.add(s);
            }
        }



        Ekonos_GUI.setRoot("Ekonos");
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

package com.example.demogui;

import javafx.fxml.FXML;

import java.awt.*;
import java.io.IOException;
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
    private TextField player4_txt;

    @FXML
    private TextField player5_txt;

    @FXML
    private TextField player6_txt;


    int numPlayers = 3;

    @FXML
    private void switchScene() throws IOException {
        HelloApplication.setRoot("EkonosGUI");
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
                break;
        }
    }

}

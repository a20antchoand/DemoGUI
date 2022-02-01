package com.example.demogui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ControladorPrincipal {
    @FXML
    private GridPane ekonos_GP;
    @FXML
    private AnchorPane tablero_AnchorPane;
    @FXML
    private ImageView rotateImp1;
    @FXML
    private ImageView rotatePar1;
    @FXML
    private ImageView rotateImp2;
    @FXML
    private ImageView rotatePar2;
    @FXML
    private ImageView rotateImp3;
    @FXML
    private ImageView rotatePar3;

    private List<String> nomJugadors = new ArrayList<>();

    @FXML
    private void switchView() throws IOException {
        Ekonos.setRoot("formulari");
    }

    public void onClick_btn () {
        Rotator r = new Rotator(rotateImp1, rotateImp2, rotateImp3, rotatePar1, rotatePar2, rotatePar3);

            r.run();

    }

}
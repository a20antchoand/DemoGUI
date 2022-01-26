package com.example.demogui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    final int NUM_SUCURSALES = 36;
    final double[][] POSICIONES_BOTONES;


    @FXML
    private GridPane ekonos_GP;
    @FXML
    private VBox panelJugadores;
    @FXML
    private AnchorPane panelTablero;
    @FXML
    private VBox panelAcciones;

    private Button[] botonesSucursales = new Button[NUM_SUCURSALES];

    
    public HelloController() {
        POSICIONES_BOTONES = new double[NUM_SUCURSALES][2];


        POSICIONES_BOTONES[0][0] = 123.0;   POSICIONES_BOTONES[0][1] = 522.0;
        POSICIONES_BOTONES[1][0] = 176.0;   POSICIONES_BOTONES[1][1] = 477.0;
        POSICIONES_BOTONES[2][0] = 287.0;   POSICIONES_BOTONES[2][1] = 444.0;
        POSICIONES_BOTONES[3][0] = 344.0;   POSICIONES_BOTONES[3][1] = 454.0;
        POSICIONES_BOTONES[4][0] = 397.0;   POSICIONES_BOTONES[4][1] = 430.0;
        POSICIONES_BOTONES[5][0] = 462.0;   POSICIONES_BOTONES[5][1] = 438.0;
        POSICIONES_BOTONES[6][0] = 525.0;   POSICIONES_BOTONES[6][1] = 474.0;
        POSICIONES_BOTONES[7][0] = 171.0;   POSICIONES_BOTONES[7][1] = 526.0;
        POSICIONES_BOTONES[8][0] = 235.0;   POSICIONES_BOTONES[8][1] = 553.0;
        POSICIONES_BOTONES[9][0] = 296.0;   POSICIONES_BOTONES[9][1] = 512.0;
        POSICIONES_BOTONES[10][0] = 419.0;  POSICIONES_BOTONES[10][1] = 502.0;
        POSICIONES_BOTONES[11][0] = 182.0;  POSICIONES_BOTONES[11][1] = 568.0;
        POSICIONES_BOTONES[12][0] = 239.0;  POSICIONES_BOTONES[12][1] = 595.0;
        POSICIONES_BOTONES[13][0] = 278.0;  POSICIONES_BOTONES[13][1] = 568.0;
        POSICIONES_BOTONES[14][0] = 321.0;  POSICIONES_BOTONES[14][1] = 561.0;
        POSICIONES_BOTONES[15][0] = 391.0;  POSICIONES_BOTONES[15][1] = 559.0;
        POSICIONES_BOTONES[16][0] = 496.0;  POSICIONES_BOTONES[16][1] = 574.0;
        POSICIONES_BOTONES[17][0] = 193.0;  POSICIONES_BOTONES[17][1] = 619.0;
        POSICIONES_BOTONES[18][0] = 256.0;  POSICIONES_BOTONES[18][1] = 640.0;
        POSICIONES_BOTONES[19][0] = 296.0;  POSICIONES_BOTONES[19][1] = 616.0;
        POSICIONES_BOTONES[20][0] = 343.0;  POSICIONES_BOTONES[20][1] = 600.0;
        POSICIONES_BOTONES[21][0] = 343.0;  POSICIONES_BOTONES[21][1] = 640.0;
        POSICIONES_BOTONES[22][0] = 394.0;  POSICIONES_BOTONES[22][1] = 641.0;
        POSICIONES_BOTONES[23][0] = 468.0;  POSICIONES_BOTONES[23][1] = 664.0;
        POSICIONES_BOTONES[24][0] = 107.0;  POSICIONES_BOTONES[24][1] = 688.0;
        POSICIONES_BOTONES[25][0] = 167.0;  POSICIONES_BOTONES[25][1] = 668.0;
        POSICIONES_BOTONES[26][0] = 214.0;  POSICIONES_BOTONES[26][1] = 669.0;
        POSICIONES_BOTONES[27][0] = 268.0;  POSICIONES_BOTONES[27][1] = 687.0;
        POSICIONES_BOTONES[28][0] = 311.0;  POSICIONES_BOTONES[28][1] = 689.0;
        POSICIONES_BOTONES[29][0] = 403.0;  POSICIONES_BOTONES[29][1] = 690.0;
        POSICIONES_BOTONES[30][0] = 508.0;  POSICIONES_BOTONES[30][1] = 728.0;
        POSICIONES_BOTONES[31][0] = 48.0;   POSICIONES_BOTONES[31][1] = 734.0;
        POSICIONES_BOTONES[32][0] = 114.0;  POSICIONES_BOTONES[32][1] = 741.0;
        POSICIONES_BOTONES[33][0] = 177.0;  POSICIONES_BOTONES[33][1] = 726.0;
        POSICIONES_BOTONES[34][0] = 327.0;  POSICIONES_BOTONES[34][1] = 735.0;
        POSICIONES_BOTONES[35][0] = 446.0;  POSICIONES_BOTONES[35][1] = 773.0;
    }

    
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //colocarBotonesSucursales();
    }




    private void colocarBotonesSucursales() {
        double tableroWidth = panelTablero.getWidth();
        double tableroHeight = panelTablero.getHeight();


        for (int i = 0; i < NUM_SUCURSALES; i++) {
            Button botonSucursal = new Button();
            botonSucursal.doLayout();
        }
    }
}
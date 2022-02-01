package com.example.demogui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {
    final double TABLERO_ASPECT_RATIO = 0.7244600116754232;


    @FXML
    private GridPane ekonos_GP;
    @FXML
    private VBox panelJugadores;
    @FXML
    private AnchorPane panelTablero;
    @FXML
    private VBox panelAcciones;
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        new OnLoadedEventListener(ekonos_GP, this::redimensionarJuego);
    }




    // * Redimensionado del juego

    private void redimensionarJuego() {
        adaptarDimensionPantalla();
        colocarBotonesSucursales();
    }


    private void adaptarDimensionPantalla() {
        Dimension dimensionesPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        double windowHeight = dimensionesPantalla.getHeight() - 90;
        double windowWidth = (windowHeight - 20) * TABLERO_ASPECT_RATIO + 300 + 200;


        ekonos_GP.setPrefWidth(windowWidth);
        ekonos_GP.setPrefHeight(windowHeight);
    }


    private void colocarBotonesSucursales() {
        final double tableroWidth_muestra = 606;
        final double tableroHeight_muestra = 836;
        final double tableroWidth_actual = panelTablero.getScene().getWidth() - 500;
        final double tableroHeight_actual = panelTablero.getScene().getHeight();


        for (var btnSucursal : panelTablero.getChildren()) {
            // Anchors
            double leftAnchor_actual = AnchorPane.getLeftAnchor(btnSucursal);
            double topAnchor_actual = AnchorPane.getTopAnchor(btnSucursal);

            double leftAnchor_nuevo = tableroWidth_actual * leftAnchor_actual / tableroWidth_muestra;
            double topAnchor_nuevo = tableroHeight_actual * topAnchor_actual / tableroHeight_muestra;


            // Dimensiones
            double nuevoWidth = tableroWidth_actual * ((Button) btnSucursal).getWidth() / tableroWidth_muestra;
            double nuevoHeight = nuevoWidth;


            // Cambio a los nuevos valores
            ((Button) btnSucursal).setPrefWidth(nuevoWidth);
            ((Button) btnSucursal).setPrefHeight(nuevoHeight);
            AnchorPane.setLeftAnchor(btnSucursal, leftAnchor_nuevo);
            AnchorPane.setTopAnchor(btnSucursal, topAnchor_nuevo);
        }
    }




    // * Controles de la interfaz
}
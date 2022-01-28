package com.example.demogui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {

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
        new OnLoadedEventListener(panelTablero, () -> colocarBotonesSucursales());
    }




    private void colocarBotonesSucursales() {
        final double tableroWidth_muestra = 606;
        final double tableroHeight_muestra = 836;
        final double tableroWidth_actual = panelTablero.getWidth();
        final double tableroHeight_actual = panelTablero.getHeight();

        System.out.println(panelTablero.getScene().getWidth() - 500 + " * " + panelTablero.getScene().getHeight());
        System.out.println(tableroWidth_actual + " * " + tableroHeight_actual);


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


            System.out.println(btnSucursal.getId());
            System.out.println("Tablero: " + tableroWidth_actual + " * " + tableroHeight_actual);
            System.out.println("Anchor pre: " + leftAnchor_actual + " - " + topAnchor_actual);
            System.out.println("Anchor: " + AnchorPane.getLeftAnchor(btnSucursal) + " - " + AnchorPane.getTopAnchor(btnSucursal));
            System.out.println("Width: " + ((Button) btnSucursal).getPrefWidth() + " - " + ((Button) btnSucursal).getPrefHeight());
            System.out.println();
        }
    }
}
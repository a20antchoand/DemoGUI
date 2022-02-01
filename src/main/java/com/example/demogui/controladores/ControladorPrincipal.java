package com.example.demogui.controladores;

import com.example.demogui.Ekonos_GUI;
import com.example.demogui.OnLoadedEventListener;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ControladorPrincipal implements Initializable {

    final double TABLERO_ASPECT_RATIO = 0.7244600116754232;
    final double MARGEN_TABLERO = 90.0;
    final double MEDIDA_BARRA_STAGE = 20.0;


    @FXML
    private GridPane ekonos_GP;
    @FXML
    private AnchorPane panelTablero;
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


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        new OnLoadedEventListener(ekonos_GP, this::redimensionarJuego);
    }




    private void redimensionarJuego() {
        final double[] medidasTablero = calcularMedidasTablero();


        adaptarDimensionPantalla(medidasTablero[0], medidasTablero[1]);
        colocarBotonesSucursales(medidasTablero[0], medidasTablero[1]);
    }


    private double[] calcularMedidasTablero() {
        Dimension dimensionesPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        double width;
        double height;


        height = dimensionesPantalla.getHeight() - 120;
        width = height * TABLERO_ASPECT_RATIO;

        return new double[] { width, height };
    }


    private double obtenerAnchoPanelesLaterales() {
        double ancho = 0;


        for (var panel : ekonos_GP.getChildren())
            if (!panel.equals(panelTablero)) ancho += ((Pane) panel).getWidth();


        return ancho;
    }


    private void adaptarDimensionPantalla(double tableroWidth, double tablerHeight) {
        ekonos_GP.getScene().getWindow().setWidth(tableroWidth + obtenerAnchoPanelesLaterales());
        ekonos_GP.getScene().getWindow().setHeight(tablerHeight + MEDIDA_BARRA_STAGE + 100);


        panelTablero.setMinWidth(tableroWidth);
        panelTablero.setPrefWidth(tableroWidth);
        panelTablero.setMaxWidth(tableroWidth);

        panelTablero.setMinHeight(tablerHeight);
        panelTablero.setPrefHeight(tablerHeight);
        panelTablero.setMaxHeight(tablerHeight);
    }


    private void colocarBotonesSucursales(double tableroWidth, double tableroHeight) {
        final double tableroWidth_muestra = 606;
        final double tableroHeight_muestra = 836;


        for (var btnSucursal : panelTablero.getChildren()) {
            // Anchors
            double leftAnchor_actual = AnchorPane.getLeftAnchor(btnSucursal);
            double topAnchor_actual = AnchorPane.getTopAnchor(btnSucursal);

            double leftAnchor_nuevo = tableroWidth * leftAnchor_actual / tableroWidth_muestra;
            double topAnchor_nuevo = tableroHeight * topAnchor_actual / tableroHeight_muestra;


            // Dimensiones
            double nuevoWidth = tableroWidth * ((Button) btnSucursal).getWidth() / tableroWidth_muestra;
            double nuevoHeight = nuevoWidth;


            // Cambio a los nuevos valores
            ((Button) btnSucursal).setPrefWidth(nuevoWidth);
            ((Button) btnSucursal).setPrefHeight(nuevoHeight);
            AnchorPane.setLeftAnchor(btnSucursal, leftAnchor_nuevo);
            AnchorPane.setTopAnchor(btnSucursal, topAnchor_nuevo);
        }


        System.out.println("Dimensiones pantalla: " + ekonos_GP.getScene().getWindow().getWidth() + " * " + ekonos_GP.getScene().getWindow().getHeight());
        System.out.println("Dimensiones paneles laterales: " + obtenerAnchoPanelesLaterales());
        System.out.println("Dimensiones tablero: " + panelTablero.getWidth() + " * " + panelTablero.getHeight());

    }




    @FXML
    private void switchView() throws IOException {
        Ekonos_GUI.setRoot("formulari");
    }

    public void onClick_btn () {
        Rotator r = new Rotator(rotateImp1, rotateImp2, rotateImp3, rotatePar1, rotatePar2, rotatePar3);

            r.run();

    }
}
package com.example.demogui.controladores;

import com.example.demogui.Ekonos_GUI;
import com.example.demogui.OnLoadedEventListener;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ControladorPrincipal implements Initializable {

    final double TABLERO_ASPECT_RATIO = 0.7244600116754232;


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
            double nuevoWidth = tableroWidth_actual * ((javafx.scene.control.Button) btnSucursal).getWidth() / tableroWidth_muestra;
            double nuevoHeight = nuevoWidth;


            // Cambio a los nuevos valores
            ((javafx.scene.control.Button) btnSucursal).setPrefWidth(nuevoWidth);
            ((Button) btnSucursal).setPrefHeight(nuevoHeight);
            AnchorPane.setLeftAnchor(btnSucursal, leftAnchor_nuevo);
            AnchorPane.setTopAnchor(btnSucursal, topAnchor_nuevo);
        }
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
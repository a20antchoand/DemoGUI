package com.example.demogui.controladores;

import com.example.demogui.Ekonos_GUI;
import com.example.demogui.OnLoadedEventListener;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ControladorPrincipal implements Initializable {

    final double TABLERO_ASPECT_RATIO = 0.7244600116754232;
    final double MARGEN_TABLERO = 0.87;
    final double MEDIDA_BARRA_STAGE = 34.0;


    @FXML
    private GridPane ekonos_GP;
    @FXML
    private AnchorPane panelTablero;
    @FXML
    private VBox panel1;
    @FXML
    private GridPane cartas;

    private List<String> nomJugadors = new ArrayList<>();
    public static List<Node> VBOXJugadors = new ArrayList<>();


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


        height = dimensionesPantalla.getHeight() * MARGEN_TABLERO;
        width = height * TABLERO_ASPECT_RATIO;

        return new double[] { width, height };
    }


    private double obtenerAnchoPanelesLaterales() {
        double ancho = 0;


        for (var panel : ekonos_GP.getChildren())
            if (!panel.equals(panelTablero)) ancho += ((Pane) panel).getWidth();


        return ancho;
    }


    private void adaptarDimensionPantalla(double tableroWidth, double tableroHeight) {
        panelTablero.setMinWidth(tableroWidth);
        panelTablero.setPrefWidth(tableroWidth);
        panelTablero.setMaxWidth(tableroWidth);

        panelTablero.setMinHeight(tableroHeight);
        panelTablero.setPrefHeight(tableroHeight);
        panelTablero.setMaxHeight(tableroHeight);

        ekonos_GP.getScene().getWindow().setWidth(tableroWidth + obtenerAnchoPanelesLaterales());
        ekonos_GP.getScene().getWindow().setHeight(tableroHeight + MEDIDA_BARRA_STAGE);
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
    }


    @FXML
    public void showUsers () {

        int numJugador = 0;

        for (Node n : panel1.getChildren()) {
            if (n instanceof VBox && numJugador<Ekonos_GUI.nomJugadors.size()) {
                n.setVisible(true);
                for (Node e : ((VBox) n).getChildren()) {
                    if (e instanceof HBox) {
                        for (Node d : ((HBox) e).getChildren()) {
                            if (d instanceof Label) {
                                if (d.getId().contains("jugNom")) {
                                    ((Label) d).setText(Ekonos_GUI.nomJugadors.get(numJugador));
                                }
                                if (d.getId().contains("jugEco")) {
                                    ((Label) d).setText(12 + "€");
                                }
                            }
                        }
                    }
                }
                numJugador++;
            }

        }

        showCartas();
    }


    public void showCartas () {

        int numJugador = 0;

        for (Node n : cartas.getChildren()) {
            if (n instanceof VBox) {
                System.out.println(n.getId());
                n.setVisible(true);
                for (Node o : ((VBox) n).getChildren()) {
                    System.out.println(o.getId());
                    if (o instanceof ImageView) {
                        if (o.getId().contains("op1")) {
                            ((ImageView) o).setImage(new Image("file:src/main/resources/com/example/demogui/imatges/Cartas/Epsilon.png"));
                        }
                        if (o.getId().contains("op2")) {
                            ((ImageView) o).setImage(new Image("file:src/main/resources/com/example/demogui/imatges/Cartas/Epsilon.png"));
                        }
                        if (o.getId().contains("op3")) {
                            ((ImageView) o).setImage(new Image("file:src/main/resources/com/example/demogui/imatges/Cartas/Epsilon.png"));
                        }
                    }
                }
            }
        }
    }


}
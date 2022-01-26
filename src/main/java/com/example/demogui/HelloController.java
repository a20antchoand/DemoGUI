package com.example.demogui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

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
        panelTablero.setOnMouseClicked(ActionEvent -> colocarBotonesSucursales());
        colocarBotonesSucursales();
    }




    private void colocarBotonesSucursales() {
        final double tableroWidth_muestra = 606;
        final double tableroHeight_muestra = 836;
        double tableroWidth_actual = panelTablero.getWidth();
        double tableroHeight_actual = panelTablero.getHeight();


        System.out.println(panelTablero.getWidth());

        for (var btnSucursal : panelTablero.getChildren()) {
            double leftAnchor_actual = AnchorPane.getLeftAnchor(btnSucursal);
            double topAnchor_actual = AnchorPane.getTopAnchor(btnSucursal);
            double leftAnchor_nuevo = tableroWidth_actual * leftAnchor_actual / tableroWidth_muestra;
            double topAnchor_nuevo = tableroHeight_actual * topAnchor_actual / tableroHeight_muestra;

            //System.out.println(leftAnchor_nuevo + "\t" + topAnchor_nuevo);

            AnchorPane.setLeftAnchor(btnSucursal, leftAnchor_nuevo);
            AnchorPane.setTopAnchor(btnSucursal, topAnchor_nuevo);
        }
    }
}
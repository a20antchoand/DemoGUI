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
        double tableroWidth_actual = panelTablero.getWidth();
        double tableroHeight_actual = panelTablero.getHeight();


        for (var btnSucursal : panelTablero.getChildren()) {
            double leftAnchor_actual = AnchorPane.getLeftAnchor(btnSucursal);
            double topAnchor_actual = AnchorPane.getTopAnchor(btnSucursal);

            double leftAnchor_nuevo = tableroWidth_actual * leftAnchor_actual / tableroWidth_muestra;
            double topAnchor_nuevo = tableroHeight_actual * topAnchor_actual / tableroHeight_muestra;

            double nuevoWidth = tableroWidth_actual * ((Button) btnSucursal).getWidth() / tableroWidth_muestra;
            double nuevoHeight = tableroHeight_actual * ((Button) btnSucursal).getHeight() / tableroHeight_muestra;



            AnchorPane.setLeftAnchor(btnSucursal, leftAnchor_nuevo);
            AnchorPane.setTopAnchor(btnSucursal, topAnchor_nuevo);
            btnSucursal.prefWidth(200);
            btnSucursal.minWidth(200);
            btnSucursal.maxWidth(200);
            btnSucursal.prefHeight(200);
        }
    }
}
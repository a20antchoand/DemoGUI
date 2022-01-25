package com.example.demogui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class HelloController {
    @FXML
    private AnchorPane tablero_AnchorPane;

    @FXML
    private ImageView tablero_img;

    @FXML
    private Button botonHola;


    public HelloController() {
        //tablero_img.fitWidthProperty().bind(tablero_AnchorPane.widthProperty());
    }




    @FXML
    private void prueba(ActionEvent e) {
        tablero_img.setFitWidth(200);
    }
}
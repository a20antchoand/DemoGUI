package com.example.demogui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label sucursal;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    //On click show sucursal id
    public void btnSucursal_onClick(ActionEvent actionEvent) {
        sucursal.setText("Sucursal: " + ((Button)actionEvent.getSource()).getId());
    }
}
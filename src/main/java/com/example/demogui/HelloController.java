package com.example.demogui;

import javafx.beans.Observable;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Window;

import javax.swing.event.ChangeEvent;
import javax.swing.event.MouseInputAdapter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    final double TABLERO_ASPECT_RATIO = 0.7244600116754232;

    WindowResizedEventListener prueba;


    @FXML
    private GridPane ekonos_GP;

    @FXML
    private AnchorPane tablero_AnchorPane;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tablero_AnchorPane.widthProperty().addListener(this::stage_onWidthChange);
        tablero_AnchorPane.heightProperty().addListener(this::stage_onHeightChange);
    }




    private void stage_onWidthChange(Observable obs, Number oldValue, Number newValue) {
        double newHeight = tablero_AnchorPane.getWidth() / TABLERO_ASPECT_RATIO + 39;

        if (prueba == null)
            prueba = new WindowResizedEventListener(
                    ekonos_GP.getScene().getWindow(),
                    () -> prueba2());

        //tablero_AnchorPane.widthProperty().removeListener(this::stage_onWidthChange);
        //ekonos_GP.getScene().getWindow().setHeight(newHeight);
        //tablero_AnchorPane.widthProperty().addListener(this::stage_onWidthChange);
    }

    private void prueba2() {
        double newHeight = tablero_AnchorPane.getWidth() / TABLERO_ASPECT_RATIO + 39;
        ekonos_GP.getScene().getWindow().setHeight(newHeight);
    }

    private void stage_onHeightChange(Observable obs, Number oldValue, Number newValue) {
        double newWidth = newValue.doubleValue() * TABLERO_ASPECT_RATIO + 300 + 200;

        //System.out.println(ekonos_GP.getWidth() + '\t' + ekonos_GP.getHeight());
        //System.out.println(newWidth);
        //System.out.println();

        //tablero_AnchorPane.widthProperty().removeListener(this::stage_onWidthChange);
        //ekonos_GP.getScene().getWindow().setHeight(newValue.doubleValue() * TABLERO_ASPECT_RATIO + 300 + 200);
        //tablero_AnchorPane.widthProperty().addListener(this::stage_onWidthChange);
    }
}
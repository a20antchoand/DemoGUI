package com.example.demogui;

import javafx.beans.Observable;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Window;

import javax.swing.event.ChangeEvent;
import javax.swing.event.MouseInputAdapter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private GridPane ekonos_GP;
    @FXML
    private AnchorPane tablero_AnchorPane;
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


    @FXML
    private void switchView() throws IOException {
        HelloApplication.setRoot("formulari");
    }

    public void onClick_btn () {
        rotator r = new rotator(rotateImp1, rotateImp2, rotateImp3, rotatePar1, rotatePar2, rotatePar3);

            r.run();

    }

}
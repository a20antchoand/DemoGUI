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
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
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
    private ImageView rotateP1;
    @FXML
    private ImageView rotateP2;
    @FXML
    private ImageView rotateP3;
    @FXML
    private ImageView rotateP4;
    @FXML
    private ImageView rotateP5;
    @FXML
    private ImageView rotateP6;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
       rotatePar3.setOnMouseClicked((ActionEvent) -> {
               rotateImp1.setRotate(rotateImp1.getRotate() + 30);
               rotatePar1.setRotate(rotatePar1.getRotate() - 30);
               rotateImp2.setRotate(rotateImp2.getRotate() + 30);
               rotatePar2.setRotate(rotatePar2.getRotate() - 30);
               rotateImp3.setRotate(rotateImp3.getRotate() + 30);
               rotatePar3.setRotate(rotatePar3.getRotate() - 30);
           rotateP1.setRotate(rotateP1.getRotate() + 20);
           rotateP2.setRotate(rotateP2.getRotate() - 20);
           rotateP3.setRotate(rotateP3.getRotate() + 20);
           rotateP4.setRotate(rotateP4.getRotate() - 20);
           rotateP5.setRotate(rotateP5.getRotate() + 20);
           rotateP6.setRotate(rotateP6.getRotate() - 20);
       });

    }
}
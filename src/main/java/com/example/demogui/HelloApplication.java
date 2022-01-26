package com.example.demogui;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.awt.*;
import java.io.IOException;


public class HelloApplication extends Application {
    final double TABLERO_ASPECT_RATIO = 0.7244600116754232;


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("EkonosGUI.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        
        stage.setTitle("Ekonos");
        stage.setScene(scene);
        stage.setResizable(false);
        adaptarTamanio(stage);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }




    private void adaptarTamanio(Stage stage) {
        Dimension dimensionesPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        double windowHeight = dimensionesPantalla.getHeight() - 90;
        double windowWidth = (windowHeight - 20) * TABLERO_ASPECT_RATIO + 300 + 200;


        stage.setHeight(windowHeight);
        stage.setWidth(windowWidth);
    }
}
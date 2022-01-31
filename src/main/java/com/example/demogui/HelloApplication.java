package com.example.demogui;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.awt.*;
import java.io.IOException;
import java.net.URL;


public class HelloApplication extends Application {

    private Stage stage;


    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;


        cambiarEscena(HelloApplication.class.getResource("EkonosGUI.fxml"));
    }




    public void cambiarEscena(URL recurso) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(recurso);
        Scene scene = new Scene(fxmlLoader.load());


        // Configura el stage
        stage.setTitle("Ekonos");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        // Espera a que la interfaz se cargue
        while (stage.getWidth() == 0.0 && stage.getHeight() == 0.0);
    }
}
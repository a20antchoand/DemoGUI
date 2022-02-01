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

    private Stage stage;


    public static void main(String[] args) {
        launch();
    }
    public static List<String> nomJugadors = new ArrayList<>();


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
        stage.getIcons().add(new Image("file:src/main/resources/com/example/demogui/imatges/icon.png"));
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Ekonos.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }


}
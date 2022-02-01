package com.example.demogui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.Parent;


import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Ekonos extends Application {

    public static List<String> nomJugadors = new ArrayList<>();

    final double TABLERO_ASPECT_RATIO = 0.7244600116754232;

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Ekonos.class.getResource("Formulari.fxml"));
        scene = new Scene(fxmlLoader.load(), 1000, 1000);
        stage.setTitle("Ekonos");
        stage.getIcons().add(new Image("file:src/main/resources/com/example/demogui/imatges/icon.png"));
        stage.setScene(scene);
        stage.setResizable(false);
        //adaptarTamanio(stage);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Ekonos.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }



    private void adaptarTamanio(Stage stage) {
        Dimension dimensionesPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        double windowHeight = dimensionesPantalla.getHeight() - 90;
        double windowWidth = (windowHeight - 20) * TABLERO_ASPECT_RATIO + 300 + 200;


        stage.setHeight(windowHeight);
        stage.setWidth(windowWidth);
    }


    public static void main(String[] args) {
        launch();
    }

}
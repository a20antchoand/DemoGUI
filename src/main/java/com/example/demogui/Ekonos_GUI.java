package com.example.demogui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;


public class Ekonos_GUI extends Application {

    private static Scene scene;
    public static List<String> nomJugadors = new ArrayList<>();
    public static List<Node> VBOXJugadors = new ArrayList<>();
    public static AnchorPane AnchorJugadors;

    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage stage) throws IOException {
        Ekonos_GUI.setRoot("Formulari");

        stage.setTitle("Ekonos");
        stage.getIcons().add(new Image("file:src/main/resources/com/example/demogui/imatges/icon.png"));
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }




    public static void setRoot(String fxml) throws IOException {
        if (scene == null) scene = new Scene(loadFXML(fxml));
        else scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Ekonos_GUI.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }


}
package com.example.demogui;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {
    final double STAGE_MIN_WIDTH = 816.0;
    final double STAGE_MIN_HEIGHT = 452.0;


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("EkonosGUI.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Ekonos");
        stage.setScene(scene);
        stage.setMinWidth(STAGE_MIN_WIDTH);
        stage.setMinHeight(STAGE_MIN_HEIGHT);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
package com.example.demogui;

import javafx.application.Platform;
import javafx.scene.layout.Pane;


public class OnLoadedEventListener implements Runnable {

    private final Thread EVENT_THREAD;

    private Pane panel;
    private OnLoadedAction accion;


    public OnLoadedEventListener(Pane panel, OnLoadedAction accion) {
        this.panel = panel;
        this.accion = accion;


        EVENT_THREAD = new Thread(this, "OnLoadedEventListener");
        EVENT_THREAD.start();
    }


    @Override
    public void run() {
        try {
            // Espera a que el elemento tenga un mínimo de píxeles
            while (panel.getWidth() == 0.0 && panel.getHeight() == 0.0) Thread.sleep(10);
            // Espera a posibles cambios de la interfaz tras ejecutar
            Thread.sleep(100);
            // Realiza la acción deseada por el usuario
            Platform.runLater(() -> accion.execute());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

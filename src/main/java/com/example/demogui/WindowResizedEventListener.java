package com.example.demogui;

import javafx.stage.Window;

public class WindowResizedEventListener implements Runnable {

    private final Thread windowResizedEventListenerThread;
    private final Window ventana;
    private final WindowResizedAction windowResizedAction;


    public WindowResizedEventListener(Window ventana, WindowResizedAction action) {
        this.ventana = ventana;
        this.windowResizedAction = action;
        this.windowResizedEventListenerThread = new Thread(this);
        this.windowResizedEventListenerThread.start();
    }




    @Override
    public void run() {
        double valorAnterior = 0;
        boolean modificacion = false;


        while (true) {
            if (valorAnterior != ventana.getWidth()) {
                valorAnterior = ventana.getWidth();
                modificacion = true;
            }

            else if (modificacion == true) {
                windowResizedAction.action();
                modificacion = false;
            }

            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

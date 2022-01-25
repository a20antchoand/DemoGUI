package com.example.demogui;

import javafx.stage.Window;

import java.time.LocalTime;

public class WindowResizedEventListener implements Runnable {

    private Window ventana;


    public WindowResizedEventListener(Window ventana) {
        this.ventana = ventana;
    }




    @Override
    public void run() {
        double valorAnterior = 0;


        while (true) {
            if (valorAnterior != ventana.getWidth()) {
                System.out.println("Modificación");
                valorAnterior = ventana.getWidth();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(valorAnterior + "\t" + ventana.getWidth());

                if (valorAnterior == ventana.getWidth()) {
                    System.out.println("Fin modificación");
                }
            }
        }
    }
}

package com.example.demogui.controladores;

import javafx.scene.image.ImageView;

public class Rotator extends Thread{

    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    
    public Rotator(ImageView img1, ImageView img2, ImageView img3, ImageView img4, ImageView img5, ImageView img6) {
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
        this.img6 = img6;
    }

    @Override
    public void run() {

        do {
            img1.setRotate(img1.getRotate() + 10);
            img2.setRotate(img2.getRotate() + 10);
            img3.setRotate(img3.getRotate() + 10);
            img4.setRotate(img4.getRotate() + 10);
            img5.setRotate(img5.getRotate() + 10);
            img6.setRotate(img6.getRotate() + 10);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (img1.getRotate() != 90);

    }
}

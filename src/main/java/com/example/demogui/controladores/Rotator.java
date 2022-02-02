package com.example.demogui.controladores;

import javafx.scene.image.Image;
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


            img1.setImage(new Image("file:src/main/resources/com/example/demogui/imatges/cartaFrontal.png"));
            img2.setImage(new Image("file:src/main/resources/com/example/demogui/imatges/cartaFrontal.png"));
            img3.setImage(new Image("file:src/main/resources/com/example/demogui/imatges/cartaFrontal.png"));
            img4.setImage(new Image("file:src/main/resources/com/example/demogui/imatges/cartaFrontal.png"));
            img5.setImage(new Image("file:src/main/resources/com/example/demogui/imatges/cartaFrontal.png"));
            img6.setImage(new Image("file:src/main/resources/com/example/demogui/imatges/cartaFrontal.png"));


    }
}

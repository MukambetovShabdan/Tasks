import processing.core.PApplet;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main extends PApplet {


    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    float x;
    float y;
    float alpha = 0;
    float beta;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = width / 3;
        y = height / 12;
        frameRate(30);
        noStroke();

    }


    public void draw() {
//        fill (0, 20, 70, 0.1f);
//        rect(0,0,width,height);
        background(0, 20, 70, 10);
        pushMatrix();
        translate(width / 2, height / 2);
        rotate(alpha);
        alpha += 0.03;
        for (int i = 1; i <= num; i++) {
            fill(250, 250,0);


            ellipse(0, 0, x, y);
            rotate(beta);
            beta = PI/num;
        }






        popMatrix();

    }

    public static void main(String... args) {

        PApplet.main("Main");
    }
}





















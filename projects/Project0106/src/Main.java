import processing.core.PApplet;

import javax.swing.*;
import java.util.Scanner;

public class Main extends PApplet {


    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    float x;
    float y;
    float alpha = 0;
    float beta = 360;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = width / 10;
        y = height / 10;
        frameRate(100);
    }


    public void draw() {
        background(0);
        pushMatrix();
        translate(width / 2, height / 2);
        rotate(alpha);
        alpha += 0.03;
        for (int i = 1; i <= num; i++) {
            fill(255, 255, 0);
            ellipse(0, 0, x, y);
            rotate(beta);
            beta = beta - beta / num;

        }


        popMatrix();
    }

    public static void main(String... args) {

        PApplet.main("Main");
    }
}
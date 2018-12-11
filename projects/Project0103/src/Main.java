import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {

    float x;
    float[] xx;
    float y;
    float r = 100;
    float diameter = 100;
    float a;
    float dx;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(10);
        x = width / 2 - 450;
        dx = 3;
        xx = new float[9];
        for (int i = 0; i < 9; i += 1) {
            xx[i] = (width / 2 - 450) + i * 100;
        }
    }


    public void draw() {
        background(0);

        circle(width / 2 - 450);
        x += dx;
        for (int i = 0; i < 9; i += 1) {
            if (x > xx[i]) {
                x = xx[i + 1];
                x += dx;
            }
            if (x > xx[8]) {
                x = xx[0];
                x += dx;
            }
        }
    }


    public static void main(String... args) {
        PApplet.main("Main");
    }

    void circle(float x) {

for(int f = 0; f <9; f ++){
        pushMatrix();
        translate(xx[f], height / 2);
        stroke(255, 0, 0);
        strokeWeight(4);
        fill(255, 0, 0, 255);
        ellipse(0, 0, r, (float)Math.sqrt((f+3)) * 25);

        popMatrix();
    }


}
}
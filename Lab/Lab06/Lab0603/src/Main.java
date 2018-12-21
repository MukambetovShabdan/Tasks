import processing.core.PApplet;

import javax.swing.*;
import java.util.Random;

public class Main extends PApplet {
    float r = 200;
    public void settings() {
        fullScreen();
    }
    public void setup() {
        frameRate(100);
    }
    public void draw() {
        background(0);
        drawStar(width / 2, height / 2, r, 255, 0, 0);
        drawStar(width / 4, height / 4, r / 2, 0, 255, 0);
        drawStar(width * 3 / 4, height / 4, r / 2, 0, 255, 0);
        drawStar(width / 4, height * 3 / 4, r / 2, 0, 255, 0);
        drawStar(width * 3 / 4, height * 3 / 4, r / 2, 0, 255, 0);
    }

    public static void main(String... args) {
        PApplet.main("Main");
    }

    void drawStar(float x, float y, float r, int a, int b, int c) {
        pushMatrix();
        float d = 3;
        float smallr = (float) (r / d / Math.sqrt(2));
        translate(x, y);
        fill(a, b, c);
        stroke(a, b, c);
        strokeWeight(2);
        line(0, 0, r, 0);
        line(r, 0, smallr, smallr);
        line(r, 0, smallr, -smallr);

        rotate(PI / 2);
        line(0, 0, r, 0);
        line(r, 0, smallr, smallr);
        line(r, 0, smallr, -smallr);

        rotate(PI / 2);
        line(0, 0, r, 0);
        line(r, 0, smallr, smallr);
        line(r, 0, smallr, -smallr);

        rotate(PI / 2);
        line(0, 0, r, 0);
        line(r, 0, smallr, smallr);
        line(r, 0, smallr, -smallr);

        rotate(PI / 4);
        line(0, 0, r / d, 0);

        rotate(PI / 2);
        line(0, 0, r / d, 0);

        rotate(PI / 2);
        line(0, 0, r / d, 0);

        rotate(PI / 2);
        line(0, 0, r / d, 0);

        popMatrix();


    }
}
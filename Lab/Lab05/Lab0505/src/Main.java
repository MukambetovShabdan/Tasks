import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {

    static int n;

    float x;
    float y;
    float r;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = width / 2;
        y = height / 2;

        frameRate(100);
    }


    public void draw() {
        background(0);
        noStroke();
        for (int r = 640 / n; r <= 640; r += 640 / n) {
            fill(255, 500 / n);
            ellipse(x, y, r, r);
        }
    }

    public static void main(String... args) {
        n = Integer.parseInt(JOptionPane.showInputDialog("N: "));
        PApplet.main("Main");
    }
}
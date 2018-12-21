import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {
    static int n;

    float x;
    float y;
    float r;
    int c;

    public void settings() {
        fullScreen();
    }

    public void setup() {

        frameRate(4);
    }


    public void draw() {
        background(0);
        for (int i = 0; i < n; i++)
        {
            x = random(0, width);
            y = random(0, height);
            r = random(40, 100);
            c = (int) (0xFF000000 + random(0x00FFFFFF));
            fill(c);
            ellipse(x, y, r, r);
        }
        noLoop();
    }

    public static void main(String... args) {
        n = Integer.parseInt(JOptionPane.showInputDialog("N: "));
        PApplet.main("Main");
    }
}
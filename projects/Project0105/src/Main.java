import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {
    float a;

    public void settings() {
        fullScreen();
    }

    public void setup() {

        frameRate(1);noStroke();
    }



    public void draw() {
        background(0, 1);
        for (int i = 0; i < 25; i++) {
            float x = random(width);
            float y = random(height);
            float r = random(80, 150);
            float v1 = 0;
            float v3 = 0;
            float v2 = 0;
            float colour = random(1, 4);
            switch ((int) colour) {
                case 1:
                    v1 = 255;
                    v2 = 0;
                    v3 = 0;
                    break;
                case 2:
                    v1 = 0;
                    v2 = 255;
                    v3 = 0;
                    break;
                case 3:
                    v1 = 0;
                    v2 = 0;
                    v3 =255;
                    break;
            }
            strokeWeight(7);
            a = 60;
            for (int f = 0; f <15; f++) {

                fill(v1, v2, v3,a);
                ellipse(x, y, r, r);
                r -= 5;
                a -=4;

            }
        }
    }

    public static void main(String... args) {
        PApplet.main("Main");
    }
}

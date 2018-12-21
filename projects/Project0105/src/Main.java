<<<<<<< HEAD
import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {

    float x;
    float y;
    float r;
    int c;
    int alfa = 250;

    public void settings() {
        fullScreen();
    }

    public void setup() {

        frameRate(10);
    }

    public void draw() {
        fill(0, 0, 0, 100);
        rectMode(CENTER);
        rect(width / 2, height / 2, width, height);

        for (int i = 1; i <= 2; i++) {
            x = random(width);
            y = random(height);
            r = random(40, 150);
            for (int f = 1; f <= 2; f++) {
                fill(0, 0, 255, 3);
                for (int d = 1; d <= r; d++) {
                    ellipse(x, y, d, d);
                }

            }
        }
        for (int i = 1; i <= 2; i++) {
            x = random(width);
            y = random(height);
            r = random(40, 150);
            for (int f = 1; f <= 2; f++) {
                fill(255, 0, 0, 3);
                for (int d = 1; d <= r; d++) {
                    ellipse(x, y, d, d);
                }

            }
        }
        for (int i = 1; i <= 2; i++) {
            x = random(width);
            y = random(height);
            r = random(40, 150);
            for (int f = 1; f <= 2; f++) {
                fill(0, 255, 0, 3);
                for (int d = 1; d <= r; d++) {
                    ellipse(x, y, d, d);
                }

            }
        }
    }

    public static void main(String... args) {
        PApplet.main("Main");
    }


}
=======
import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {

    float x;
    float y;
    float r;
    int c;
    int alfa = 250;

    public void settings() {
        fullScreen();
    }

    public void setup() {

        frameRate(10);
    }

    public void draw() {
        fill(0, 0, 0, 100);
        rectMode(CENTER);
        rect(width / 2, height / 2, width, height);

        for (int i = 1; i <= 2; i++) {
            x = random(width);
            y = random(height);
            r = random(40, 150);
            for (int f = 1; f <= 2; f++) {
                fill(0, 0, 255, 3);
                for (int d = 1; d <= r; d++) {
                    ellipse(x, y, d, d);
                }

            }
        }
        for (int i = 1; i <= 2; i++) {
            x = random(width);
            y = random(height);
            r = random(40, 150);
            for (int f = 1; f <= 2; f++) {
                fill(255, 0, 0, 3);
                for (int d = 1; d <= r; d++) {
                    ellipse(x, y, d, d);
                }

            }
        }
        for (int i = 1; i <= 2; i++) {
            x = random(width);
            y = random(height);
            r = random(40, 150);
            for (int f = 1; f <= 2; f++) {
                fill(0, 255, 0, 3);
                for (int d = 1; d <= r; d++) {
                    ellipse(x, y, d, d);
                }

            }
        }
    }

    public static void main(String... args) {
        PApplet.main("Main");
    }


}
>>>>>>> 6becc31ecf0535cde9041672d21f2c62b7103190

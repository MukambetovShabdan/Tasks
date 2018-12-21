<<<<<<< HEAD
import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {

    static String fW;
    static String sW;
    float x1;
    float x2;
    float dx1;
    float dx2;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(100);
        x1 = width / 2;
        x2 = width / 2;
        dx1 = 3;

    }

    public void draw() {
        background(0);
        textSize(200);
        fill(0, 255, 0);
        textAlign(CENTER, CENTER);
        text(fW, x1, height / 2 - 100);
        dx2 = ((width - textWidth(sW)) / (width - textWidth(fW))) * dx1;
        x1 += dx1;
        if (x1 > width - textWidth(fW) / 2) {
            x1 = width - textWidth(fW) / 2;
            dx1 = -dx1;
        }
        if (x1 < textWidth(fW) / 2) {
            x1 = textWidth(fW) / 2;
            dx1 = -dx1;
        }


        fill(255, 255, 0);
        textSize(200);
        textAlign(CENTER, CENTER);
        text(sW, x2, height / 2 + 100);
        x2 -= dx2;
        if (x2 > width - textWidth(sW) / 2) {
            x2 = width - textWidth(sW) / 2;
            dx2 = -dx2;
        }
        if (x2 < textWidth(sW) / 2) {
            x2 = textWidth(sW) / 2;
            dx2 = -dx2;
        }
    }

    public static void main(String... args) {
        fW = JOptionPane.showInputDialog("firstWord: ");
        sW = JOptionPane.showInputDialog("secondWord: ");
        PApplet.main("Main");
    }
}

=======
import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {

    static String fW;
    static String sW;
    float x1;
    float x2;
    float dx1;
    float dx2;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(100);
        x1 = width / 2;
        x2 = width / 2;
        dx1 = 3;

    }

    public void draw() {
        background(0);
        textSize(200);
        fill(0, 255, 0);
        textAlign(CENTER, CENTER);
        text(fW, x1, height / 2 - 100);
        dx2 = ((width - textWidth(sW)) / (width - textWidth(fW))) * dx1;
        x1 += dx1;
        if (x1 > width - textWidth(fW) / 2) {
            x1 = width - textWidth(fW) / 2;
            dx1 = -dx1;
        }
        if (x1 < textWidth(fW) / 2) {
            x1 = textWidth(fW) / 2;
            dx1 = -dx1;
        }


        fill(255, 255, 0);
        textSize(200);
        textAlign(CENTER, CENTER);
        text(sW, x2, height / 2 + 100);
        x2 -= dx2;
        if (x2 > width - textWidth(sW) / 2) {
            x2 = width - textWidth(sW) / 2;
            dx2 = -dx2;
        }
        if (x2 < textWidth(sW) / 2) {
            x2 = textWidth(sW) / 2;
            dx2 = -dx2;
        }
    }

    public static void main(String... args) {
        fW = JOptionPane.showInputDialog("firstWord: ");
        sW = JOptionPane.showInputDialog("secondWord: ");
        PApplet.main("Main");
    }
}

>>>>>>> 6becc31ecf0535cde9041672d21f2c62b7103190

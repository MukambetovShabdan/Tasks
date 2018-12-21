import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {
    float x[];
    float y[];
    int n = 100;
    float dx[];
    float dy[];
    float speed = 100;
    int rad = 4;
    int r = 255;
    int g;
    int b;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(100);
        x = new float[n];
        y = new float[n];
        dx = new float[n];
        dy = new float[n];


        pushMatrix();
        translate(width / 2, height / 2);


        for (int q = 0; q < n; q++) {
            x[q] = random(0, width / 2);
            y[q] = random(0, height / 2);
            dx[q] = x[q] / 100;
            dy[q] = y[q] / 100;


        }

        popMatrix();
    }


    public void draw() {
        drawStar(0, 33, 255,0,0);
        drawStar(33, 67,0,255,0);
        drawStar(67, 100,0,0,255);

    }

    public static void main(String... args) {
        PApplet.main("Main");
    }
    void drawStar(int z, int k, int r, int g, int b){ pushMatrix();


        translate(width / 2, height / 2);
        fill(0, 0, 0, 50);
        rectMode(CENTER);
        rect(0, 0, width, height);


        for (int i = z; i < k; i++) {
            fill(r, g, b);
            ellipse(x[i], y[i], rad, rad);
            x[i] += dx[i];
            y[i] += dy[i];
            if (x[i] > width / 2 && y[i] > height / 2) {
                x[i] = random(0, width / 2);
                y[i] = random(0, height / 2);
                dx[i] = x[i] / 100;
                dy[i] = y[i] / 100;
            }

        }

        rotate(PI / 2);
        for (int i = z; i < k; i++) {
            fill(r, g, b);
            ellipse(x[i], y[i], rad, rad);
            x[i] += dx[i];
            y[i] += dy[i];
            if (x[i] > width / 2 && y[i] > height / 2) {
                x[i] = random(0, width / 2);
                y[i] = random(0, height / 2);
                dx[i] = x[i] / 100;
                dy[i] = y[i] / 100;
            }

        }

        rotate(PI / 2);
        for (int i = z; i < k; i++) {
            fill(r, g, b);
            ellipse(x[i], y[i], rad, rad);
            x[i] += dx[i];
            y[i] += dy[i];
            if (x[i] > width / 2 && y[i] > height / 2) {
                x[i] = random(0, width / 2);
                y[i] = random(0, height / 2);
                dx[i] = x[i] / 100;
                dy[i] = y[i] / 100;
            }

        }

        rotate(PI / 2);
        for (int i = z; i < k; i++) {
            fill(r, g, b);
            ellipse(x[i], y[i], rad, rad);
            x[i] += dx[i];
            y[i] += dy[i];
            if (x[i] > width / 2 && y[i] > height / 2) {
                x[i] = random(0, width / 2);
                y[i] = random(0, height / 2);
                dx[i] = x[i] / 100;
                dy[i] = y[i] / 100;
            }

        }


        popMatrix();}
}
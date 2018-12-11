import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {

    float[] x;
    float[] y;
    float[] dx;
    float[] dy;
    float [] c;
    float r,g,b;
    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = new float[150];
        y = new float[150];
        dx = new float[150];
        dy = new float[150];
        c = new float[150];
        for (int i = 0; i < 150; ++i) {
            x[i] = random(width);
            y[i] = random(height);
            dx[i] =  (float) Math.sqrt(x[i]);
            dy[i] = (float) Math.sqrt(y[i]);

        }frameRate(100);
    }


    public void draw() {
        background(0);

        for (int i = 0; i < 150; ++i) {
            fill(0,255,0);
            ellipse(x[i], y[i], 12, 12);
            if (x[i]>=0&&y[i]>=0){
            x[i] +=dx[i];
            y[i] +=dy[i];}
            else if (x[i]< 0&& y[i] < 0){
                x[i] -=dx[i];
                y[i] -=dy[i];
            }else if (x[i]> 0&& y[i] < 0){
                x[i] +=dx[i];
                y[i] -=dy[i];
            }else if (x[i]< 0&& y[i] > 0){
                x[i] -=dx[i];
                y[i] +=dy[i];
            }

        }
    }

    public static void main(String... args) {
        PApplet.main("Main");
    }
}
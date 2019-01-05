import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {
        static int n;
    float x[];
    float y[];
    float dx[];
    float dy[];
    float r;
    float vis[];

    public void settings() {
        fullScreen();
    }

    public void setup() {
        noStroke();
        x = new float[n];
        y = new float[n];
        dx = new float[n];
        dy = new float[n];
        r = 40;
        vis = new float[n];
        for(int i = 0; i < x.length; i ++) {
            x[i] = r * (i+1) / (float)Math.sqrt(2.0);
            y[i] = r * (i+1) / (float)Math.sqrt(2.0);
            dx[i] = 3;
            dy[i] = 3;
            vis[i] += (i+1) * 255.0/x.length;
        }
    }

    public void draw() {
        background(0);
        for (int i = 0; i < x.length; i++) {
            drawing(x[i],y[i],r, 0, 0, 255, vis[i]);
            x[i] += dx[i];
            y[i] += dy[i];
        }
        for (int i = 0; i < x.length; ++i) {

            if (x[i] < 0) {
                x[i] = -x[i];
                dx[i] = -dx[i];
            }
            if (x[i] > width) {
                x[i] = width * 2 - x[i];
                dx[i] = -dx[i];
            }
            if (y[i] < 0) {
                y[i] = -y[i];
                dy[i] = -dy[i];
            }
            if (y[i] > height) {
                y[i] = height * 2 - y[i];
                dy[i] = -dy[i];
            }
        }


    }
    public void drawing(float x,float y, float r, int red, int g, int b, float vis) {
        fill(red, g, b, vis);
        ellipse(x, y, r, r);
    }


    public static void main(String... args) {
          n = Integer.parseInt(JOptionPane.showInputDialog("N: "));
        PApplet.main("Main");
    }
}
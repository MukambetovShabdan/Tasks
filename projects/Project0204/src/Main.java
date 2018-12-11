import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {

    static int n;

    float x;
    float dx =3;
    float y;
    float dy =3;
    float r =50;

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

        for (int i = 0,)fill(0,255,0);
        ellipse(x, y,r,r);
        x += dx;
        y += dy;
        if (x > width - r/2){
            x = 2 * width - x;
            dx = -dx;
        }
        if (x < 0){
            x = -x;
            dx = - dx;}
        if (y > height - r/2){
            y = 2 * height - y;
            dy = -dy;
        }
        if (y < 0){
            y = -y;
            dy = - dy;
        }




    }

    public static void main(String... args) {
        //  n = Integer.parseInt(JOptionPane.showInputDialog("N: "));
        PApplet.main("Main");
    }
}
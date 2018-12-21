import processing.core.PApplet;

import javax.swing.*;
import java.util.Scanner;

public class Main extends PApplet {

	//Scanner scan = new Scanner(System.in);
	//int num = scan.nextInt();

	float x;
	float x1 = 0;
	float y;
	float y1 = 0;
	int r = 100;
	float alpha;
	float dx = 3;
	float dy = 3;
	float centerx;
	float centery;

	public void settings() {
		fullScreen();
	}

	public void setup() {

		frameRate(100);
	}


	public void draw() {
		background(0);
		pushMatrix();

		x = width / 2;
		y = height / 2;
		translate(x, y);
		x += dx;
		y += dy;
		rotate(alpha);
		alpha += 0.03;
		fill(255, 255, 0);

		centerx = 0;
		centery = 0;
		rectMode(CENTER);
		rect(centerx, centery, r, r);


		centerx += dx;
		//centery += dy;


        /*if (x1 > width - r){
            x1 = width - r;
            dx = - dx;
        }
        if (x1 < 0){
            x1 = 0;
            dx = -dx;
        }
        if (y1 > height - r){
            y1 = height - r;
            dy = - dy;
        }
        if (y1 < 0){
            y1 = 0;
            dy = -dy;
        }*/


		popMatrix();

	}

	public static void main(String... args) {
		PApplet.main("Main");
	}
}
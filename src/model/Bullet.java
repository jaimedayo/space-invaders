package model;

import processing.core.PApplet;

public class Bullet extends Character{

	public Bullet(int posX, int posY, PApplet app) {
		super(posX, posY, app);
		// TODO Auto-generated constructor stub
	}
public void movebullet() {
	posY= posY-3;
}
public void draw() {
	app.fill(200);
	app.ellipse((posX*50)+30, posY, 20, 20);
	
}
}

package model;

import processing.core.PApplet;

public class Prota extends Character {

	public Prota(int posX, int posY, PApplet app) {
		super(posX, posY, app);
		// TODO Auto-generated constructor stub
	}
public void draw() {
	app.rectMode(app.CENTER);
	app.fill(0,0,200);
	app.rect((posX*50)+25, (posY*50)+25, 30, 30);
}
}

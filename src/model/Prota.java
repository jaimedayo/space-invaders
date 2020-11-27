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
	app.rect(posX, posY, 30, 30);
}
}

package model;

import processing.core.PApplet;

public class Enemy extends Character {

	public Enemy(int posX, int posY, PApplet app) {
		super(posX, posY, app);
		// TODO Auto-generated constructor stub
	}
	public void draw() {
		app.rectMode(app.CENTER);
		app.fill(200,0,0);
		app.rect(posX, posY, 30, 30);
	}
}

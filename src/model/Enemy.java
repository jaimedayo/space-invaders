package model;

import java.util.concurrent.Delayed;

import processing.core.PApplet;

public class Enemy extends Character {

	public Enemy(int posX, int posY, PApplet app) {
		super(posX, posY, app);
		// TODO Auto-generated constructor stub
	}
	public void draw() {
		app.rectMode(app.CENTER);
		app.fill(200,0,0);
		app.rect((posX*50)-25, (posY*50)-25, 30, 30);
	}
	public void run() {
	
		
	}
	public void move(int dir) {
		app.delay(20);
		super.move(dir);
	}
}

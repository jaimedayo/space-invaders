package model;

import processing.core.PApplet;

public class Bullet extends Character{

	public Bullet(int posX, int posY, PApplet app) {
		super(posX, posY, app);
		// TODO Auto-generated constructor stub
	}
public void movebullet() {
	posY--;
}
}

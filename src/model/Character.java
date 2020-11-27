package model;
import processing.core.PApplet;

abstract class Character{
public int posX;
public int posY;
protected PApplet app;

public Character(int posX,int posY, PApplet app) {
	this.posX = posX;
	this.posY = posY;
	this.app=app;
}
public void move(int dir) {
	switch (dir) {
	case 0:
		posX++;
		break;

case 1:
	posX--;
		break;
case 2:
	posY++;
	break;
	}
}

}
package controller;

import java.util.ArrayList;
import processing.core.PApplet;
import model.Logic;
import model.Prota;
import model.Bullet;
import model.Enemy;

public class Controller {
Logic logic;
	PApplet app;
	public Controller(PApplet app) {
		this.app=app;
		this.logic= new Logic(app);
	}
	public void start() {
		logic.startGame();
	}
	public void moveProta(int i) {
		logic.moveProta(i);
		
	}
	public void shot(int posX,int posY) {
		logic.addBullet(posX, posY);
		
	}
public Prota getProta() {
	return logic.getProta();
}
public ArrayList<Enemy> getEnemies() {
	return logic.getEnemyList();
}
public ArrayList<Bullet> getBllets() {
	return logic.getBulletList();
	
}
public void erazeBullet(int i) {
	logic.removeBullet(i);
	
}
public void erazeEnemy(int i) {
	logic.removeEnemy(i);
	
}

}

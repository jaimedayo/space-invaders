package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {
	private PApplet app;
	
	private ArrayList<Enemy> enemyList;
	private ArrayList<Bullet> bulletList;
	private Prota prota;
	
	
	public Logic(PApplet app) {
		this.app=app;
		
		enemyList = new ArrayList<Enemy>();
		bulletList = new ArrayList<Bullet>();
		
		
	}
	public void startGame() {
		addEnemy();
		prota= new Prota(4, 6, app);
	}
	public void addBullet(int posX,int posY) {
		Bullet e= new Bullet(posX, posY, app);
		bulletList.add(e);
	} 
	public void addEnemy() {
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 3; j++) {
			Enemy e= new Enemy(i, j, app);
				enemyList.add(e);
			}
		}
		
	}
	public void prota(int posX, int posY) {
		
	}
	public void moveEney() {
		//dar la orden a todo el arreglo de que se mueva
	}
	public void moveProta(int i){
		switch (i) {
		case 0:
			prota.move(0);
			break;
case 1:
	prota.move(1);
			break;
		}
	}
	public ArrayList<Enemy> getEnemyList() {
		return enemyList;
	}public Prota getProta() {
		return prota;
	}
	
}

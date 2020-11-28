package view;

import controller.Controller;
import model.Bullet;
import model.Enemy;
import model.Prota;
import processing.core.PApplet;

import java.util.Collections;

public class Main extends PApplet {
	Controller control;
	
	int t;
	int cont;
	int [][] matrix; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
public void settings() {
	
size(300,350);
}
public void setup() {
	control= new Controller(this);
	
	int cont=0;
	t=0;
	 matrix  = new int [][]{
	    	{2,2,2,2,2,2,2,2,2},
			{0,0,0,0,0,0,0,3,2},
			{3,1,1,1,1,1,1,1,2},
			{0,0,0,0,0,0,0,3,2},
			{3,1,1,1,1,1,1,1,2},
			{0,0,0,0,0,0,0,3,2},
			{3,1,1,1,1,1,1,1,2},
			{0,0,0,0,0,0,0,0,2}};
			
			control.start();
}
public void draw() {
	
	background(0);
	
	
	
	for (int i = 0; i < control.getEnemies().size(); i++) {
		Enemy enemies = control.getEnemies().get(i);
		enemies.draw();
	}
	control.getProta().draw();
	for (int i = 0; i < control.getEnemies().size(); i++) {
		Enemy enemies = control.getEnemies().get(i);
		enemies.draw();
	}
	
	for (int i = 0; i < control.getBllets().size(); i++) {
		Bullet ball = control.getBllets().get(i);
		ball.draw();
	}
	
	for (int i = 0; i < control.getBllets().size(); i++) {
		control.getBllets().get(i).movebullet();
	}
// medidor de coliciones entre balas y enemigos
/*	for (int i = 0; i < control.getBllets().size(); i++) {
		for (int j = 0; j < control.getEnemies().size(); j++) {
			float d=  dist((control.getBllets().get(i).getPosX()), (control.getBllets().get(i).getPosY()),
					(control.getEnemies().get(j).getPosX()),( control.getEnemies().get(j).getPosY()));
			if(d<50) {
			control.erazeEnemy(j);
			rect(100, 100, 100, 100);
		}
		}
	}*/
	
	control.contact();
		//movimiento de los enemigos segun el mapa
	for (int i = 0; i < control.getEnemies().size(); i++) {
		delay(30);
		if(matrix[control.getEnemies().get(i).posY][control.getEnemies().get(i).posX]==3) {
			;control.getEnemies().get(i).move(2);
			
		}if(matrix[control.getEnemies().get(i).posY][control.getEnemies().get(i).posX]==1) {
			control.getEnemies().get(i).move(1);
			
		}
		if(matrix[control.getEnemies().get(i).posY][control.getEnemies().get(i).posX]==0) {
			control.getEnemies().get(i).move(0);
			
		}
		}
	//limpieza de los objetos que se salen de la pantalla
			for (int i = 0; i < control.getBllets().size(); i++) {
		if(control.getBllets().get(i).getPosY()<10)
			control.erazeBullet(i);
	}
	for (int i = 0; i < control.getEnemies().size(); i++) {
		if(control.getEnemies().get(i).getPosY()>6&&control.getEnemies().get(i).getPosX()>5)
			control.erazeEnemy(i);
		
	}}

public void keyPressed() {
	switch (keyCode) {
	case RIGHT:
		control.moveProta(0);
		break;
		case LEFT:
			control.moveProta(1);
		break;
		case UP:
			control.shot(control.getProta().getPosX(),320);
	break;
	}
}
}
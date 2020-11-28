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
	drawObjects();
	moveObjects();

// medidor de coliciones entre balas y enemigos
	if(control.getBllets()==null) {
		
	}else {
	for (int i = 0; i < control.getBllets().size(); i++) {
		float d;
		for (int j = 0; j < control.getEnemies().size(); j++) {
			if(control.getBllets().size()>=1) {
				
			d =  dist((control.getBllets().get(i).getPosX()), (control.getBllets().get(i).getPosY()),
					(control.getEnemies().get(j).getPosX()),( control.getEnemies().get(j).getPosY()*50)-25);
			}else { d=100;}
			if(d<30) {
				
				control.erazeEnemy(j);
				control.erazeBullet(i);
				
				
			}
		}
	}
	}
	CleanArrays();
}

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
public void CleanArrays() {
	//limpieza de los objetos que se salen de la pantalla
	for (int i = 0; i < control.getBllets().size(); i++) {
if(control.getBllets().get(i).getPosY()<10)
	control.erazeBullet(i);
}
for (int i = 0; i < control.getEnemies().size(); i++) {
if(control.getEnemies().get(i).getPosY()>6&&control.getEnemies().get(i).getPosX()>5)
	control.erazeEnemy(i);

}
}

public void drawObjects() {
	//dibujar enemigos
	for (int i = 0; i < control.getEnemies().size(); i++) {
		Enemy enemies = control.getEnemies().get(i);
		enemies.draw();
	}
	//dbujar protagonista
	control.getProta().draw();
	for (int i = 0; i < control.getEnemies().size(); i++) {
		Enemy enemies = control.getEnemies().get(i);
		enemies.draw();
	}
	//dibujar balas
	for (int i = 0; i < control.getBllets().size(); i++) {
		Bullet ball = control.getBllets().get(i);
		ball.draw();
	}
}
public void moveObjects(){//movimiento de las balas
for (int i = 0; i < control.getBllets().size(); i++) {
	control.getBllets().get(i).movebullet();
}

	//movimiento de los enemigos segun el mapa
for (int i = 0; i < control.getEnemies().size(); i++) {
	
	if(matrix[control.getEnemies().get(i).posY][control.getEnemies().get(i).posX]==3) {
		;control.getEnemies().get(i).move(2);
		
	}if(matrix[control.getEnemies().get(i).posY][control.getEnemies().get(i).posX]==1) {
		control.getEnemies().get(i).move(1);
		
	}
	if(matrix[control.getEnemies().get(i).posY][control.getEnemies().get(i).posX]==0) {
		control.getEnemies().get(i).move(0);
		
	}
	}
}
}
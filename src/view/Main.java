package view;

import controller.Controller;
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
		if(matrix[control.getEnemies().get(i).posY][control.getEnemies().get(i).posX]==3) {
			delay(50);control.getEnemies().get(i).move(2);
			
		}
		if(matrix[control.getEnemies().get(i).posY][control.getEnemies().get(i).posX]==0) {
			delay(50);control.getEnemies().get(i).move(0);
			
		}
		if(matrix[control.getEnemies().get(i).posY][control.getEnemies().get(i).posX]==1) {
			delay(50);control.getEnemies().get(i).move(1);
			
		}
		
		
	}
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
			control.shot(control.getProta().getPosX(), 6);
	break;
	}
}
}
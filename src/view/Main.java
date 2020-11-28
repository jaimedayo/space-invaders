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
			{2,0,0,0,0,0,0,0,2},
			{2,1,1,1,1,1,1,1,2},
			{2,0,0,0,0,0,0,0,2},
			{2,1,1,1,1,1,1,1,2},
			{2,0,0,0,0,0,0,0,0},
			{2,1,1,1,1,1,1,1,2},
			{2,2,2,2,2,2,2,2,2}};
			
			control.start();
}
public void draw() {
	
	background(0);
	/*
	if(t<=second()) {
		t=(second())+1;
		//sona para dar la orden del movimiento
	}*/
	
	for (int i = 0; i < control.getEnemies().size(); i++) {
		Enemy enemies = control.getEnemies().get(i);
		enemies.draw();
	}
	control.getProta().draw();
	
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
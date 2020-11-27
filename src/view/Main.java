package view;

import controller.Controller;
import processing.core.PApplet;

import java.util.Collections;

public class Main extends PApplet {

	int [][] matrix; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
public void settings() {
	
size(300,350);
}
public void setup() {
	 matrix  = new int [][]{
	    	{2,2,2,2,2,2,2,2,2},
			{2,0,0,0,0,0,0,0,2},
			{2,1,1,1,1,1,1,1,2},
			{2,0,0,0,0,0,0,0,2},
			{2,1,1,1,1,1,1,1,2},
			{2,0,0,0,0,0,0,0,0},
			{2,1,1,1,1,1,1,1,2},
			{2,2,2,2,2,2,2,2,2}};
			
}
public void draw() {
	background(0);
}
public void keyPressed() {
	
}
}
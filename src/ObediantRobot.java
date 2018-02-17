import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
import org.omg.CORBA.PUBLIC_MEMBER;


public class ObediantRobot {
	static Robot r2d2= new Robot();
public static void main(String[] args) {
	r2d2.penDown();
	r2d2.setPenColor(Color.red);
	r2d2.setSpeed(1000);
String shape=	JOptionPane.showInputDialog("What shape do you want?");
	if(shape.equals("square")) {
		drawSquare();}
	if(shape.equals("triangle")) {
		drawTriangle();}
	if(shape.equals("circle")) {
		drawCircle();
	}
	}

	
	public static void drawSquare() {
		for(int i=0; i<4; i++) {
			r2d2.move(100);
			r2d2.turn(360/4);
	}
	}
	public static void drawTriangle() {
		for (int i=0; i<3; i++) {
			r2d2.move(100);
			r2d2.turn(360/3);
		}
			}
	public static void drawCircle() {
		for (int i=0; i<360;i++){
		r2d2.move(1);
		r2d2.turn(360/360);
	}
	}

}


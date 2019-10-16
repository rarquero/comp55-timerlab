import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

import acm.graphics.*;
import acm.program.*;

public class BallLauncher extends GraphicsProgram implements ActionListener{
	public static final int SIZE = 25;
	public static final int TIME_TO_WAKE = 50;
	public static final int MOVE_EVERY = 2;
	private ArrayList<GOval> balls;
	Timer time = new Timer(1000, this);
	
	public void run() {
		balls = new ArrayList<GOval>();
		addMouseListeners();
		time.setInitialDelay(TIME_TO_WAKE);
		time.setDelay(MOVE_EVERY);
		time.start();
	}
	
	public void mousePressed(MouseEvent e) {
		GOval ball = makeBall(SIZE/2, e.getY());
		add(ball);
		balls.add(ball);
	}
	
	public GOval makeBall(double x, double y) {
		GOval temp = new GOval(x-SIZE/2, y-SIZE/2, SIZE, SIZE);
		temp.setColor(Color.RED);
		temp.setFilled(true);
		return temp;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		for (GOval i: balls) {
			i.move(5, 0);
		}
		
	}
}

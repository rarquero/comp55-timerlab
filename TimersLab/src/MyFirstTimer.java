import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class MyFirstTimer extends GraphicsProgram implements ActionListener {
	public static final int MAX_STEPS = 20;
	private GLabel myLabel;
	Timer t = new Timer(1000, this);
	
	private int numTimes;
	
	public void run(){
		myLabel = new GLabel("# of times called?", 0, 100);
		numTimes = 0;
		add(myLabel);
		t.setInitialDelay(3000);
		t.start();
	}
	
	public void actionPerformed(ActionEvent e) {
		numTimes +=1;
		myLabel.move(5, 0);
		myLabel.setLabel("times called? " + numTimes);
		if (numTimes == 20)
			t.stop();
	}
}




/* RobotFace.java
 * -----------------
 * This program creates a robot face using graphics objects.
 */
import acm.program.*;
import java.awt.*;
import acm.graphics.*;

public class RobotFace extends GraphicsProgram {
	
	private static final int HEAD_WIDTH = 300;				// constants of robot face
	private static final int HEAD_HEIGHT = 450;
	private static final int EYE_RADIUS = 40;
	private static final int MOUTH_WIDTH = 225;
	private static final int MOUTH_HEIGHT = 80;
	
	public void run() {										// adds robot face
		
		addFace();
		
	}
	
	
	
	private void addFace() {								// lists methods needed for robot face
		addHead();
		addMouth();
		addLEye();
		addREye();
	}
	
	private void addHead() {								// adds robot head
		int x = getWidth()/2;
		int y = getHeight()/2;
			GRect head = new GRect(x, y, HEAD_WIDTH, HEAD_HEIGHT);
			head.setFilled(true);	
			head.setFillColor(Color.GRAY);
				add(head);
	}
	
	private void addMouth() {								// adds robot mouth
		int x = getWidth()/2;
		int y = getHeight()/2;
			GRect mouth = new GRect((x + ((HEAD_WIDTH - MOUTH_WIDTH))/2), (y + (HEAD_HEIGHT * .75) - (MOUTH_HEIGHT / 2)), MOUTH_WIDTH, MOUTH_HEIGHT);
			mouth.setFilled(true); 	
			mouth.setColor(Color.WHITE);
			 	add(mouth);
	}
	
	private void addLEye() {								// adds robot's left eye
		int x = getWidth()/2;
		int y = getHeight()/2;
			GOval lEye = new GOval((x + HEAD_WIDTH / 4 - EYE_RADIUS), (y + HEAD_HEIGHT / 4 - EYE_RADIUS) , EYE_RADIUS * 2, EYE_RADIUS * 2);
			lEye.setFilled(true);
			lEye.setColor(Color.YELLOW);
			add(lEye);
	}
	
	private void addREye() {								// adds robot's right eye
		int x = getWidth()/2;
		int y = getHeight()/2;
			GOval rEye = new GOval ((x + HEAD_WIDTH * .75 - EYE_RADIUS), (y + HEAD_HEIGHT / 4 - EYE_RADIUS), EYE_RADIUS * 2, EYE_RADIUS * 2);
			rEye.setFilled(true);
			rEye.setColor(Color.YELLOW);
			add(rEye);
	}
	

	
	
	
}

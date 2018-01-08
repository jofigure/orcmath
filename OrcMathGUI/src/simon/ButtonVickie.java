package simon;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class ButtonVickie extends Button implements ButtonInterfaceJoanna{

	private ButtonInterfaceJoanna[] b;
	private SimonScreenJoanna j;
	

	public ButtonVickie(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, "", null);
		// TODO Auto-generated constructor stub
		 j = new SimonScreenJoanna(h, h);
	}

	@Override
	public void setColor(Color color) {
		b=j.getAButton();
		b.setBackground(color);
		
	}

	@Override
	public void highlight() {
		b = j.getButtons();
		if()
		((Graphics2D) b[1]).setBackground(Color.white);
	}

	@Override
	public void dim() {
		//make gray
		b = j.getButtons();
		b.setBackground(Color.white);
	}

	// not in b-interface
	public void drawButton(Graphics2D g, boolean hover){
		g.setColor(Color.RED);
	    g.drawOval(50,50,20,20);
	}
	
}

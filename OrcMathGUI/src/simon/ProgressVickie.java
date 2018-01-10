package simon;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Component;
import guiTeacher.components.TextLabel;

public class ProgressVickie extends Component implements ProgressInterfaceJoanna{

	private TextLabel text;
	private int seq;
	private int round;
	private boolean gameOver;
	
	public ProgressVickie(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gameOver() {
	  gameOver = true;
	  update();
		
	}

	@Override
	public void setRound(int roundNumber) {
		this.round = roundNumber;
		update();
	}

	@Override
	public void setSequenceSize(int size) {
		this.seq = size;
		update();
		
	}

	@Override
	public void update(Graphics2D g) {
		clear();
		if(gameOver) {
			g.setColor(Color.black);
			g.drawString("Round: "+round,10,55);
			g.drawString("You lose",5,150);
		}else {
			g.setColor(Color.black);
			g.drawString("Round: "+round,5,30);
		}
	}

	@Override
	public void setText(String string) {
		// TODO Auto-generated method stub
		
	}

}
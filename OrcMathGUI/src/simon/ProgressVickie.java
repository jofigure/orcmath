package simon;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Component;
import guiTeacher.components.TextLabel;

public class ProgressVickie extends Component implements ProgressInterfaceJoanna{


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
			g.setColor(Color.black);
		if(!gameOver) {
			g.drawString("Length "+(round+2), 5,10);
			g.drawString("Round: "+round,5,30);

		}else {
			g.drawString("Round: "+round,10,55);
			g.drawString("Highest score:" + round,5,70);
		}
	}

}
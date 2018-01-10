package simon;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class ButtonVickie extends Button implements ButtonInterfaceJoanna{

	private boolean highlight;
	private Color color;
	

	public ButtonVickie(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, "", null);
		highlight = false;
		update();
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void setColor(Color color) {
		this.color = color;
		update();
		
	}

	@Override
	public void highlight() {
		highlight = true;
		update();
	}

	@Override
	public void dim() {
		
		highlight = false;
		update();
	}

	// not in b-interface
	public void drawButton(Graphics2D g, boolean hover) {
		
		if(highlight){
			g.setColor(color.gray);
			g.fillRect(0, 0, getWidth(), getHeight());
		}else{
			g.setColor(color);
			g.fillRect(0, 0, getWidth(), getHeight());
		}
	}
}

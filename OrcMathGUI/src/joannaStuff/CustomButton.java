package joannaStuff;

import java.awt.*;
import java.awt.image.BufferedImage;

import guiTeacher.components.*;
import guiTeacher.components.Button;



public  class CustomButton extends Button implements CustomLabel{

	  private CustomButton button;
	
	public CustomButton(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, text, action);
	}


	public void drawButton(Graphics2D g, boolean hover) {
		g.setColor(getForeground());
		g.drawString("Text goes here", 50, 100);
	}

	@Override
	public void updateString1(String string) {
		
	}

	@Override
	public void updateString2(String string) {
		
	}

	@Override
	public void setIconColor(Color color) {
		// TODO Auto-generated method stub
		
	}

	


	
}

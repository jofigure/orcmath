package janTest;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Timer;


import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class TestScreen extends FullFunctionScreen {

	private Button win;
	private Button lose;
	private TextLabel text;

	public TestScreen(int width, int height) {
		super(width, height);

	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		text = new TextLabel(200, 100, 100, 100, "Click on one");
		win = new Button(300, 250, 100, 50, "WIN", new Action() {

			@Override
			public void act() {
				text.setText("YOU WIN!");
				lose.setEnabled(false);
				win.setEnabled(false);
			}
		});
		
		lose = new Button(100, 250, 100, 50, "LOSE", new Action() {

			@Override
			public void act() {
				text.setText("YOU LOSE!");
				win.setEnabled(false);
				lose.setEnabled(false);


			}
		});
		
		viewObjects.add(win);
		viewObjects.add(lose);
		viewObjects.add(text);


	}




}
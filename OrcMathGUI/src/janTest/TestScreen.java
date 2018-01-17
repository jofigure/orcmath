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

	private Button go;
	private int delay;
	private Timer timer;
	private TextArea box;
	public TestScreen(int width, int height) {
		super(width, height);
		delay = 3;
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		go = new Button(100, 100, 100, 50, "GO", new Action() {

			@Override
			public void act() {
				setBackground(Color.pink);
				startTimer();


			}
		});
		box = new TextArea(300, 250, 100, 100, "text goes here");
		viewObjects.add(go);
		viewObjects.add(box);


	}




	public void startTimer() {
		
			javax.swing.Timer timer = new javax.swing.Timer(1000, new ActionListener() { 

				public void actionPerformed(ActionEvent arg0) {
					box.setText(""+delay);
					delay--;
				}
			});
			timer.setRepeats(false);
			while(delay>0) {
			timer.start();
			delay--;
		}
	}
	
}
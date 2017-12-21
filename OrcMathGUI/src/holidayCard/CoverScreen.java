package holidayCard;

import java.awt.*;
import java.util.List;

import guiTeacher.components.*;
import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CoverScreen extends FullFunctionScreen {

	private Button next;
	private TextArea text;
	
	public CoverScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		 next.setButtonOutline(true);
		text = new TextArea(100, 100, 500, 500, "JUST WANTED TO WISH YOU.... ");
		text.setBaseFont(new Font("Times Roman",Font.PLAIN,20));
		next = new Button(650, 500, 100, 50, "NEXT", new Action() {
			
			@Override
			public void act() {
				CardMakerGUI.card.setScreen(CardMakerGUI.inside);
			}
		});
		 cover.setBackground(Color.black);
		 
		viewObjects.add(next);
		viewObjects.add(text);
	}

}

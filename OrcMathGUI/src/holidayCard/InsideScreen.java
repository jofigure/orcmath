package holidayCard;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class InsideScreen extends FullFunctionScreen {

	public Button back;
	
	public InsideScreen(int width, int height) {
		super(width, height);
	}


	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		 back.setButtonOutline(true);
		back= new Button(650, 500, 100, 50, "BACK", new Action() {

			@Override
			public void act() {
				CardMakerGUI.card.setScreen(CardMakerGUI.cover);
			}
		});

		viewObjects.add(back);

	}

}

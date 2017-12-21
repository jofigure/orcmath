package holidayCard;

import guiTeacher.GUIApplication;
import guiTeacher.userInterfaces.Screen;
import myStuff.CatalogMakerGUI;
import myStuff.CatalogScreen;

public class CardMakerGUI extends GUIApplication {

	public static CardMakerGUI card;
	public static CoverScreen cover;
	public static InsideScreen inside;
	
	
	
	public CardMakerGUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	public static void main(String[] args) {
		card= new CardMakerGUI(800, 600);
		Thread go = new Thread(card);
		go.start();
	}

	@Override
	public void initScreen() {
		cover = new CoverScreen(getWidth(), getHeight());
		inside = new InsideScreen(getWidth(), getHeight());
		setScreen(cover);
		
	}

}

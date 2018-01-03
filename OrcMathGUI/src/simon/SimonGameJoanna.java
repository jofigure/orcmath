package simon;

import guiPlayer.CatalogMakerGUI;
import guiPlayer.CatalogScreen;
import guiTeacher.GUIApplication;

public class SimonGameJoanna extends GUIApplication {

	public SimonGameJoanna(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		SimonScreenJoanna screen = new SimonScreenJoanna(getWidth(), getHeight());
		setScreen(screen);
	}

	public static void main(String[] args) {
		SimonGameJoanna game = new SimonGameJoanna(800, 550);
		Thread runner = new Thread(game);
		runner.start();
	}

}

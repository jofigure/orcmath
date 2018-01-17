package janTest;

import guiTeacher.GUIApplication;

public class TestGui extends GUIApplication {

	public TestGui(int width, int height) {
		super(width, height);
		setVisible(true);	}

	@Override
	public void initScreen() {
		TestScreen screen = new TestScreen(getWidth(), getHeight());
		setScreen(screen);
	}

	public static void main(String[] args) {
		TestGui game = new TestGui(500, 500);
		Thread runner = new Thread(game);
		runner.start();
	}

}

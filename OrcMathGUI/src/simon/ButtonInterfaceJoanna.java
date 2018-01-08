package simon;

import java.awt.Color;

import guiTeacher.components.Action;
import guiTeacher.interfaces.Clickable;

public interface ButtonInterfaceJoanna extends Clickable {

	void setColor(Color color);
	
	void highlight();
	void dim();

	
}

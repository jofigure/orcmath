package simon;

import java.awt.Color;

import guiTeacher.components.Action;
import guiTeacher.interfaces.Clickable;

public interface ButtonInterfaceJoanna extends Clickable {

	void setColor(Color black);
	
	void highlight();
	void dim();

	
}

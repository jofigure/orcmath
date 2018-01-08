package simon;

import guiTeacher.interfaces.Visible;

public interface ProgressInterfaceJoanna extends Visible {

	void gameOver();

	void setRound(int roundNumber);

	void setSequenceSize(int size);

}
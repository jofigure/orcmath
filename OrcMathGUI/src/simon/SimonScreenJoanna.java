package simon;

import java.awt.Color;
import java.util.*;
import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenJoanna extends ClickableScreen implements Runnable {

	private TextLabel label;
	private ButtonInterfaceJoanna[] buttons;
	private ProgressInterfaceJoanna progress;
	private ArrayList<MoveInterfaceJoanna> sequence;
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;
	
	
	public SimonScreenJoanna(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		addButtons();
		for(ButtonInterfaceJoanna b: buttons){ 
		    viewObjects.add(b); 
		}
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		sequence = new ArrayList<MoveInterfaceJoanna>();
		//add 2 moves to start
		lastSelectedButton = -1;
		sequence.add(randomMove());
		sequence.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
	}

	private MoveInterfaceJoanna randomMove() {
		int bIndex = (int)(Math.random()*buttons.length);
		while(bIndex == lastSelectedButton) {
			bIndex = (int)(Math.random()*buttons.length);
		}
		return getMove(bIndex);
		
	}
	/**
	Placeholder until partner finishes implementation of MoveInterface
	*/
	private MoveInterfaceJoanna getMove(int bIndex) {
		return null;
	}

	/**
	Placeholder until partner finishes implementation of ProgressInterface
	*/
	private ProgressInterfaceJoanna getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addButtons() {
		int numberOfButtons = 5;
		buttons = new ButtonInterfaceJoanna[5];
		Color[] colors = {Color.black,Color.blue,Color.GREEN,Color.pink,Color.red};
		for(int i =0; i< numberOfButtons; i++) {
			ButtonInterfaceJoanna b = getAButton();
			buttons[i] = b;
			b.setColor(Color.black);
			b.setX(20);
			b.setY(50);
			b.setAction(new Action() {
				
				@Override
				public void act() {
					if(acceptingInput) {
						Thread blink = new Thread(new Runnable() {

							@Override
							public void run() {
								b.highlight();
								try {
								Thread.sleep(800);
								} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								}
								b.dim();
							}
							
						});
						blink.start();
					}
					if(b == sequence.get(sequenceIndex).getButton()) {
						
					}
				}
			});
		}

		
		
	}

	/**
	Placeholder until partner finishes implementation of ButtonInterface
	*/
	private ButtonInterfaceJoanna getAButton() {
	return null;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}

package myStuff;

import java.util.List;

import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen {

	private TextField nameField;
	private TextField colorField;
	private TextField eatenField;
	private TextField typeField;
	private TextField priceField;
	private Button add;
	
	public CatalogScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		nameField = new TextField(40,40,200,30,"Text goes here","Name of Dessert");
		colorField = new TextField(40,100,200,30,"Text goes here","Color of Dessert");
		eatenField = new TextField(40,200,200,30,"true/false goes here","Is dessert avaiable?");
		typeField = new TextField(40,300,200,30,"Text goes here","Type of Dessert");
		priceField = new TextField(40,400,200,30,"Integer goes here","Price of Dessert");
		
		viewObjects.add(nameField);
		viewObjects.add(colorField);
		viewObjects.add(eatenField);
		viewObjects.add(typeField);
		viewObjects.add(priceField);
		
		add = new Button(40, 450, 100, 50, "ADD",new Action() {
			
			@Override
			public void act() {
			  nameField.setText("You clicked the button.");
			}
		} );
		viewObjects.add(add);
	}

}
.

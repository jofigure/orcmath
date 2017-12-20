package myStuff;

import java.util.List;

import guiPlayer.CatalogueMaker;
import guiPlayer.Desserts;
import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen {

	private TextField nameField;
	private TextField colorField;
	private TextField numField;
	private TextField typeField;
	private TextField priceField;
	private Button add;
	private CatalogueMaker catalogue;
	private TextArea textarea;

	public CatalogScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		catalogue = new CatalogueMaker();
		nameField = new TextField(40,40,200,30,"Text goes here","Name of Dessert");
		colorField = new TextField(40,100,200,30,"Text goes here","Color of Dessert");
		numField = new TextField(40,200,200,30,"Quantity goes here","Is dessert avaiable?");
		numField.setInputType(TextField.INPUT_TYPE_NUMERIC);
		typeField = new TextField(40,300,200,30,"Text goes here","Type of Dessert");
		priceField = new TextField(40,400,200,30,"Integer goes here","Price of Dessert");
		priceField.setInputType(TextField.INPUT_TYPE_NUMERIC);
		textarea = new TextArea(600,350, 500, 500, "This is a box of text.");

		viewObjects.add(nameField);
		viewObjects.add(colorField);
		viewObjects.add(numField);
		viewObjects.add(typeField);
		viewObjects.add(priceField);
		viewObjects.add(textarea);

		add = new Button(40, 450, 100, 50, "ADD",new Action() {

			@Override
			public void act() {
				addButtonClicked();
			}
		} );
		viewObjects.add(add);
	}

	protected void addButtonClicked() {
		Desserts d = new Desserts(colorField.getText(),numField.parseInt(),typeField.getText(),nameField.getText(),priceField.parseInt());
		String s = textarea.getText() + d + "\n";
		textarea.setText(s);
		catalogue.addNewItem(d);
		nameField.setText("");
		colorField.setText("");
		numField.setText("");
		typeField.setText("");
		priceField.setText("");
		



	}

}


package guiPlayer;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class Desserts extends Component {

	private String color;
	private int num;
	private String type;
	private String name;
	private int price;
	
	public Desserts(String color, int num, String type, String name, int price) {
		super(40, 40, 265, 35);
		this.color = color;
		this.num = num;
		this.type = type;
		this.name = name;
		this.price = price; 
		update();
		
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		
	}

	public String toString() {
		return color + "," + num + "," + type +"," + name + "," + price;
		
	}
}

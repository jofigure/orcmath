package guiPlayer;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class Desserts extends Component {

	private String color;
	private boolean eaten;
	private String type;
	private String name;
	private int price;
	
	public Desserts(String color, boolean eaten, String type, String name, int price) {
		super(40, 40, 265, 35);
		this.color = color;
		this.eaten = eaten;
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
		return color + "," + eaten + "," + type +"," + name + "," + price;
		
	}
}

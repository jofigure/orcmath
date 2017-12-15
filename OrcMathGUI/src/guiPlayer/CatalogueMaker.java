package guiPlayer;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class CatalogueMaker {
	
	private ArrayList<Desserts> list;
	
	public CatalogueMaker() {
		list = new ArrayList <Desserts>();
		list.add(new Desserts("white",false,"Cake","Vanilla Lava",5));
	}

	public static void main(String[] args) {
		CatalogueMaker temp = new CatalogueMaker();
		System.out.println(temp.getCSVContent());
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the color of the dessert:");
		String color = in.nextLine();
		System.out.println("Enter if the dessert is eaten or not (boolean):");
		addNewItem();
		
	}
	
	public String getCSVContent() {
		String data = "color, eaten, type, name,price\n";
		for(Desserts d: list) {
			data+= d+  "\n";
		}
		return data;

	}
	
	public void addNewItem(String color, boolean eaten, String type, String name, int price) {
		list.add(new Desserts(color,eaten,type, name,price));
		System.out.println("Item added successfully");
		
	}
}

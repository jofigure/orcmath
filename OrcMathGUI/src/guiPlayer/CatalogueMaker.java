package guiPlayer;

import java.util.ArrayList;
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
		
	}
	
	public String getCSVContent() {
		String data = "color, eaten, type, name,price\n";
		for(Desserts d: list) {
			data+= d+  "\n";
		}
		return data;

	}
}

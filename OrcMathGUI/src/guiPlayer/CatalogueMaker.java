package guiPlayer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes.Name;



public class CatalogueMaker {

	private ArrayList<Desserts> list;

	public CatalogueMaker() {
		list = new ArrayList <Desserts>();
		list.add(new Desserts("white",false,"Cake","Vanilla Lava",5));
	}

	public void setList(ArrayList<Desserts> list) {
		this.list = list;
	}

	public ArrayList<Desserts> getList() {
		return list;
	}

	public static void main(String[] args) {
		CatalogueMaker temp = new CatalogueMaker();
		System.out.println(temp.getCSVContent());
		Scanner in = new Scanner(System.in);
		System.out.println("Do you wish to load ");
		String input = in.nextLine();
		if(input.equals("yes")) 
		{

		}
		System.out.println("Do you wish to save");
		String input = in.nextLine();
		if(input.equals("yes")) 
		{
			System.out.println("Enter the color of the dessert:");
			String color = in.nextLine();
			System.out.println("Enter if the dessert is eaten or not (boolean):");
			testSaveContent("save.csv", temp.getList());
		}

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


	public void testSaveContent(String fileName,ArrayList<Desserts> list) {

		try{    
			FileWriter fw=new FileWriter(fileName);  
			String temp = "";
			for(Desserts a: list) {
				temp += a.toString() + "\n"; 
			}
			fw.write(temp);    
			fw.close();    
			System.out.println("Success! File \""+fileName+"\" saved!");
		}catch(IOException e){
			System.out.println("An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");
		}
	}

	public List<String> testFileLoading() {

		Scanner in = new Scanner(System.in);

		String fileName = "";

		List<String> content = new ArrayList<String>();

		//use this boolean to control the while loop. The user should have multiple chances to enter a correct filename

		boolean opened = false;

		while(!opened){

			try {

				System.out.println("Enter a file to open");
				fileName = in.nextLine();
				FileReader fileReader = new FileReader(new File(fileName));
				String line = "";

				//a BufferedReader enables us to read teh file one line at a time
				BufferedReader br = new BufferedReader(fileReader);
				while ((line = br.readLine()) != null) {
					String[] par =line.split(",");
					list.add(new Desserts(par[0],Boolean.parseBoolean(par[1]),par[2], par[3],Integer.parseInt(par[4])));
					content.add(line);

					/*

					 * useful later:

					 * split only a comma that has an even number of quotes ahead of it

 String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);

					 */

				}
				br.close();
				opened = true;
			}catch (IOException e) {
				System.out.println("The file name you specified does not exist.");
			}

		}
		//close the Scanner
		in.close();
		return content;
	}

}

package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{	
	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
		printColours();
	}
	
	public void draw()
	{			
	}

	//load colours into ArrayList
	public void loadColours() {
        Table table = loadTable("colours.csv", "header");

        for (TableRow row : table.rows()) {
            Colour colour = new Colour(row);
            colours.add(colour);
        }
	}

	//load resistors into ArrayList
	public void loadResistors() {
        Table table = loadTable("resistors.csv", "header");

        for (TableRow row : table.rows()) {
            Resistor resistor = new Resistor(row);
            resistor.add(resistor);
        }
	}



	public void printColours() {
        for (Colour colour: colour) {
            System.out.println(colour);
        }
	}
	
	//input integer number, gives back colour associated
	public Colour findColor(int value)
	{
		//TODO
	}

	private ArrayList<Colour> colour = new ArrayList<Colour>();
	private ArrayList<Resistor> resistor = new ArrayList<Resistor>();
}

package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{	
	//declare variables
	public int border;
	public int x;
	public int y;
	public int x1;
	public int y1;
	public int color;

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
		background(245);

		//drawing of lines and rects of transistors
		//100 px gap
		border = 100;
		

		


	}

	//load colours into ArrayList
	public void loadColours() {
        Table table = loadTable("colours.csv", "header");

        for (TableRow row : table.rows()) {
            Colour colour = new Colour(row);
			colour.add(colour);
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

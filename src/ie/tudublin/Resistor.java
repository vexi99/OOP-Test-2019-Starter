package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Resistor extends PApplet
{

    public int one;
    public int ten;
    public int hundred;

    //public int value(int value) 
    //{
        //int hundred = (value / 100);
        //int ten = (value - (hundred * 100)) / 10;
        //int one = value - ((hundred * 100) + (ten * 10));

   // }end value

    public int ones()
    {
        return one;
    }//end ones

    public int tens()
    {
        return ten;
    }//end tens

    public int hundreds()
    {
        return hundred;
    }//end hundreds
}
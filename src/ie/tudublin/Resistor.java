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

    public int value()
    {
        int hundred = (value / 100);
        int ten = (value - (hundred * 100)) / 10;
        int one = value - ((hundreds * 100) + (tens * 10)); 
    }

    public int ones()
    {
        return one;
    }

    public int tens()
    {
        return ten;
    }

    public int hundreds()
    {
        return hundred;
    }
}
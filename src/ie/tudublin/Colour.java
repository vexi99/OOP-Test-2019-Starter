package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Colour extends PApplet
{

    public int r;
    public int g;
    public int b;
    public int value;
    private String colour;
    
    //Setter/Getters
    public void setR(int r)
    {
        this.r = r;
    }

    public int getR()
    {
        return r;
    }

    public void setG(int g)
    {
        this.g = g;
    }

    public int getG()
    {
        return g;
    }
    
    public void setB(int b)
    {
        this.b = b;
    }

    public int getB()
    {
        return b;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    private void setColour(String colour)
    {
        this.colour = colour;
    }

    private String getColour()
    {
        return colour;
    }
    
    public Colour(TableRow row)
    {
        colour = row.getString("colour");
        value = row.getInt("value");
        r = row.getInt("r");
        g = row.getInt("g");
        b = row.getInt("b");
    }

    public String toString()
    {
        return colour + "\t" + value + "\t" + r + "\t" + g + "\t" + b ;  
    }


    
}
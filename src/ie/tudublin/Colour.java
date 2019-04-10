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
    
    
    public void setR()
    {
        this.setR = r;
    }

    public int getR()
    {
        return r;
    }

    public void setG()
    {
        this.setG = g;
    }

    public int getG()
    {
        return g;
    }
    
    public void setB()
    {
        this.setB = b;
    }

    public int getB()
    {
        return b;
    }

    public void setValue()
    {
        this.setValue = value;
    }

    public int getValue()
    {
        return value;
    }

    private void setColour()
    {
        this.setColour = colour;
    }

    private String getColour()
    {
        return colour;
    }
    
    public Colour(TableRow row  )
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
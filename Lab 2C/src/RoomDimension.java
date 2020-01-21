// Donark Patel
// CSC 162-C1
// Date 5/18/2018
// Lab 2C
// RoomDimension class

import java.text.DecimalFormat;

public class RoomDimension {
    private double length;
    private double width;
    private double area;
    DecimalFormat df = new DecimalFormat("#.##");


    public RoomDimension()
    {
        length = 0.0;
        width = 0.0;
        area  = 0.0;
    }
    public RoomDimension(double userLength, double userWidth)
    {
        length = userLength;
        width = userWidth;
    }
    public void setLength(double userLength)
    {
        length = userLength;
    }
    public void setWidth(double userWidth)
    {
        width = userWidth;
    }
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    public double getArea()
    {
        area = length * width;
        return area;
    }

    public String toString() {
        return "Dimensions:"
              + "\nLength: " + length + " ft"
              + "\nWidth:  " + width + " ft"
              + "\nArea:   " + df.format(getArea()) + " Sq ft";
    }
}

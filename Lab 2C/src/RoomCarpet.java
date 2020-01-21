// Donark Patel
// CSC 162-C1
// Date 5/18/2018
// Lab 2C
// RoomCarpet class

import java.text.NumberFormat;

public class RoomCarpet
{
    RoomDimension rd = new RoomDimension();
    private double CarpetPrice;
    private double totalCost;
    private double area;
    NumberFormat nf = NumberFormat.getCurrencyInstance();

    public RoomCarpet()
    {
        CarpetPrice = 0;
        totalCost = 0;
    }
    public RoomCarpet(double userCost,double calculatedArea)
    {
        CarpetPrice = userCost;
        area = calculatedArea;
    }
    public double getTotalCost()
    {
        totalCost = area * CarpetPrice;
        return totalCost;
    }
    public String toString()
    {
        return "Carpet cost: " + nf.format(getTotalCost());
    }
}

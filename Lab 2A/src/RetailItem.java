// Donark Patel
// CSC 162-C1
// Date 5/18/2018
// Lab 2A
// This program create and display the object(Item description,Item on hand, price) using RetailItem class.

public class RetailItem {
    //Fields
    private String description;
    private int unitOnHand;
    private double price;

    public RetailItem()
    {
        description = "";
        unitOnHand = 0;
        price = 0.0;
    }


    public RetailItem(String userDescription, int userUnitOnHand, double userPrice )
    {
        description = userDescription;
        unitOnHand = userUnitOnHand;
        price = userPrice;
    }
    public void setDescription(String userDescription)
    {
        description = userDescription;
    }

    public void setUnitOnHand(int userUnitOnHand)
    {
        unitOnHand = userUnitOnHand;
    }

    public void setPrice(double userPrice)
    {
        price = userPrice;
    }

    public String getDescription()
    {
        return description;
    }

    public int getUnitOnHand()
    {
        return unitOnHand;
    }
    public double getPrice()
    {
        return price;
    }
}

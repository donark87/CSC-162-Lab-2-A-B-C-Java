// Donark Patel
// CSC 162-C1
// Date 5/18/2018
// Lab 2C
// This program will calculate price of carpeting for rectangular room.


import java.*;
import java.util.*;
public class Lab2C {
    public static void main(String [] args)
    {
        double Length,Width,carpetPrice,calculatedArea,cost;



        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the length");
        Length = kb.nextDouble();
        System.out.println("Enter the Width");
        Width = kb.nextDouble();
        System.out.println("Enter the price of the carpet");
        carpetPrice = kb.nextDouble();

        RoomDimension x = new RoomDimension(Length,Width);

        calculatedArea = x.getArea();
        RoomCarpet y = new RoomCarpet(carpetPrice,calculatedArea);


        System.out.println(x.toString());
        System.out.println(y.toString());
    }
}

// Donark Patel
// CSC 162-C1
// Date 5/18/2018
// Lab 2B
// This program calculate and display if the substance (Ethyl Alcohol, Oxygen, Water) will freeze or boil by user given temperature.

import java.util.*;
public class Lab2B {
    public static void main(String [] args)
    {
       int temp;
       Scanner kb = new Scanner(System.in);
       System.out.println("Enter temperature");
       temp = kb.nextInt();

       FreezeBoil x = new FreezeBoil(temp);

        System.out.println("Substance\t\t\tFreezing Point\t\tBoiling Point");
        System.out.println("------------------------------------------------------");
        System.out.println("Ethyl Alcohol" + "\t\t\t" + x.isEthylFreezing() + "\t\t\t\t" + x.isEthylBoiling());
        System.out.println("Oxygen       " + "\t\t\t" + x.isOxygenFreezing() + "\t\t\t\t" + x.isOxygenBoiling());
        System.out.println("Water        " + "\t\t\t" + x.isWaterFreezing() + "\t\t\t\t" + x.isWaterBoiling());

    }
}

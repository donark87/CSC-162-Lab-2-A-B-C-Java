// Donark Patel
// CSC 162-C1
// Date 5/18/2018
// Lab 2A
// This program create and display the object(Item description,Item on hand, price) using RetailItem class.

public class Lab2A {
    public static void main (String [] args){

        RetailItem it1 = new RetailItem();

        it1.setDescription("Jacket");
        it1.setUnitOnHand(12);
        it1.setPrice(59.95);

        RetailItem it2 = new RetailItem("Designer Jeans",40,34.95);

        RetailItem it3 = new RetailItem();
        it3.setDescription("Shirt");
        it3.setUnitOnHand(20);
        it3.setPrice(24.95);

        System.out.println("\t\t Description\t\tUnit on Hand\tPrice");
        System.out.println("Item #1\t\t " + it1.getDescription() +"\t\t\t\t" + it1.getUnitOnHand() +"\t" + it1.getPrice());
        System.out.println("Item #2\t\t " + it2.getDescription() +"\t\t\t" + it2.getUnitOnHand() +"\t" + it2.getPrice());
        System.out.println("Item #3\t\t " + it3.getDescription() +"\t\t\t\t" + it3.getUnitOnHand() +"\t" + it3.getPrice());


    }
}

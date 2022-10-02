/*
Bobby Guo
9/8 2022
PizzaParty
this progream calcualte the price
of pizza and show all 
other values you want

 The purpose of this program is to use values input by the user to calculate the cost
of hosting pizza parties on Friday and Saturday nights, and ultimately determines if you can afford to host both parties.  
*/

import java.util.Scanner;

public class PizzaParty
{
	public static void main(String[] args) {

        double budget; //this holds the total amount you have to spend on the weekend (we will compare this to the weekendTotal)
        int numFriends; //this holds the number of people that will join you for pizza each night
        double avgSlicePerson; //this holds the number of slices that the avg person eats and will be used to calculate the total number of slices (pies) needed
        double costPerPizza; //this holds the cost for a single pizza (whole pie; slices not available separately)
        int wholePizzas; //will hold the number of whole pizzas required based on the slices that are estimated
        double totalPizzaCost; //subtotal of cost of pizzas
        double totalTaxOwed; //uses rate below to calculate the tax owed on the total
        double total; //will hold the total owed each night including pizza, tax and delivery
        final int slicePerPizza = 8; //this is the number of slices cut from each pizza
        final double salesTax = .06; //this holds the salesTax rate used for the order (6%)
        final double deliveryFee = 4.99; //this holds the flat delivery fee applied to each order
        int totalBidpp = 0;
        double totalmommy = 0;


        Scanner scan = new Scanner(System.in);
        System.out.println("How much do you have to spend?");
        budget = scan.nextDouble();
        System.out.println("Enter the number of friends on friday:");
        numFriends = scan.nextInt();
        System.out.println("Enter the average slices eaten per person:");
        avgSlicePerson = scan.nextDouble();
        System.out.println("Enter the cost per pizza:");
        costPerPizza = scan.nextDouble();

        double slices = (numFriends+1) * avgSlicePerson; 
        double pizzas = slices/slicePerPizza; 
        wholePizzas = (int) (Math.ceil(pizzas)); 

        totalPizzaCost = wholePizzas*costPerPizza;
        totalTaxOwed = totalPizzaCost*salesTax;
        total = totalPizzaCost + totalTaxOwed + deliveryFee;

        totalBidpp = wholePizzas + totalBidpp;
        totalmommy = total + totalmommy;

        System.out.println("=============================================");

        System.out.println("Enter the number of friends on Saturday:");
        numFriends = scan.nextInt();
        System.out.println("Enter the average slices eaten per person:");
        avgSlicePerson = scan.nextDouble();
        System.out.println("Enter the cost per pizza:");
        costPerPizza = scan.nextDouble();
 

        System.out.println("=============================================");

        System.out.println("Friday Night Patry");
        System.out.println(wholePizzas + " Pizzas: " + totalPizzaCost);
        System.out.println("TotalTaxOwed: $"+((int)(totalTaxOwed*100))/100.0);
        //System.out.println(" ");
        System.out.println("Delivery: " + deliveryFee);
        System.out.printf("Total: $%.2f", total);

        System.out.println("\n=============================================");

        slices = (numFriends+1) * avgSlicePerson; 
        pizzas = slices/slicePerPizza; 
        wholePizzas = (int) (Math.ceil(pizzas)); 

        totalPizzaCost = wholePizzas*costPerPizza;
        totalTaxOwed = totalPizzaCost*salesTax;
        total = totalPizzaCost + totalTaxOwed + deliveryFee;

        System.out.println("Saturday Night Party");
        System.out.println( wholePizzas +" Pizza: " + total);
        System.out.println("Tax: "+((int)(totalTaxOwed*100))/100.0);
        System.out.println("Delivery: " + deliveryFee);
        System.out.printf("Total: $%.2f", total);
        System.out.println("");
        totalBidpp = wholePizzas + totalBidpp;
        totalmommy = total + totalmommy;

        System.out.println("Weekend Total: " + totalBidpp + " pizzas for $" + totalmommy);
        System.out.printf("Can you afford? False" );
	}
}
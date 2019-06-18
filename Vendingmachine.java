import java.util.Scanner;

/*
Program for Vending Machine.
Author: Rohit Agrawal
E-mail Address: ra2381@email.vccs.edu
Programming Assignment HW8.
Last Changed: March 24, 2018.
*/

public class Vendingmachine 
{
	public static void main (String[] args)
	{	
		// Create boolean True variable. 
		boolean sentence = true;
		do{	
			//define variables 
			int price, c = 0, quater, dime, nickel;
			System.out.println("Enter the price between 25 to 100 with multiples of 5");
			System.out.println("and I will show you the remaining change!");
			@SuppressWarnings("resource")
			Scanner keyboard = new Scanner(System.in);
			price = keyboard.nextInt(); 
			//Create integer i
			int i;
			i = price%5;
			if (price >= 25 && price <= 100 && i == 0)
			{	
				//apply logic
				c = 100-price;
				quater = c / 25;
				c = c % 25;
				dime = c / 10;
				c = c % 10;
				nickel = c / 5;
				System.out.println("You bought an item for " + price);
				System.out.println("cents and gave me a dollar,");
				System.out.println("so your change is");
				System.out.println(quater + " quaters,");
				System.out.println(dime + " dimes, and");
				System.out.println(nickel + " nickel");
				System.exit(0); //exit when, if statement is true
			}
			//otherwise continue the do-while loop
			System.out.println("Invalid number!");
			System.out.println("Enter a new valid price");
		} while (sentence);
		
 
	}
}

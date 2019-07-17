package tuesday;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("How much change (in cents) do you need? ");
		int change = sc.nextInt();
		int remainder1 = change % 25;
		int remainder2 = remainder1 % 10;
		int remainder3 = remainder2 % 5;
		int quarters = change / 25;
		int dimes = remainder1 / 10;
		int nickels = remainder2 / 5;
		
			if(change >= 25 && change % 25 == 0)
			{
				System.out.println("quarters: " + quarters);
			}
			else if(change >= 25 && remainder1 >= 10 && change % 10 == 0)
			{
				System.out.println("quarters: " + quarters);
				System.out.println("dimes: " + dimes);
			}
			else if(change >= 25 && remainder2 >= 5 && change % 5 == 0)
			{
				System.out.println("quarters: " + quarters);
				System.out.println("dimes: " + dimes);
				System.out.println("nickels: " + nickels);
			}
			else if(change >= 25 && remainder2 >= 5 && remainder2 < 10 && change % 5 == 0)
			{
				System.out.println("quarters: " + quarters);
				System.out.println("dimes: " + dimes);
				System.out.println("nickels: " + nickels);
			}
			else if(change >= 25 && remainder2 >= 5 && remainder3 < 5)
			{
				System.out.println("quarters: " + quarters);
				System.out.println("dimes: " + dimes);
				System.out.println("nickels: " + nickels);
				System.out.println("pennies: " + remainder3);
			}
			else if(change >= 25 && remainder2 >= 10 && remainder3 < 5)
			{
				System.out.println("quarters: " + quarters);
				System.out.println("dimes: " + dimes);
				System.out.println("nickels: " + nickels);
				System.out.println("pennies: " + remainder3);
			}
			else if(change >= 25 && remainder2 % 10 == 0)
			{
				System.out.println("quarters: " + quarters);
				System.out.println("dimes: " + dimes);
				System.out.println("nickels: " + nickels);
				System.out.println("pennies: " + remainder3);
			}
			else if(change >= 25 && remainder2 < 10 && remainder3 == 5)
			{
				System.out.println("quarters: " + quarters);
				System.out.println("dimes: " + dimes);
				System.out.println("nickels: " + nickels);
				System.out.println("pennies: " + remainder3);
			}
			else if(change >= 25 && remainder2 < 10 && remainder3 < 5)
			{
				System.out.println("quarters: " + quarters);
				System.out.println("dimes: " + dimes);
				System.out.println("nickels: " + nickels);
				System.out.println("pennies: " + remainder3);
			}
			else if(change >= 25 && remainder2 < 10 && remainder3 == 5)
			{
				System.out.println("quarters: " + quarters);
				System.out.println("dimes: " + dimes);
				System.out.println("nickels: " + nickels);
				System.out.println("pennies: " + remainder3);
			}
			else if(change >= 25 && remainder2 >= 10 && remainder3 < 5)
			{
				System.out.println("quarters: " + quarters);
				System.out.println("dimes: " + dimes);
				System.out.println("nickels: " + nickels);
				System.out.println("pennies: " + remainder3);
			}
			else if(change >= 25 && remainder2 >= 5 && remainder3 < 5)
			{
				System.out.println("quarters: " + quarters);
				System.out.println("dimes: " + dimes);
				System.out.println("nickels: " + nickels);
				System.out.println("pennies: " + remainder3);
			}
			else if(change >= 25 && remainder2 >= 10 && remainder3 < 5)
			{
				System.out.println("quarters: " + quarters);
				System.out.println("dimes: " + dimes);
				System.out.println("nickels: " + nickels);
				System.out.println("pennies: " + remainder3);
			}
//			else if(change >= 25 && remainder2 >= 10 && remainder3 < 5)
//			{
//				System.out.println("quarters: " + quarters);
//				System.out.println("dimes: " + dimes);
//				//System.out.println("nickels: " + nickels);
//				System.out.println("pennies: " + remainder3);
//			}
			else if(change >= 25 && remainder2 >= 10 && remainder3 > 5)
			{
				System.out.println("quarters: " + quarters);
				System.out.println("dimes: " + dimes);
				System.out.println("nickels: " + nickels);
				System.out.println("pennies: " + remainder3);
			}
			else if(change >= 25 && remainder2 >= 10 && remainder3 == 5)
			{
				System.out.println("quarters: " + quarters);
				System.out.println("dimes: " + dimes);
				System.out.println("nickels: " + nickels);
				System.out.println("pennies: " + remainder3);
			}
			else if(change >= 10 && change % 10 == 0)
			{
				System.out.println("dimes: " + dimes);
			}
			else if(change >= 10 && remainder2 >= 5 && change % 5 == 0)
			{
				System.out.println("dimes: " + dimes);
				System.out.println("nickels: " + nickels);
			}
			else if(change >= 10 && remainder2 >= 5 && remainder3 < 5)
			{
				System.out.println("dimes: " + dimes);
				System.out.println("nickels: " + nickels);
				System.out.println("pennies: " + remainder3);
			}
			else if(change >= 10 && remainder3 < 5)
			{
				System.out.println("dimes: " + dimes);
				System.out.println("nickels: " + nickels);
				System.out.println("pennies: " + remainder3);
			}
			else if(change >= 10 && remainder2 >= 5 && remainder3 < 5)
			{
				System.out.println("dimes: " + dimes);
				System.out.println("nickels: " + nickels);
				System.out.println("pennies: " + remainder3);
			}
			else if(change >= 5 && change % 5 == 0)
			{
				System.out.println("nickels: " + nickels);
			}
			else if(change >= 5 && remainder3 > 0)
			{
				System.out.println("nickels: " + nickels);
				System.out.println("pennies: " + remainder3);
			}
			else if(change < 5 && change > 0)
			{
				System.out.println("pennies: " + remainder3);
			}
	}
}


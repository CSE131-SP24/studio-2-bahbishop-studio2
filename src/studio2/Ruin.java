package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("How much money are you starting with?");
		double startAmount = in.nextDouble();
		double money = startAmount;
		System.out.println("What is the win probability?");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit?");
		double winLimit = in.nextDouble();

		System.out.println("How many days are you playing?");
		int totalSimulations = in.nextInt();

		int count = 0;
		while (count <= totalSimulations)
		{money = startAmount;
		int rounds = 0;

		while (0 < money && money < winLimit) 
		{rounds += 1;
		
		double vegas = Math.random();
		if (vegas < winChance)
		{
			money += 1;
		}

		else
		{
			money -= 1;
		}
		}
		count += 1;
		System.out.print("Simulation " + count + ": " + rounds);
		if (money == 0)
			{
			System.out.println(" booooooooo");
			}
		else
			{
			System.out.println(" VEGAS, BABY!!!");
			}
	}


		System.out.print("Ruin Rate from Simulation: ");
		System.out.println("Expected Ruin Rate:");

		if (winChance == 0.5)
			{ double expectedRuin = 1 - (startAmount / winLimit);
			
			}
			}
	}

	





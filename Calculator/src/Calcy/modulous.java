package Calcy;

import java.util.Scanner;

public class modulous {


		Scanner in = new Scanner(System.in);
		public void mod() {
			System.out.println("Enter first no.");
			double a = in.nextDouble();
			System.out.println("Enter second no.");
			double b = in.nextDouble();
			double c = a % b;
			System.out.println("Modulous of two no. = "+c);
		}
	}


package Calcy;

import java.util.Scanner;

public class add {


		Scanner in = new Scanner(System.in);
		public void add() {
			System.out.println("Enter first no.");
			double a = in.nextDouble();
			System.out.println("Enter second no.");
			double b = in.nextDouble();
			double c = a + b;
			System.out.println("Addition of two no. = "+c);
		}
	}


package Calcy;

import java.util.Scanner;

public class div {


		Scanner in = new Scanner(System.in);
		public void div() {
			System.out.println("Enter first no.");
			double a = in.nextDouble();
			System.out.println("Enter second no.");
			double b = in.nextDouble();
			double c = a / b;
			System.out.println("Division of two no. = "+c);
		}
	}


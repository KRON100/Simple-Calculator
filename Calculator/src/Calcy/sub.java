package Calcy;

import java.util.Scanner;

public class sub {


		Scanner in = new Scanner(System.in);
		public void sub() {
			System.out.println("Enter first no.");
			double a = in.nextDouble();
			System.out.println("Enter second no.");
			double b = in.nextDouble();
			double c = a - b;
			System.out.println("Substraction of two no. = "+c);
		}
	}


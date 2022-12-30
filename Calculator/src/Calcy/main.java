package Calcy;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("Select an operator + - * / %");
		String op = in.next();
		switch(op) {
			case "+":
				add jn = new add();
			    jn.add();
		        break;
			case "-":
				sub kn = new sub();
				kn.sub();
				break;
			case "*":
				mul ln = new mul();
				ln.mul();
				break;
			case "/":
				div mn = new div();
				mn.div();
				break;
			case "%":
				modulous nn = new modulous();
				nn.mod();
				break;
		}
	}

}

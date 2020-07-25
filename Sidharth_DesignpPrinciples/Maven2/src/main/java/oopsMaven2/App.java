package oopsMaven2;
import oopsMaven2.Calculator;

import java.util.*;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean a = true;
		while(a) {
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		System.out.println("Select required operation: ");
		System.out.println("Operations to be performed are are:");
		System.out.println("1.ADDITION");
		System.out.println("2.SUBTRACT");
		System.out.println("3.MULTIPLICATION");
		System.out.println("4.DIVISION");
		char c = sc.next().charAt(0);
		double res = 0;
		char s;
			Calculator cal = new Calculator();
			switch(c) {
				case '1':
					res = cal.add(num1,num2);
					System.out.println("Sum = " +res);
					break;
				case '2':
				    res = cal.subtract(num1,num2);
					System.out.println("Difference = " +res);
					break;
				case '3':
				    res = cal.multiply(num1,num2);
					System.out.println("Product = " +res);
					break;
				case '4':
				    res = cal.divide(num1,num2);
					System.out.println("Division = " +res);
					break;
				default:
					System.out.println("Enter vaild number");
					break;
					
			}
			System.out.println("Do you want to perform any other operation(Y/N)");
					s = sc.next().charAt(0);
					if(s == 'Y' || s == 'y') {
						a = true;
					} else {
						a = false;
						System.out.println("Thankyou for using calculator");
						sc.close();
						System.exit(0);
					}}
		}
	}



package Java_Package1;

import java.util.Scanner;
//Using Scanner Class
public class Add2Numbers {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = scnr.nextInt();
		System.out.println("Enter the value of b: ");
		int b = scnr.nextInt();
		int sum = a+b;
		System.out.println("The Sum of the two numbers is " + sum);
	}
}


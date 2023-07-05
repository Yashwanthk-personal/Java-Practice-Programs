package Java_Package1;

import java.util.Scanner;

public class sumOfTheSquaresOfTheNumber {//sum of squares of a given number

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int a=sc.nextInt();
		int sum=0;
		
		while(a>0)
		{
			sum=sum+(a%10)*(a%10);
			a=a/10;
		}
		System.out.println( sum + " is the sum of the squares of given number");
	}
}

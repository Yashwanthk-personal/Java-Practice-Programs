package Java_Package1;

import java.util.Scanner;

public class firstAndLastDigit {// first and last digit of a given number

	public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Please enter the number: ");
		      int number = sc.nextInt();
		      int first = 0;
		      int last = number%10;
		      for(int i=0;number>0;i++) {
		    	  if(number>0 && number<9) {
		    		  first = number;
		    	  }
		    	  number = number/10;
		      }
		      System.out.println("the first digit of the given number is " + first);
		  	  System.out.println("the last digit of the given number is " + last);
	}
}

//Scanner sc = new Scanner(System.in); 		
//
//System.out.println("enter the number");
//	int a=sc.nextInt();
//	int first=0;
//	int last=a/10;
//	
//	for(int i=0; a>0; i++)
//	{
//		if(a>0 && a<=9)//checking for a single digit(between 1-9, any number is first number)
//		{
//			first=a;
//		}
//		a=a/10;
//	}
//	System.out.println("the first digit of the given number is " + first);
//	System.out.println("the last digit of the given number is " + last);
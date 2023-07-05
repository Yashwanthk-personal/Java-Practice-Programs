package Java_Package1;

import java.util.Scanner;

public class multiplesOfaNumber {//WAPTD the first 10 multiples of given number

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Given number: ");
		int number = sc.nextInt();
		int count = 1;
		int i=1;
		int prod=0;
		while(count<=10) {
			if(count<10) {
			    prod = number * i;
				System.out.print(prod + ", ");
			}
			else if(count==10) {
				prod = number*i;
				System.out.print(prod + ".");
			}
			i++;
			count++;
		}
	}
}

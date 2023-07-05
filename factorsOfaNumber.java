package Java_Package1;

import java.util.Scanner;
//WAPTP first 10 Factors of a given number
public class factorsOfaNumber {//numbers which divides the given number completely - Factors
	public static void main(String[] args) {
		
		Scanner scannerInput = new Scanner(System.in);
		System.out.println("Enter the Given number");
		int a = scannerInput.nextInt();
		int count = 1;
		for (int i = 1; i <= a; i++) {
			if(count<=10) { //Printing the first 10 factors
			 if(a%i==0) {
				System.out.println(i);
				count++;
			  }
		    }
	    }
   }	
}




//Scanner sc = new Scanner(System.in);
//System.out.println("Enter the number; ");
//int a = sc.nextInt();
//int count = 1;
//for (int i = 1; count <= 10; i++) {
//	if(a%i == 0) {
//		System.out.println(i);
//		count++;
//	}
//}
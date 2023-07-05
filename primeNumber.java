package Java_Package1;

public class primeNumber {//to check whether the number is prime number or not 

	public static void main(String[] args) {
		isPrime(18);
	}
	//a whole number greater than 1 that cannot be exactly divided by any whole number 
	//other than itself and 1 
	public static void isPrime(int num)
	{
		boolean flag=true;
		for(int i=2;i<=num/2;i++)//checking the divisiblity till the num/2 not neccessary to check till num-1
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("the number is a prime number");
		else
			System.out.println("the number is not a prime number");
	}
}

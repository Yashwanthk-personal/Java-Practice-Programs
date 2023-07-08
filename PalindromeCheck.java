package String_Manipulation_Programs;

public class PalindromeCheck {

	public static void main(String[] args) {
		String str = "MALAYALAM";
		String rvrsdStr = reversePalindrome(str);
		System.out.println("Reversed String of given String: "+str+" - is: "+rvrsdStr);	
	}
	
	public static String reversePalindrome(String str) {
		//If we don't use toString() - reversedStr - of StringBuilder Type, can't compare with String		
		String reversedStr = new StringBuilder(str).reverse().toString();
				
				if(str.contentEquals(reversedStr)) {
					System.out.println("Given String is a Palindrome");
				}
				else {
					System.out.println("Given String is not a palindrome");
				}
	return reversedStr;
	}
}

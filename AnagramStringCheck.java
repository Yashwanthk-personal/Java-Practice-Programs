package String_Manipulation_Programs;

import java.util.Arrays;

//Same Quantity of same characters with irrespective of order - Anagram String
public class AnagramStringCheck {

	public static void main(String[] args) {

		String string1 = "silent";
		String string2 = "listen";
		boolean result = checkAnagram(string1, string2);
		System.out.println("Is the given strings are Anagram? T/F - "+result);
	}
	
	public static boolean checkAnagram(String string1, String string2) {
		
		if(string1.length()!=string2.length()) {
			return false;
		}
		
		char[] char1 = string1.toCharArray();
		char[] char2 = string2.toCharArray();
		
		Arrays.sort(char1);
		System.out.println(char1);
		Arrays.sort(char2);
		System.out.println(char2);

		return Arrays.equals(char1, char2);
	}

}
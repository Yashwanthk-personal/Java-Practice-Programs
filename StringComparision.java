package String_Manipulation_Programs;

public class StringComparision {

	public static void main(String[] args) {

		String str1 = "Compare";
		String str2 = "COMPARE";
		if(str1.equals(str2)) {
			System.out.println("Two Strings are equal");
		}
		else {
			System.out.println("Two String are not equal by Case Sensitive");
			if(str1.equalsIgnoreCase(str2)) {
				System.out.println("Strings are equals by ignoring Case");
			}
			else {
				System.out.println("Strings are not at all Equal");
			}
		}
	}

}

package String_Manipulation_Programs;

public class ReverseString {

	public static void main(String[] args) {

		String str = "palindrome";
		String rvrsStr = " ";
		for(int i=str.length()-1;i>=0;i--) {
			rvrsStr = rvrsStr + str.charAt(i);
		}
		System.out.println("reversed String: "+rvrsStr);
	}

}

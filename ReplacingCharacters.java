package String_Manipulation_Programs;

public class ReplacingCharacters {

	public static void main(String[] args) {

		String str = "Yeshwanth";
		char target = 'e';
		char replacement = 'a';
		String StrNew = str.replace(target, replacement);
		System.out.println(str);
		System.out.println(StrNew);
	}

}

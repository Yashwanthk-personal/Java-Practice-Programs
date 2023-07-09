package String_Manipulation_Programs;

public class RemoveExtraSpacesInString {

	public static void main(String[] args) {

		String str = " My name  is   Yashwanth,    I am not working as of    now ";
		String cleanStr = removeExtraSpaces(str);
		System.out.println("Clean String after extra spaces removed: "+cleanStr);
	}
	
	public static String removeExtraSpaces(String str) {
		String string = str.trim().replaceAll("\\s+", " ");
		return string;
	}

}

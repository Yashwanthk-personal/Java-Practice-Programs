package String_Manipulation_Programs;

public class CountingOccurence {

	public static void main(String[] args) {

		String str = "Yaszhwanthz";
		char target = 'z';
	    int countRes = occurenceCount(str, target);
		System.out.println(target+" found at an index: "+ str.indexOf('z', 0));
		System.out.println("Occurence of "+target+": "+countRes);
	}
	
	public static int occurenceCount(String str,char target) {
		int count = 0;
		for(char c: str.toCharArray()) {
			if(c == target) {
				count++;
			}
		}
		return count;
	}

}

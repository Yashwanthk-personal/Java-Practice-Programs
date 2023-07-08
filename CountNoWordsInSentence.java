package String_Manipulation_Programs;

public class CountNoWordsInSentence {

	public static void main(String[] args) {

		String sentence = "My name is yashwanth, working as a Test Engineer";
		int wordsCount = countWordsInSentence(sentence);
		System.out.println(wordsCount);
	}
	
	public static int countWordsInSentence(String sentence) {
		
		String[] cleanSentence = sentence.split("\\s+");
		
		int count = cleanSentence.length;
		return count;
	}

}

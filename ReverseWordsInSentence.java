package String_Manipulation_Programs;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String sentence = "Hello, World! My Name is Yashwanth ";
        String reversed = reverseWords(sentence);
        System.out.println(reversed);
    }
//split("\\s+") will split the string into string of array with separator as space or 
//multiple spaces. \s+ is a regular expression for one or more spaces.    
    private static String reverseWords(String sentence) {
    	String[] words = sentence.split("\\s+");
//to append the new Strings we used StringBuilder
        StringBuilder reversedWords = new StringBuilder();
        
        for(int i=words.length-1;i>0;i--) {
        	reversedWords.append(words[i]).append(" ");
        }
        return reversedWords.toString().trim();
    }
}


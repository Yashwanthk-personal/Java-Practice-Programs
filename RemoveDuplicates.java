package String_Manipulation_Programs;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String result = removeDuplicates(input);
        System.out.println(result);
    }
    //IndexOf(char x) method. This method returns the zero-based index of the first 
 //occurrence of the specified character within the string. In case no such character
 //is found then it returns -1.
    //method converts different types of values into string - valueOf()
    private static String removeDuplicates(String input) {
        StringBuilder sb = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
//Retrieving the each char of Input string a/c index
            char current = input.charAt(i);
//Need to convert current - to String Type -> String.valueOf(current)
//Finding the Index of Current in Sb string -> sb.indexOf(), WKT sb - empty string
// -1 returned if given char is not present, Then add that char into sb, if same char repeats
//in next iteration then it will give the existing same char's index in sb. Duplicates char we are
//not appending to sb.
            if (sb.indexOf(String.valueOf(current)) == -1) {
                sb.append(current);
                
            }
        }
        return sb.toString();
    }
}


package String_Manipulation_Programs;

import java.util.ArrayList;
import java.util.List;

public class SplitStringIntoEqualParts {

	public static void main(String[] args) {
         String str = "abcdefghijklmnopqrstuvwxyz";
         int parts = 7;
         
         List<String> splitString = splitStringIntoParts(str,parts);
         System.out.println(splitString);
	}
	
	public static List<String> splitStringIntoParts(String str,int parts){
		List<String> result = new ArrayList<>();
		
		int length = str.length();
        	int partLength = length/parts;
        	int remainingChar = length % parts;
        	int startIndex = 0;
        
        for(int i=0;i<parts;i++) {
        	int currentPartLength = partLength + (remainingChar>0?1:0);
        	String part = str.substring(startIndex, startIndex+currentPartLength);
        	result.add(part);
        	
        	startIndex+=currentPartLength;
        	remainingChar--;        	
        }
        return result;
	}

}

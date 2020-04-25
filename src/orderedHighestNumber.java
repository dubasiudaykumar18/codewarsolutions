/**
 * Your task is to make a function that can take any non-negative integer as a argument and 
 * return it with its digits in descending order. Essentially, rearrange 
 * the digits to create the highest possible number.

Examples:
Input: 21445 Output: 54421

Input: 145263 Output: 654321

Input: 123456789 Output: 987654321 
 * **/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class orderedHighestNumber {

	 public static int sortDesc(final int num) {
	        List<String> numAsList = new ArrayList<>();
	        for (int i = 0; i < String.valueOf(num).length(); i++) {
	            numAsList.add(i, String.valueOf(num).substring(i, i + 1));
	        }
	        Collections.sort(numAsList, Collections.reverseOrder());
	        String numAsString = "";
	        for (String digit : numAsList) {
	            numAsString = numAsString.concat(digit);
	        }
	        return Integer.parseInt(numAsString);
	    }
	
}

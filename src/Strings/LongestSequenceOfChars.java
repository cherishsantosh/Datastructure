package Strings;

import java.util.Scanner;

public class LongestSequenceOfChars {
	public static void main(String[] args) {
		LongestSequenceOfChars ls =new LongestSequenceOfChars();
		Scanner sc = new Scanner(System.in);
		String B ="ajvaa";
		String kk= ls.longestSequenceOfChar(B);
		System.out.println("STRing is "+ kk);
	}
	public String longestSequenceOfChar(String str) {
	    String result = "";

	    for (int i = 0; i < str.length(); i++) {
	        int j = i;
	        while(j < str.length() && str.charAt(j) == str.charAt(i)) {
	            j++;
	        }

	        // If this one is longer than previous, then asign it to result.
	        if(j - i > result.length()) {
	            result = str.substring(i, j);
	        }
	    }
	    return result;
	}

}

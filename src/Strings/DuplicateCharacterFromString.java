package Strings;

import java.util.Scanner;
/* Find duplicate characters in string. */
/*
1) readIndex scan elements from left to write.
2) At any instant of time all the elements before writeIndex are unique.
3) We initialize readIndex and writeIndex with zero and start traversing the array.
4) For any element A at index i, we scan remaining elements of array from index i+1 to N-1. If we found one more A then we skip A at index i, otherwise A is unique and we copy it in out unique element list(inputArray[writeIndex]).
5) At the end of traversal, we will get all unique elements between index 0 to writeIndex.

*/
public class DuplicateCharacterFromString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter String: ");
	    String str = s.nextLine();
	    String newstring = null;
	    int cnt = 0;
	    char[] inp = str.toCharArray();
	    System.out.println("Duplicate Characters are:");
	    
	    for (int i = 0; i < str.length(); i++) {
		     for (int j = i + 1; j < str.length(); j++) {
			      if (inp[i] == inp[j]) {
			       System.out.println(inp[j]);
			       cnt++;
			      // newstring+=newstring+inp[i];
			       
			       break;
			      }
			      
		     }
		     //System.out.println("New string :: "+newstring);
	    }
	    
	}
}

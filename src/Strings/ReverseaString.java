package Strings;

import java.util.Scanner;

public class ReverseaString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String ");
	    String string1 = sc.nextLine();
	    
	    char[] array = string1.toCharArray();
	    for (int i=array.length-1; i>=0 ; i-- ) {
	    	System.out.print(array[i]);
	    }
	}
}

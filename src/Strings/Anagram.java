package Strings;

import java.util.Arrays;

/* Check whether two strings are anagram of each other */
public class Anagram {
	public static void main(String[] args) {
		String A="java";
		String B ="ajvaa";
		System.out.println(checkAnagram(A, B));
		System.out.println(checkAnagramArray(A, B));
	}
	
	/* METHOD 1: Anagram Program In Java Using Iterative Method*/
	public static boolean checkAnagram(String a, String b) {
		char [] staring1 = a.toCharArray();
		StringBuffer sb= new StringBuffer(b);
		for(char c: staring1) {
			int index = sb.indexOf(String.valueOf(c));
			if(index!=-1) {
				sb.deleteCharAt(index);
			}else {
				return false;
			}
		}
		return sb.length()==0;
	}
	/* METHOD 2: Anagram Program In Java Using sort() and equals() Methods */
	public static boolean checkAnagramArray(String a, String b) {
		char [] staring1 = a.toCharArray();
		char [] staring2 = b.toCharArray();
		
		Arrays.sort(staring1);
        Arrays.sort(staring2);
        
        String sc1 = new String(staring1);
        String sc2 = new String(staring2);
        
        return sc1.equals(sc2);
		}
}

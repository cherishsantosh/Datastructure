package Recursion;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp,sum=0,r;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any number:");
		n = s.nextInt();
		
		temp=n;    
		 while(n>0)    
		{    
		 r=n%10;    
		 sum=(sum*10)+r;    
		 n=n/10; 
		 System.out.print(">>>>"+n);
		}    
		
		 if(temp==sum)    
			 System.out.print("Number is Palindrome.");    
		 else    
			 System.out.print("Number is not Palindrome.");   
	}

}

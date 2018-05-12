package Recursion;

import java.util.Scanner;
/*
 * 1) Get the number from user how many element want to show.
 * 2) pass number to fibonacci() function.
 * 3) if number > 0
 * 4) n3= n1+n2,   n1=n2,  n2= n3; 
 * 5) call recursively  fibonacci(number-1)
 * 
 * */
public class Fibonacci {
	static int  n1=0, n2=1, n3;    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;  
		System.out.print("Enter the number of elements: ");
	    n = sc.nextInt();
	    System.out.print("Fibonacci Series is :: "+ n1 +", "+n2);
	    calculateFibonacci(n-2);
	}
	private static void calculateFibonacci(int n) {
	    if(n>0){    
	         n3 = n1 + n2; 
	         n1 = n2;    
	         n2 = n3;   
	         System.out.print(", "+n3);
	         calculateFibonacci(n-1);    
	    }    
	}
}

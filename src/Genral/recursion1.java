package Genral;

import java.util.Scanner;

public class recursion1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("Enter Array Size : ");
	    size = sc.nextInt();
	    int kk = myrec(size);
	    System.out.print("Final output::"+kk);
	}
	
	public static int myrec(int number) {
		
		if(number<0)  
			return(-1);
		if(number==0) 
			return 1;
		return(number * myrec(number-1));
	}
}

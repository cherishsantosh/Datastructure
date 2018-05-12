package Array;

import java.util.Scanner;
/*
 * 
 * 
 * 
 * Method 1 : Checking the difference of every possible pair of elements.
 * 
1) Let inputArray be an integer array of size N and we want to find a pairs having difference of K.
2) In this method, we will check the difference of every pair of elements in array.
3) Outer loop will fix one element(let it be X) and inner for loop will check X's difference with every other element. If the difference is equal to K then print current pair.
4) Time Complexity : O(n2)

*/
public class FindPairsOfNumbersWhoseDifferenceIsK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputArray[] = new int[15];
		int countArray[] = new int[15];
		int i, j, diff,size, temp;  
		System.out.print("Enter Array Size : ");
	    size = sc.nextInt();
	    
	    System.out.print("Enter difference : ");
	    diff = sc.nextInt();
	    
		System.out.println("Enter array element.");
		for(i=0; i<size; i++) {
			inputArray[i] = sc.nextInt();
		}
		
		for(i=0;i<size-1;i++) {
			for(j=i+1;j<size-1;j++) {
				System.out.println("<<<<< "+(inputArray[i]-inputArray[j]));
				if((inputArray[i]-inputArray[j])==(-diff) || (inputArray[i]-inputArray[j])==(diff)) {
					System.out.println("Elements pair are >> ("+inputArray[i]+", "+inputArray[j]+")");
				}
			}
		}
	}
}

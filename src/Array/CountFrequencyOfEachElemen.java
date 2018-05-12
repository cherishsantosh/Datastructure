package Array;

import java.util.Scanner;
/* Find Frequency of Each Element of Array 
 * 
	1) Declare two array Inputarray and countArray of same size.
	2) If countArray[i] == -1, it means we have not counted frequency of inputArray[i] yet and If countArray[i] == 0, it means we have already counted frequency of inputArray[i]
	3) Initialize each element of countArray to -1.
	4) Using a for loop, we will traverse inputArray from 0 to N-1. and count the frequency of every of every element.
	5) If countArray[i] == -1 for current element inputArray[i], then we store the frequency in countArray otherwise we don't store as frequency for this element is already calculated.
*/
public class CountFrequencyOfEachElemen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputArray[] = new int[10];
		int countArray[] = new int[10];
		int i, j, count,size;  
		System.out.print("Enter (number) Array Size : ");
	    size = sc.nextInt();
	    
		System.out.println("Enter array element.");
		for(i=0; i<size; i++) {
			inputArray[i] = sc.nextInt();
			countArray[i] = -1;
		}
		
		 for(i = 0; i < size; i++) {  
		        count = 1;  
		        for(j = i+1; j < size; j++) {  
		            if(inputArray[i]==inputArray[j]) {
		                countArray[j] = 0;    
		                count++;
		            }  
		        }  
		        if(countArray[i]!=0) {  
		            countArray[i] = count;  
		        }  
		    }
			for(i = 0; i<size; i++) {  
		        if(countArray[i] != 0) {  
		        	System.out.print("\nEnter :: "+ inputArray[i] +" Count :: " + countArray[i]);
		        }  
		    }  
	   }
	}

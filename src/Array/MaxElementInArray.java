package Array;
import java.util.Scanner;

/*  Find maximum element of array */

/*
Algorithm :

1) First of all, take N numbers as input from user and store it in an array(lets call it inputArray).
2) We will declare variable maxElement and maxElementPosition and initialize it with first element of inputArray and 0 respectively.
3) We will start traversing inputArray from index 0 to N -1 and compare each element with maxElement. If maxElement is less than current element, we will update maxElement and maxElementPosition with current element and current position respectively.
4) At any instant of time suppose we are at index i, then maxElement will give the maximum element between array index 0 to i.
 * 
 */
public class MaxElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		int size,i, maxElement, maxElementPosition, minElement, minElementPosition;
		System.out.print("Enter Array Size : ");
	    size = sc.nextInt();
	    
		System.out.println("Enter array element.");
		for(i=0; i<size; i++) {
			array[i] = sc.nextInt();
		}
		maxElement = minElement = array[0];
		maxElementPosition = minElementPosition = 0 ;
	    for(i = 1; i < size-1; i++){
	        if(array[i] > maxElement) {
	        	System.out.println(array[i] + "<----->" +maxElement);
	        	maxElement = array[i];
	        	maxElementPosition = i;
	        }
	        else if(array[i] < minElement) {
	        	System.out.println(array[i] + "<>" +minElement);
	        	minElement = array[i];
	        	minElementPosition = i;
	        }
	        	
	    }
	     
	    System.out.println("Max element in array : "+maxElement+" Position of element : "+maxElementPosition);
	    System.out.println("Mim element in array : "+minElement+" Position of element : "+minElementPosition);
	}
	
}

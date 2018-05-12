package Array;
import java.util.Scanner;

/* Find sum of all array elements*/
/*
 * Algorithm
	NOTE :: Let inputArray is an integer array having N elements.
	
	1) Declare an integer variable 'sum' and initialize it to 0. We will use 'sum' variable to store sum of elements of array.
	2) Using for loop, we will traverse inputArray from array from index 0 to N-1.
	3) For any index i (0<= i <= N-1), add the value of element at index i to sum.
	4) sum = sum + inputArray[i];
	5) After termination of for loop, sum will contain the sum of all array elements.
 * */
public class SumOfAllArrayElement {
	public static void main(String[] args) {
		
		/* Variable declaration */
		Scanner sc = new Scanner(System.in);
		int size,i, sum=0;
		int array[] = new int[50];
		
		/* Reading input*/
		System.out.print("Enter Array Size : ");
	    size = sc.nextInt();
		System.out.println("Enter array element.");
		for(i=0; i<size; i++) {
			array[i] = sc.nextInt();
		}
		/* Sum of all element*/
		for(i=0; i<size; i++) {
			sum = sum + array[i];
		}
		System.out.println("Sum of array element  :: "+sum);
	}
}

package Array;

import java.util.Scanner;

public class SortAnArrayInIncreasingOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		int size,i,temp,j;
		System.out.print("Enter Array Size : ");
	    size = sc.nextInt();
	    
		System.out.println("Enter array element.");
		for(i=0; i<size; i++) {
			array[i] = sc.nextInt();
		}
		
		for(i=0;i<size-1;i++) {
			for(j=i;j<size-1;j++) {
				if(array[j] > array[j+1]) {
		             /* Swap inputArray[j] and inputArray[j+1] */
		                temp = array[j];
		                array[j] = array[j+1];
		                array[j+1] = temp;
		            } 
			}
		}
		
		for(i = 0; i<size; i++) { 
			System.out.println(">>>>"+array[i]);
		}
	}
}

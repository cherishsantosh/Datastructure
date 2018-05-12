package Array;

import java.util.Scanner;
/* Find unique elements of an unsorted array */
public class UniqueElementsInUnsortedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		int size,i,j;
		
		System.out.print("Enter Array Size : ");
	    size = sc.nextInt();
	    
		System.out.println("Enter array element.");
		for(i=0; i<size; i++) {
			array[i] = sc.nextInt();
		}
		
		for(i = 0; i < size; i++) {
			  for (j=0; j<i; j++){
			      if (array[i] == array[j])
			       break;
			       }
			      
			     if (i == j){
			      /* No duplicate element found between index 0 to i */
			    	 System.out.println("List are "+ array[i]);
			  }
			 }
	}
}

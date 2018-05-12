package Array;

import java.util.Scanner;

/*  Insert an Element in Array */

/*
 * NOTE : array of length N, which contains M(M<N) elements and S is the element that we want to insert at index I
Algorithm :

1) Move all elements between index I to M-1 to next index(including index I and M-1).
2) Move inputArray[j] to inputArray[j + 1], I <= j <= M-1.
3) Insert S at inputArray[I].
4) Now, inputArray contains M+1 elements from index 0 to M.
 * 
 */

public class InsertAnElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size,i, element, index;
		int array[] = new int[50];
		
		System.out.print("Enter Array Size::");
	    size = sc.nextInt();
	    System.out.println("Enter array element::");
		for(i=0; i<size; i++) {
			array[i] = sc.nextInt();
		}
		
	    System.out.print("Enter index where you want to insert an element::");
	    index = sc.nextInt();
	    System.out.print("Enter number to be inserted::");
	    element = sc.nextInt();
		
		/* Move all elements right of index to left by one position */
	    System.out.print("SIZE :: "+size+" INDEX ::"+index);
	    for(i = size; i > index; i--){
	    	array[i] = array[i-1];
	    	System.out.print("ELEMENT SHIFT :: "+array[i]+" AT POSITION ::"+i);
	    } 
	    array[index] = element;
	    for(i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
	}
}

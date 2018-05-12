package Array;

import java.util.Scanner;

public class FindUniqueElementsOfAnUnsortedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size, i, j;
		int array[] = new int[50];
		System.out.print("Enter Array Size : ");
		size = sc.nextInt();

		System.out.println("Enter array element.");
		for (i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		for (i = 0; i < size; i++) {
			for (j = 0; j < i; j++) {
				System.out.println("array[i]=" + array[i]+"   array[j]="+array[j]);
				if (array[i] == array[j])
					break;
			}

			if (i == j) {
				/* No duplicate element found between index 0 to i */
				System.out.println("Enter array element." + array[i]);
			}
		}
	}
}

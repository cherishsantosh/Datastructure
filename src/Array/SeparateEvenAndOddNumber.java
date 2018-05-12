package Array;

import java.util.Scanner;

public class SeparateEvenAndOddNumber {
	static int isOdd(int a) {
		return a % 2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		int odd[] = new int[10];
		int even[] = new int[10];
		int size, i, k = 0, l = 0, j = 0;
		System.out.print("Enter Array Size : ");
		size = sc.nextInt();

		System.out.println("Enter array element.");
		for (i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		for (i = 0; i < size; i++) {
			if (array[i] % 2 != 0) {
				odd[j] = array[i];
				j++;
			} else {
				even[k] = array[i];
				k++;
			}
		}

		System.out.print("Odd:");
			for (i = 0; i < (j - 1); i++) {
				System.out.print(odd[i] + ",");
			}
			System.out.print(odd[j - 1]);
		
		System.out.print("Even:");
			for (i = 0; i < (k - 1); i++) {
				System.out.print(even[i] + ",");
			}
			System.out.print(even[k - 1]);
	}
}
package Recursion;

import java.util.Scanner;

public class primeNumber {
	static int globalChk;

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any number:");
		n = s.nextInt();
		System.out.println(n + " is prime number:" + isPrime(n, n/2));
	}

	private static boolean isPrime(int n, int div) {
		if (div == 1)
			return true;
		else if (n % div == 0)
			return false;
		else
			return isPrime(n, div - 1);
	}
}

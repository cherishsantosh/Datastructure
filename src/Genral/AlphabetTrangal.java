package Genral;

public class AlphabetTrangal {
	public static void main(String[] args) {
		System.out.println(" # 1st Pattern");
		int i, j, n = 7;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n - i; j++) {
				System.out.print("_");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k + "_");
			}
			System.out.println("");
		}
		
		System.out.println(" # 3rd Pattern");
		int k = 1;
        for (i = 1; i <= 5; i++) {
        	for (j = 1; j <=5  - i; j++) // for spaces
				System.out.print("_");
            for (j = 1; j < i + 1; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
        
		System.out.println(" # 2nd Pattern");
		
		for (i = 1; i <= 4; i++) // for 4 loops
		{
			for (j = 1; j <= 7 - i; j++) // for spaces
				System.out.print("_");
			for (j = 1; j <= i; j++) // for printing values
				System.out.print((char) (char) (i + 64) + "_");
			System.out.println(); // for line break
		}
		
		
	}
}

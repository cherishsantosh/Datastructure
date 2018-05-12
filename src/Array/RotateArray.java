package Array;
import java.util.Scanner;
/* Left and Right rotate array*/
class RotateArray 
{
	private static Scanner sc;

    public static void main(String[] args) {
    	RotateArray RA = new RotateArray();
        int array[] = {0,1,2,3,4,5,6,7,8,9}; 
        RA.rotateArray(array, 10, 3);
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
    }
    void shiftArrayOnePositionLeft(int array[], int size) {
        int i, temp;
        temp = array[0];
        for(i = 0; i < size-1; i++) {
        	System.out.print(array[i]+"=="+array[i+1]+"\n");
            array[i] = array[i+1];
        }
        System.out.print("\n--temp---["+temp+"]");
        array[i] = temp;
    }
    
    void shiftArrayOnePositionRight(int array[], int size) {
        int i, temp;
        temp = array[size-1];
        for(i = size-1; i >= 1; i--) {
        	System.out.print(array[i]+" ----two----- "+array[i-1]);
            array[i] = array[i-1];
        }
        System.out.print("--temp---"+temp);
        array[0] = temp;
    }
    
    void rotateArray(int array[], int size, int N){
        int i;
        for(i = 0; i < N; i++){
        	  shiftArrayOnePositionLeft(array, size);
        	 // shiftArrayOnePositionRight(array, size);
        }
        return;
    }
}
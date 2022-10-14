package Arrays;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the how many elements you want enter = ");
        int len = input.nextInt();
        int[]arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = input.nextInt();
        }
        input.close();
        int max = maximum(arr);
        int min = minimum(arr);
        System.out.println("maximum value of the array  = "+max);
        System.out.println("minimum value of the array = "+min);
    }
    static int maximum(int[]arr){
        if(arr == null){
            return -1;
        }
        int maximum = arr[0];
        for (int j : arr) {
            if (j > maximum) {
                maximum = j;
            }
        }
        return maximum;
    }
    static int minimum(int[]arr){
        if(arr == null){
            return -1;
        }
        int min = arr[0];
        for (int j: arr) {
            if(j < min){
                min = j;
            }
        }
        return min;
    }
}

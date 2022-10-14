package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many elements wants to you enter as an array : ");
        int length = input.nextInt();
        int[]arr = new int[length];
        System.out.println("Enter the values = ");
        for (int i = 0; i <length ; i++) {
            arr[i] = input.nextInt();
        }
        input.close();
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

package Maths;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int num = inp.nextInt();
        sumOfDigits(num);
    }

    private static void sumOfDigits(int num) {
        num = num < 0 ? -num : num;
        int sum = 0;
        while (num != 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}

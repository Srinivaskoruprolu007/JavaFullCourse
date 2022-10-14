package Maths;

import java.util.Scanner;

public class FibonacciCheck {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = inp.nextInt();
        System.out.println(isFibonacciNumber(n) ? "yes it is a fibonacci number":"No, it is not a Fibonacci number");
    }
    /*
    * Check the number is perfect square number or not
    * Let's create method which checks whether given number
    * perfect square or not */
    static boolean isPerfectSquare(int num){
        int sqrt = (int)Math.sqrt(num);
        return sqrt * sqrt == num;
    }
    /*
    * Check the number is fibonacci if at
    * least one of 5x^2+4 or 5x^2-4 is perfect square*/
    static boolean isFibonacciNumber(int n){
        return (
                isPerfectSquare(5 * n * n +4) ||
                isPerfectSquare(5 * n * n -4)
                );
    }
}

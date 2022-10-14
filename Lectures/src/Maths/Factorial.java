package Maths;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number to get factorial : ");
        int num = inp.nextInt();
        System.out.println(factorial(num));
    }

    private static int factorial(int num) {
        if(num < 0){
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <=num ;factorial *=i, i++);
        return factorial;
    }
}

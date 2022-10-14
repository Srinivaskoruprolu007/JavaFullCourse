package Maths;

import java.util.Scanner;

public class EvenNumberCheck01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        checkEven(n);
        checkOdd(n);
    }
    static void checkEven(int num){
        if((num &1) ==1){
            System.out.println(num+" is an odd number");
        }
        else {
            System.out.println(num+" is an even number");
        }
    }
    static void checkOdd(int num){
        String s = num%2!=0 ?"odd": "Even";
        System.out.println(s);
    }
}

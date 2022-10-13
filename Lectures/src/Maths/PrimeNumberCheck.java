package Maths;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an number : ");
        int n = in.nextInt();
        if(n <= 1){
            System.out.println(n+" is neither composite nor prime number");
        }
        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                System.out.println(n +" is not a prime number");
                return;
            }
            c++;
        }
        if(c * c > n){
            System.out.println(n+" is prime number");
        }
    }
}

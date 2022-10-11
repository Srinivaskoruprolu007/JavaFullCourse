package Assignment01;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e;
        float result, percentage;
        System.out.println("Enter your marks respectively ");

        System.out.println("Enter your marks in telugu subject ");
        a = sc.nextInt();

        System.out.println("Enter your marks in English subject ");
        b = sc.nextInt();

        System.out.println("Enter your marks in Maths subject ");
        c = sc.nextInt();

        System.out.println("Enter your marks in Physics subject ");
        d = sc.nextInt();

        System.out.println("Enter your marks in Chemistry subject ");
        e = sc.nextInt();

        result = a+b+c+d+e;
        percentage = (result/500)*100;

        System.out.println("Your percentage is "+percentage);
    }
}

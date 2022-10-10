package UserInputFunctions;

import java.util.*;

public class ScannerFunction {
    public static void main(String[] args) {
        // to take input from user let's create a scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        System.out.println(num);
        System.out.println("Enter the double number  ");
        double num2 = sc.nextDouble();
        System.out.println(num2);
        System.out.println("Enter your name ? ");
        String name = sc.next();
        System.out.println(name);

    }
}

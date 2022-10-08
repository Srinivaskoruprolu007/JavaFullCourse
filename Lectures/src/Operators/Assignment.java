package Operators;

public class Assignment {
    public static void main(String[] args) {
//               Basically Assignment operators are two types
//        1. Basic assignment:  operator which is used to assign a value to a variable
//        2. Compound assignment : operator having combination of arithmetic and assignment

        int b = 34;  // Basic Assignment
        System.out.println(b);
        b += 20;  //b = b+20
        System.out.println(b);
        b -= 20;  //b = b-20
        System.out.println(b);
        b *= 5;  // b = b * 5
        System.out.println(b);
        b /= 5;  // b = b/5
        System.out.println(b);
        b %= 5;  // b = b%5
        System.out.println(b);
    }
}

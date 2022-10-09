package Operators;

public class Bitwise {
    public static void main(String[] args) {
        /* Bitwise operators are used to performing the manipulation of individual
        bits of a number
        They can be used with any integral type(char, short, int,etc.)
        1. Bitwise OR(|):This operator is binary operator denoted '|'
        2. Bitwise AND(&):This operator is a binary operator, denoted by '&'
        3. Bitwise XOR(^):This operation is a binary operator, denoted by '^'
        4. Bitwise Complement(~):This operator is unary operator, denoted by '~'

         *
         */
        int a = 6;
        int b = 8;
        System.out.println("a|b = "+(a|b)); // 0110 | 1000
        System.out.println("a&b = "+(a&b)); // 0110 & 1000
        System.out.println("a^b = "+(a^b)); // 0110 ^ 1000
        System.out.println("compliment of a is "+(~a));
    }
}

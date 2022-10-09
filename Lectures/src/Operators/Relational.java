package Operators;

public class Relational {
    public static void main(String[] args) {
/*          Relational operators are used to check the
*           relation between two operands
*          -->  They return a boolean result after the comparison*/
        // 1. ==
        int a = 5, b = 10;
        System.out.println(a==b); // returns false

        // 2. !=
        System.out.println(a!=b);  // returns true

        // 3. >
        System.out.println(a>b);    // returns false

        // 4. <
        System.out.println(a<b);  // returns true

        // 5. >=
        System.out.println(a>=b);  // returns false

        // 6. <=
        System.out.println(a<=b);   // returns false
    }
}

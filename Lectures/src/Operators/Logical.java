package Operators;

public class Logical {
    public static void main(String[] args) {
/*          Logical Operators are used to perform
*           logical "AND", "OR" and "NOT"  operations
*           which are similar to logic gates in digital electronics*/
        // 1. AND operator(&&) : if both conditions are true then it does else don't
        int a = 10, b = 20, c = 30;
        if(a<b && c>b){
            int d = a+b+c;
            System.out.println(d);
        }
        else{
            System.out.println("False");
        }

        // 2. OR operator(||) : if any one of the conditions are true then it does else don't
        if(a>b || b<c){
            int sum = a+b;
            System.out.println("The sum of a and b is "+sum);
        }
        else System.out.println("false");

        // 3. NOT operator
        System.out.println(!(a<b));// results false
    }

}

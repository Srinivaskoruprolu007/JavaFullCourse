package Operators;

public class Ternary {
    public static void main(String[] args) {
// syntax
//        variable = Expression1 ? expression2 : Expression3
        int n1 = 5, n2 = 10, max;
        boolean even;
        max = (n1>n2) ? n1:n2;
        System.out.println("Maximum is = "+max);
        even = n1%2 == 0 ? true:false;
    }
}

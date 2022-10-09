package Operators;

public class Shifting {
    public static void main(String[] args) {
        /*  By shifting the bits of it's first operand right or left
        *   a shift operator performs bit manipulation on data
        *   1. signed left shift <<
        *   2. signed right shift >>
        *   3. unsigned right shift >>>
        * */
        int a = 64;
        System.out.println(Integer.toBinaryString(a));
        int i;
        i = a << 2;
        System.out.println("Original value of a :"+a);
        System.out.println(Integer.toBinaryString(i));
        System.out.println("the value of a after left shift by 2 bits :"+i);
        int j = a >> 2;
        System.out.println(Integer.toBinaryString(j));
        System.out.println("The value of a after right shift by 2 bits :"+j);
        int k = (-a) >>> 1;
        System.out.println(Integer.toBinaryString(k));
        System.out.println("The value of a after unsigned right shift by 2 bits :"+k);
    }
}

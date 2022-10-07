package Operators;

public class unary {
    public static void main(String[] args) {
//        Java unary operators are the types that need only one operand to perform any operation
        /* 1.unary minus : this is used to change positive to negitive
        * 2.NOT operator: this is used to convert True to False and vice versa
        * 3.Increment : It is used to increment the value of an integer
        *           it can be used in two different ways
        *       3.1 post increment: it retains the original value until its execution
        *       3.2 pre increment: it's get increment the value of operand instantly
        * 4. Decrement : It is used to decrease the integer value of the operand
        *  it is also has two forms of usage as same as increment operator
        * 5. Bitwise complement : It is used to do 2's complement of given operand in binary representation of given data*/
        int a = 50;
        a = -a;
        System.out.println(a);
        boolean b = false;
        boolean t = !b;
        System.out.println(t);
        int num = 55;
        num++;// temporarily it stores 55 until it's execution
        System.out.println(num);
        ++num; // it's get instantly increments the value
        System.out.println(num);
        num--;
        System.out.println(num);
        --num;
        System.out.println(num);
        int i = 5; // 0101
        int j = ~i; //2's compliment of 1010 i.e -6
        System.out.println(j);
    }
}

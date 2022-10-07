package VariablesAndLiterals;
public class DataTypes {
    public static void main(String[] args) {
/*       Data types are building blocks of data manipulations such as
Arithmetic operations, logical operations, etc,.
1. Data types having different sizes which can be stored in variables
2. There are two types of data types in Java
        i. Primitive data types :
                The primitive data types include boolean, char, byte, short, int, long, float and double.
        ii. Non-primitive data types :
                The non-primitive data types include Classes, Interfaces, and Arrays.
 */


        System.out.println("size of Integer data type is "+(Integer.SIZE/8)+ " bytes or "+(Integer.SIZE)+ " bits");
        System.out.println("The range of an integer is from "+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);// 2^-31 to (2^31)-1  hence it is based on 2's complement representation
        System.out.println("size of double data type is "+(Double.SIZE/8)+ " bytes or "+(Double.SIZE)+" bits");
        System.out.println("The range of a double is from "+Double.MIN_VALUE+" to "+Double.MAX_VALUE);// 2^-63 to (2^63)-1
        System.out.println("The size of float data type is "+(Float.SIZE/8)+" bytes or "+(Float.SIZE)+" bits");
        System.out.println("The size of char is "+Character.SIZE/8+" bytes or "+Character.SIZE+" bits");
        System.out.println("The size of byte data type is "+Byte.SIZE/8+" bytes or "+Byte.SIZE+" bits");
        System.out.println("The size of short data type is "+Short.SIZE/8+" bytes or "+Short.SIZE+" bits");
        System.out.println("The size of long data type is "+Long.SIZE/8+" bytes or "+Long.SIZE+" bits");
    }
}

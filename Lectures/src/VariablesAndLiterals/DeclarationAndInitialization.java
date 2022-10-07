package VariablesAndLiterals;

public class DeclarationAndInitialization {
    public static void main(String[] args) {
//        declaration is just creating a variable with some type of data type
//       assigning a value that declared variable
        int a;       // declaration
        a = 55; //initialization
        System.out.println(a);
//        byte b = 128; // it gives error because byte can't able store more than 127
        short s = 32_767;
        System.out.println(s);
        double d = 232.5;
        System.out.println(d);
        float f = 13F;
        System.out.println(f);
        long l =  34680281;
        System.out.println(l);
        char ch = 'a';// single quotes for character and double quotes for string
        System.out.println(ch);
    }
}

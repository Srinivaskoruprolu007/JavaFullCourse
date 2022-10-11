package ConditionsAndLoops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a letter to check :");
        char ch = in.next().trim().charAt(0); // for inputting single character

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }
        else System.out.println("Uppercase");
    }

}

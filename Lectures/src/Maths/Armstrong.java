package Maths;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check : ");
        int num = input.nextInt();
        String ans = isArmstrong(num) ? "yes it is Armstrong":"No it's not an armstrong number";
        System.out.println(ans);
    }
    static boolean isArmstrong(int num){
        int original = num;
        int ans = 0;
        while (num > 0){
            int rem = num % 10;
            num/=10;
            ans = ans+(rem*rem*rem);
        }
        return ans == original;
    }
}

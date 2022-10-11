package UserInputFunctions;

import java.util.Scanner;
// delimiters are  special characters that are used to separate the words in a sentence
// space is a default delimiter in java
public class Delimiter {
    public static void main(String[] args) {
        // declaring a String
        String details = "Myself an enthusiast and problem seeker ";
        Scanner sc = new Scanner(details);
        int count = 0;
        while (sc.hasNext()){
            String tokens = sc.next();
            System.out.println(tokens);
            count++;
        }
        System.out.println("The number of words in the sentence = "+count);
    }
}

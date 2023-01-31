/*WAP to accept a string and rewrite it in alphabetical order*/


import java.util.Arrays;
import java.util.Scanner;

public class alphabetorder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scan.nextLine();
        String alphabetical = alphabetize(input);
        System.out.println("Alphabetical order: " + alphabetical);
    }

    public static String alphabetize(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}

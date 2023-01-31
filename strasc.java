/*WAP to accept multiple strings and arrange them in ascending order.*/


import java.util.Scanner;
import java.util.Arrays;

public class strasc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        String[] str = new String[n];
        System.out.println("Enter the strings: ");
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        Arrays.sort(str);
        System.out.println("Strings in ascending order:");
        for (String s : str) {
            System.out.println(s);
        }
    }
}
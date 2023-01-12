import java.util.Scanner;

class reversenum {
    
    public static void main(String[] args) {
        int num, rev=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        num = sc.nextInt();

        while (num != 0) {
            int i = num % 10;
            rev = rev * 10 + i;
            num = num / 10;
        }
        System.out.println("The reverse of the given number is: " + rev);
    }
}
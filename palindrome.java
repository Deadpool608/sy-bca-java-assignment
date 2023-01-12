import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int num1,num2,rev=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        num1 = sc.nextInt();
        num2=num1;
        while (num2 != 0) {
            int i = num2 % 10;
            rev = rev * 10 + i;
            num2 = num2 / 10;
        }

        if(rev==num1){

            System.out.println("the given number is pelindrome");
        }
        else{
            System.out.println("the given number is not pelindrome");

        }


    }
}

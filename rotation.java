/*WAP to find all rotations of a given string. 
e.g. Java --→ Java, avaJ,vaJa,aJav*/

import java.util.ArrayList;
import java.util.Scanner;

public class rotation {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  string: ");
        String str = sc.next();
        ArrayList<String> rotations = findRotations(str);
        for (String rotation : rotations) {
            System.out.println(rotation);
        }
    }

    public static ArrayList<String> findRotations(String str) {
        ArrayList<String> rotations = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            String rotation = str.substring(i) + str.substring(0, i);
            rotations.add(rotation);
        }
        return rotations;
    }
}

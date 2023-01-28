/*
 WAP to accept a string and count total number of uppercase and lowercase 
characters in a string.
*/

import java.util.Scanner;

class cases{
	public static void main(String args[]){
	int upper=0,lower=0;
		
	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter a line: ");
	String str = sc.nextLine();
	
	char[] ch=str.toCharArray();
	
	for (char i : ch){
		if(i >= 'A' && i <= 'Z'){
			upper++;
		}
		else if(i >= 'a' && i <= 'z'){
			lower++;
		}
		else{
			continue;
		}
	}
	System.out.println("number of lowercases :"+lower);
	System.out.println("number of uppercases :"+upper);
	}
}
/*
Create two classes called income and expenditure. The income class 
contains (salary,allowance,rent) and the expenditure class contains 
(food,clothing,educational). Create a Budget class which uses the above 
classes and also, calculate savings of the family.
*/



import java.util.Scanner;

class income{
	int salary,allowance,rent;
	void income(){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter salary: ");
	salary = sc.nextInt();

	System.out.println("Enter allowance: ");
	allowance = sc.nextInt();
	
	System.out.println("Enter rent: ");
	rent = sc.nextInt();
	}
}

class expenditure extends income{
	int food,clothing,educational;

void expense(){	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter food expenses: ");
	food = sc.nextInt();
	
	System.out.println("Enter clothing expenses: ");
	clothing = sc.nextInt();
	
	System.out.println("Enter educational expenses: ");
	educational = sc.nextInt();
}
}

class budget extends expenditure{
	void saving(){
	int income,expense,saving;
	income=salary+allowance+rent;
	expense=food+clothing+educational;
	
	saving = income - expense;
	
	System.out.println("Your savings is: "+saving);
	}
	
	public static void main(String args[])
	{
	budget b1=new budget();
	b1.income();
	b1.expense();
	b1.saving();
	}
}
/* 
Create following classes
Publisher class contains
Variables :Pubid, Pubname
Method :setPublisher() sets details of a publisher
Book class inherits Publisher class and contains
Variables :Bookid, BookName, Author
Method :setBookDetails() sets the details of a book
Method :getBookDetails() gets details of a book
Create a main() that will use above classes and display details about 
publisher and book.
*/



import java.util.Scanner;

class publisher{
	int pubid;
	Scanner sc=new Scanner(System.in);
	String name;
	
	void setpublisher()
	{
		System.out.println("Enter name of publisher: ");
		name=sc.next();
		System.out.println("Enter name of publisher id: ");
		pubid=sc.nextInt();
	}
}
class book extends publisher
{
	int bookid;
	String bookname,author;
	void setbookdetails(){
		System.out.println("Enter name of bookid: ");
		bookid=sc.nextInt();
		System.out.println("Enter name of book: ");
		bookname=sc.next();
		System.out.println("Enter name of author: ");
		author=sc.next();
	}
	void getbookdetails()
	{
		System.out.println("Name of publisher is: "+name);
		System.out.println("Publisher id is: "+pubid);
		System.out.println("Name of book is: "+bookname);
		System.out.println("Publisher id is: "+bookid);
		System.out.println("Name of author is: "+author);
	}
}
class books{
	public static void main(String args[]){
	book b1=new book();
	b1.setpublisher();
	b1.setbookdetails();
	b1.getbookdetails();
	}
}
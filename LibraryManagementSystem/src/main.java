import java.util.*;
public class main 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//create objects
		System.out.println("Welcome to the Test Library Management System! Type in a book you'd like to view:");
			String inputbookName = input.nextLine();
			
					
		BookCatalog objBookCatalog = new BookCatalog(inputbookName);
		String bookname = objBookCatalog.addBook();
		System.out.println(bookname);
		
		
			
			

	}

}

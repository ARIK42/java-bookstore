package book;
import java.util.Scanner;

public class BookArray {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Book[] Book = new Book[10];
		
		for (int i=0; i<Book.length; i++) {
			System.out.println("Press 'F' for Fiction book | 'N' for Non-Fiction book");
			Scanner s = new Scanner(System.in);
			String choice = s.nextLine();
			System.out.println("Enter book title");
			String title = s.nextLine();
			
			if (choice.equals("F")) {
				Book[i] = new Fiction(title);
			} else if (choice.equals("N")) {
				Book[i] = new NonFiction(title);
			} 
			else {
				System.out.println("Invalid choice");
				i--;
			}
		}
		System.out.println("\t\tBook List");
        for (int j=0; j<Book.length; j++) {
            System.out.println(Book[j].getTitle()+" - $"+Book[j].getPrice());
        }
	}
}

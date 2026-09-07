import java.util.Scanner;
class Book{
    int bookId;
    String bookTitle;
    String author;
    boolean available;
    
    Book(int bookId, String bookTitle, String author, boolean avaialable){
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.available = available;

    }
    void issueBook(){
        if(available){
            available = false;
            System.out.println("Book issued successfully.\n");  
        }else{
            System.out.println("Book is already issued.\n");
        }
    }
    void returnBook(){
        if(!available){
            available = true;
            System.out.println("Book returned successfully.\n");
        }else{
            System.out.println("Book is already available.\n");
        }
    }
    void display(){
        System.out.println("Book ID: "+ bookId);
        System.out.println("Book Title: "+ bookTitle);
        System.out.println("Author: " + author);
        System.out.println("Availability: "+ (available? "Available": "Issued"));
    }
}
    
public class Case5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book Id: ");
        int bookId = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter book title: ");
        String bookTitle = sc.nextLine();

        System.out.println("Enter Author Name: ");
        String author = sc.nextLine();

        Book book = new Book(bookId, bookTitle,author,  true);

        System.out.println("Book Details: ");
        book.display();

        System.out.println("Issuing Book:");
        book.issueBook();

        System.out.println("Trying to issue again: ");
        book.issueBook();

        System.out.println("Returning book: ");
        book.returnBook();

        System.out.println("Final book details: ");
        book.display();
        sc.close();
    }
    
}

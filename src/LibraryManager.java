import java.util.Scanner;

public class LibraryManager {
    private Book[] books;


    public LibraryManager(int size) {
        books = new Book[size];
    }

    public void createLibrary() {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < books.length; i++) {

            System.out.println("Title of The Book");
            String title = sc.nextLine();
            System.out.println("Author of The Book");
            String author = sc.nextLine();
            System.out.println("Pages of The Book");
            int pageNum = sc.nextInt();

            sc.nextLine();

            Book newBook = new Book (title,author,pageNum);
            books [i] = newBook;

        }
    }
    public void printLibrary (){
        for(Book printBooks : books){
            System.out.println(printBooks.getTitle());
            System.out.println(printBooks.getAuthor());
            System.out.println(printBooks.getNumPages());
            System.out.println(); // Adds an empty line for better readability between books
        }
    }
    public void totalPages(){

          int totalPages = 0;
        for (Book book : books) {
            totalPages += book.getNumPages();
        }

        System.out.println("There are " + totalPages + " pages in our library");
    }
}

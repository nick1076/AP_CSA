import java.util.ArrayList;

public class BookList {

    ArrayList<Book> books = new ArrayList<Book>();

    public void addToList(Book book){
        //Add a book to the array list
        books.add(book);
    }

    public void removeFromList(Book book){
        //Remove a book from the array list
        books.remove(book);
    }

    public void sortList(String sorting_method){
        //Sort via sorting_method
    }

    public void printTable(){
        //Print out each book's info
        System.out.println("|________________________________________________|");
        System.out.println("|Title | Genre | Author | Subject | Edition | QTY|");
        System.out.println("|------------------------------------------------|");
        foreach (Book book in books){
            System.out.print("|");
            book.printInfo();
            System.out.println("|");
        }
        System.out.println("|------------------------------------------------|");
    }
}

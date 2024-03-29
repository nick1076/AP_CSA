import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookList {

    ArrayList<Book> books = new ArrayList<Book>();

    public void addToList(Book book){
        //Add a book to the array list
        books.add(book);
    }

    public void addToListFromLine(String csvLine){
        //Process CSV Info Here
        String t = "";
        String g = "";
        String a = "";
        String s = "";
        Integer e = 0;

        String[] data = csvLine.split(",");
        for (int i = 0; i < data.length; i++){
            if (i == 0){
                //Title
                t = data[i];
            }
            else if (i == 1){
                //Genre
                g = data[i];
            }
            else if (i == 2){
                //Author
                a = data[i];
            }
            else if (i == 3){
                //Subject
                s = data[i];
            }
            else if (i == 4){
                //Edition
                e = Integer.valueOf(data[i]);
            }
        }

        if (data[1].equals("Fiction")){
            FictionBook fBook = new FictionBook(data);
            books.add(fBook);
        }
        else if (data[1].equals("Nonfiction")){
            System.out.println(csvLine);
            NonfictionBook nfBook = new NonfictionBook(data);
            books.add(nfBook);
        }
        else if (data[1].equals("Textbook")){
            TextBook tBook = new TextBook(data);
            books.add(tBook);
        }
    }

    public void removeFromList(Book book){
        //Remove a book from the array list
        books.remove(book);
    }

    public void sortList(String sorting_method){
        //Sort via sorting_method
        ArrayList<String> sortedStrings = new ArrayList<String>();
        if (sorting_method == "Author"){
            for (int i = 0; i < books.size(); i++){
                sortedStrings.add(books.get(i).Author);
            }

            Collections.sort(sortedStrings);

            ArrayList<Book> sortedBooks = new ArrayList<Book>();

            for (int i = 0; i < sortedStrings.size(); i++){
                for (int x = 0; x < books.size(); x++){
                    if (books.get(x).Author.equals(sortedStrings.get(i))){
                        sortedBooks.add(books.get(x));
                        break;
                    }
                }
            }

            books.clear();
            books = sortedBooks;
        }
        else if (sorting_method == "Subject"){
            for (int i = 0; i < books.size(); i++){
                sortedStrings.add(books.get(i).Subject);
            }

            Collections.sort(sortedStrings, Collections.reverseOrder());

            ArrayList<Book> sortedBooks = new ArrayList<Book>();

            for (int i = 0; i < sortedStrings.size(); i++){
                for (int x = 0; x < books.size(); x++){
                    if (books.get(x).Subject == sortedStrings.get(i)){
                        sortedBooks.add(books.get(x));
                        break;
                    }
                }
            }

            books = sortedBooks;
        }
        else if (sorting_method == "Genre"){
            for (int i = 0; i < books.size(); i++){
                sortedStrings.add(books.get(i).Genre);
            }

            Collections.sort(sortedStrings, Collections.reverseOrder());

            ArrayList<Book> sortedBooks = new ArrayList<Book>();

            for (int i = 0; i < sortedStrings.size(); i++){
                for (int x = 0; x < books.size(); x++){
                    if (books.get(x).Genre == sortedStrings.get(i)){
                        sortedBooks.add(books.get(x));
                        break;
                    }
                }
            }

            books = sortedBooks;
        }
    }

    public void printTable(){
        //Print out each book's info
        System.out.println("|--------------------------------------------------|");
        System.out.println("| Title | Genre | Author | Subject | Edition | QTY |");
        System.out.println("|--------------------------------------------------|");

        for (int i = 0; i < books.size(); i++)
        {
            System.out.print("|");
            books.get(i).printInfo();
            System.out.println("|");
        }

        System.out.println("|--------------------------------------------------|");
    }
}

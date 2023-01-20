import java.util.ArrayList;

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

        if (g == "Fiction"){
            FictionBook fBook = new FictionBook(data);
            books.add(fBook);
        }
        else if (g == "Nonfiction"){
            NonfictionBook nfBook = new NonfictionBook(data);
            books.add(nfBook);
        }
        else if (g == "Textbook"){
            TextBook tBook = new TextBook(data);
            books.add(tBook);
        }

        //Look at data and determine what type of book object should be made
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

        for (int i = 0; i < books.size(); i++)
        {
            System.out.print("|");
            books.get(i).printInfo();
            System.out.println("|");
        }

        System.out.println("|------------------------------------------------|");
    }
}

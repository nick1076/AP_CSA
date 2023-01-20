
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class main{
    public static void main(String[] args){

        BookList books = new BookList();

        try{
            File myFile = new File("./booksFile.txt");
            
            Scanner myScanner = new Scanner(myFile);
            
            String line = "";
            int lineCount = 0;
            
            while(myScanner.hasNextLine()){
                line = myScanner.nextLine();
                if (lineCount != 0){
                    books.addToListFromLine(line);
                }
                lineCount++;
            }
    
            books.printTable();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
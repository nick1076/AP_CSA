
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args){

        try {

            File myFile = new File("./file.txt");

            Scanner myScanner = new Scanner(myFile);
        
            String line = myScanner.nextLine();
		    System.out.println(line);
			
		    while(myScanner.hasNextLine()){
			    line = myScanner.nextLine();
			    System.out.println(line.charAt(0));
		    }

        }
        catch(Exception e){

        }

    }

}




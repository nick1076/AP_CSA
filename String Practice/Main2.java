
import java.util.*;
import java.io.*;
import java.util.Arrays;

public class Main2 {

    public static void main(String[] args){

        try {

            File myFile = new File("./file.txt");

            Scanner myScanner = new Scanner(myFile);

            int index = 0;
			
		    while(myScanner.hasNextLine()){
                String s = myScanner.nextLine();
                index+=1;
		    }

            String[] things1 = new String[index / 2];
            String[] things2 = new String[index / 2];

            Scanner newScanner = new Scanner(myFile);
        
            String currentLine = "";
			
		    for (int i = 0; i < index; i++){
                currentLine = newScanner.nextLine();
                if (i % 2 == 0){
                    things1[i / 2] = currentLine;
                }
                else{
                    things2[i / 2] = currentLine;
                }
		    }

            //Arrays.sort(things);

            for (int x = 0; x < index / 2; x++){
                System.out.println(things1[x]);
                System.out.println(things2[x]);
            }

        }
        catch(Exception e){
            
        }

    }

}
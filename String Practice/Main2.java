
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
            String[] totalThings = new String[index];

            Scanner newScanner = new Scanner(myFile);
        
            String currentLine = "";
			
		    for (int i = 0; i < index; i++){
                currentLine = newScanner.nextLine();
                if (i % 2 == 0){
                    things1[i / 2] = currentLine;
                }
                totalThings[i] = currentLine;
		    }

            Arrays.sort(things1);

            for (int x = 0; x < index; x++){
                for (int e = 0; e < index / 2; e++){
                    if (things1[e] == totalThings[x]){
                        things2[e] = totalThings[x + 1];
                    }
                }
            }

            for (int z = 0; z < index / 2; z++){
                System.out.println("Artist: " + things2[z] + " | Song: " + things1[z]);
            }

        }
        catch(Exception e){
            
        }
    }
}
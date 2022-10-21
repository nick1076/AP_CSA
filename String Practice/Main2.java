
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
		    }

            Arrays.sort(things1);

            for (int x = 0; x < index / 2; x++){

                Scanner latestScanner = new Scanner(myFile);
                String newestLine = "";
			
                while(latestScanner.hasNextLine()){
                    newestLine = latestScanner.nextLine();
                    if (things1[x] == newestLine){
                        things2[x] = latestScanner.nextLine();
                        break;
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
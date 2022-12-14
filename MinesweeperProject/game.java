
//Import packages
import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class game{

    //Declare visuals for game
    public char charFlag = '⚐';
    public char charBomb = 'ⴲ';
    public char charNormal = '□';
    public char charUncovered = '□';

    //Bomb generation seed
    public int seed = 1;

    //Board scaling
    public int xScale = 5;
    public int yScale = 5;

    //Difficulty (Bombs in map)
    public int totalBombCount = 5;

    //Data
    public int uncoveredBombs = 0;

    //Enabled to show all hidden bombs for testing
    public boolean displayBombs = false;
    public boolean lost = false;
    public boolean win = false;

    //Grid object
    public grid g;

    //Create a random which uses our seed
    public Random rand = new Random(seed);

    public void Begin(){
        g = new grid(this);
        
        //Credit for the scanner code below: https://www.geeksforgeeks.org/ways-to-read-input-from-console-in-java/
        while (!lost && !win){
            Scanner in = new Scanner(System.in);
     
            String s = in.nextLine();
            takeInput(s);
        }
    }

    //Called when player loses
    public void onLose(){
        lost = true;
    }

    //Called when player wins
    public void onWin(){
        win = true;
    }

    //Processes user input
    public void takeInput(String s){
        g.ClearConsole();
        if (s == "end"){
            lost = true;
        }

        if (lost || win){
            return;
        }

        else{
            //Parse based on spaces, check if first is f or number
            if (s.charAt(0) == 'f'){
                //Player is trying to flag a location
                int xC = Integer.parseInt(String.valueOf(s.charAt(2)));
                int yC = Integer.parseInt(String.valueOf(s.charAt(4)));

                if (xC > xScale - 1 && yC < yScale - 1){
                    g.Display();
                    g.println("");
                    g.println("X Position out of bounds. Please type another.");
                    return;
                }
                else if (yC > yScale - 1 && xC < xScale - 1){
                    g.Display();
                    g.println("");
                    g.println("Y Position out of bounds. Please type another.");
                    return;
                }
                else if (xC > xScale - 1 && yC > yScale - 1){
                    g.Display();
                    g.println("");
                    g.println("X & Y Position out of bounds. Please type another.");
                    return;
                }

                g.uncoverSpot(xC, yC, true);
            }
            else{
                //Player wants to uncover a location
                int xC = Integer.parseInt(String.valueOf(s.charAt(0)));
                int yC = Integer.parseInt(String.valueOf(s.charAt(2)));

                if (xC > xScale - 1 && yC < yScale - 1){
                    g.Display();
                    g.println("");
                    g.println("X Position out of bounds. Please type another.");
                    return;
                }
                else if (yC > yScale - 1 && xC < xScale - 1){
                    g.Display();
                    g.println("");
                    g.println("Y Position out of bounds. Please type another.");
                    return;
                }
                else if (xC > xScale - 1 && yC > yScale - 1){
                    g.Display();
                    g.println("");
                    g.println("X & Y Position out of bounds. Please type another.");
                    return;
                }

                g.uncoverSpot(xC, yC, false);
            }
        }
    }
}
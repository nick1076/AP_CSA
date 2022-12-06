
import java.util.Random;

public class grid{
    private tile[][] tiles;
    private game main;
    private int xScale;
    private int yScale;

    public game GetGame(){
        return main;
    }

    public grid(game g){
        main = g;
        xScale = main.xScale;
        yScale = main.yScale;

        tiles = new tile[xScale][yScale];
        int cBombs = 0;

        for (int xV = 0; xV < xScale; xV++){
            for (int yV = 0; yV < yScale; yV++){
                if (cBombs < main.totalBombCount){
                    int outcome = main.rand.nextInt(2);

                    if (outcome == 0){
                        tiles[xV][yV] = new tile(false, xV, yV, this);
                    }
                    else{
                        tiles[xV][yV] = new tile(true, xV, yV, this);
                        cBombs += 1;
                    }
                }
                else{
                    tiles[xV][yV] = new tile(false, xV, yV, this);
                }
            }
        }

        Display();
    }

    public void Display(){
        String xTop = " ";
        println("");
        for (int x = 0; x < xScale; x++){
            xTop += "   " + x;
        }
        println(xTop);
        println("");

        for (int y = 0; y < yScale; y++){
            String finalForRow = "" + y;
            for (int x = 0; x < xScale; x++){ 
                finalForRow += "   " +  tiles[x][y].getTileChar(main, tiles);
            }
            println(finalForRow);
            println("");
        }

        if (main.win){
            println("You flagged all of the bombs! You win");
            println("");
        }
    }

    public void uncoverSpot(int x, int y, boolean flag){
        if (tiles[x][y].uncover(flag) == -1 && !flag){
            Display();
            println("You dug up a bomb and lost!");
            println("");
            main.onLose();
        }
        else{
            Display();
        }
    }

    public void print(String p){
        System.out.print(p);
    }

    public void println(String p){
        System.out.println(p);
    }

    public void ClearConsole(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
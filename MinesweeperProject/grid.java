
import java.util.Random;

public class grid{
    private tile[][] tiles;
    private game main;
    private int xScale;
    private int yScale;

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
                        tiles[xV][yV] = new tile(false);
                    }
                    else{
                        tiles[xV][yV] = new tile(true);
                        cBombs += 1;
                    }
                }
                else{
                    tiles[xV][yV] = new tile(false);
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
                finalForRow += "   " +  tiles[x][y].getTileChar(main);
            }
            println(finalForRow);
            println("");
        }
    }

    public void print(String p){
        System.out.print(p);
    }

    public void println(String p){
        System.out.println(p);
    }
}
package MinesweeperProject;

import java.util.Random;

public class grid{
    private tile[][] tiles;
    private game main;
    private int xScale;
    private int yScale;

    public grid(game g, int b, int x, int y, Random r){
        main = g;
        xScale = x;
        yScale = y;

        tiles = new tile[xScale][yScale];
        int cBombs = 0;

        for (int xV = 0; xV < xScale; xV++){
            for (int yV = 0; yV < yScale; yV++){
                if (cBombs < b){
                    int outcome = r.nextInt(2);

                    if (outcome == 0){
                        tiles[xV][yV] = new tile(false);
                    }
                    else{
                        tiles[xV][yV] = new tile(true);
                    }
                }
                else{
                    tiles[xV][yV] = new tile(false);
                }
            }
        }
    }

    public void Display(){

    }
}
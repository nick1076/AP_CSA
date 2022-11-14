package MinesweeperProject;

import java.util.Random;

public class game{

    public char charFlag = '⚐';
    public char charBomb = 'ⴲ';
    public char charNormal = ' ';
    public char charUncovered = ' ';

    public int seed = 1;
    public int xScale = 5;
    public int yScale = 5;

    public int totalBombCount = 5;

    public Random rand = new Random(seed);

    public static void main(String[] args){
        grid g = new grid(this.game, totalBombCount, xScale, yScale, rand);
    }
}
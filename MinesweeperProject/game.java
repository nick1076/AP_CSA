
import java.util.Random;

public class game{

    public char charFlag = '⚐';
    public char charBomb = 'ⴲ';
    public char charNormal = '□';
    public char charUncovered = '□';

    public int seed = 1;
    public int xScale = 5;
    public int yScale = 5;

    public int totalBombCount = 5;

    //Enabled to show all hidden bombs for testing
    public boolean displayBombs = true;

    public Random rand = new Random(seed);

    public void Begin(){
        grid g = new grid(this);
    }
}
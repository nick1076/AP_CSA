
public class tile {

    private boolean flagged = false;
    private boolean bomb = false;
    private boolean uncovered = false;

    public tile(boolean b){
        bomb = b;
    }

    public boolean getBomb(){
        return bomb;
    }

    public boolean getFlagged(){
        return flagged;
    }

    public void uncover(){
        uncovered = true;
    }

    public char getTileChar(game g, tile[][] t){
        //Add logic to return different chars dependent on what the tile is!
        if (bomb && g.displayBombs){
            return g.charBomb;
        }
        if (uncovered){
            return CalculateNearbyBombs(t);
        }
        return g.charNormal;
    }

    public void setBomb(boolean nBomb){
        bomb = nBomb;
    }

    public void setFlag(boolean nFlag){
        flagged = nFlag;
    }

    private char CalculateNearbyBombs(game g, tile[][] board){
        int nearbyBombs = 0;
        char finalC = g.charUncovered;

        //Create logic for counting bombs here

        if (nearbyBombs == 0){
            finalC = g.charUncovered;
        }
        else if (nearbyBombs == 1){
            finalC = '1';
        }
        else if (nearbyBombs == 2){
            finalC = '2';
        }
        else if (nearbyBombs == 3){
            finalC = '3';
        }
        else if (nearbyBombs == 4){
            finalC = '4';
        }
        else if (nearbyBombs == 5){
            finalC = '5';
        }
        else if (nearbyBombs == 6){
            finalC = '6';
        }
        else if (nearbyBombs == 7){
            finalC = '7';
        }
        else if (nearbyBombs == 8){
            finalC = '8';
        }

        return finalC;
    }

}

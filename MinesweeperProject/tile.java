
public class tile {

    private boolean flagged = false;
    private boolean bomb = false;
    private boolean uncovered = false;

    private int xCoord = 0;
    private int yCoord = 0;

    public tile(boolean b, int x, int y){
        bomb = b;
        xCoord = x;
        yCoord = y;
    }

    public boolean getBomb(){
        return bomb;
    }

    public boolean getFlagged(){
        return flagged;
    }

    public int uncover(boolean flag){
        uncovered = true;
        flagged = flag;

        if (bomb && !flag){
            uncovered = true;
            return -1;
        }

        return 0;
    }

    public char getTileChar(game g, tile[][] t){
        //Add logic to return different chars dependent on what the tile is!
        if (bomb){
            if (g.displayBombs || uncovered){
                if (!flagged){
                    return g.charBomb;
                }
            }
        }
        if (flagged){
            return g.charFlag;
        }
        if (uncovered){
            return CalculateNearbyBombs(g, t);
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
        char finalC = '0';

        boolean bordersXleft = false;
        boolean bordersXright = false;

        boolean bordersYabove = false;
        boolean bordersYbelow = false;

        if (xCoord == 0){
            bordersXleft = true;
        }
        if (xCoord == g.xScale){
            bordersXright = true;
        }

        if (yCoord == 0){
            bordersYbelow = true;
        }
        if (yCoord == g.xScale){
            bordersYabove = true;
        }

        //Top Left
        if (!bordersYabove && !bordersXleft){
            //Check if this tile is a bomb. If so, add to current bombs. If not, also calculate it's nearby bombs and reveal it.
            tile t = board[xCoord - 1][yCoord - 1];

            if (t.bomb){
                nearbyBombs += 1;
            }
            else{
                t.CalculateNearbyBombs(g, board);
            }
        }

        //Top Middle
        if (!bordersYabove){
            //Check if this tile is a bomb. If so, add to current bombs. If not, also calculate it's nearby bombs and reveal it.
            tile t = board[xCoord][yCoord - 1];

            if (t.bomb){
                nearbyBombs += 1;
            }
            else{
                t.CalculateNearbyBombs(g, board);
            }
        }

        /* 
        //Top Right
        if (!bordersYabove && !bordersXright){
            //Check if this tile is a bomb. If so, add to current bombs. If not, also calculate it's nearby bombs and reveal it.
            tile t = board[xCoord + 1][yCoord - 1];

            if (t.bomb){
                nearbyBombs += 1;
            }
            else{
                t.CalculateNearbyBombs(g, board);
            }
        }

        //Middle Right
        if (!bordersXright){
            //Check if this tile is a bomb. If so, add to current bombs. If not, also calculate it's nearby bombs and reveal it.
            tile t = board[xCoord + 1][yCoord];

            if (t.bomb){
                nearbyBombs += 1;
            }
            else{
                t.CalculateNearbyBombs(g, board);
            }
        }

        //Middle Left
        if (!bordersXleft){
            //Check if this tile is a bomb. If so, add to current bombs. If not, also calculate it's nearby bombs and reveal it.
            tile t = board[xCoord - 1][yCoord];

            if (t.bomb){
                nearbyBombs += 1;
            }
            else{
                t.CalculateNearbyBombs(g, board);
            }
        }

        //Bottom Left
        if (!bordersYbelow && !bordersXleft){
            //Check if this tile is a bomb. If so, add to current bombs. If not, also calculate it's nearby bombs and reveal it.
            tile t = board[xCoord - 1][yCoord + 1];

            if (t.bomb){
                nearbyBombs += 1;
            }
            else{
                t.CalculateNearbyBombs(g, board);
            }
        }

        //Bottom Middle
        if (!bordersYbelow){
            //Check if this tile is a bomb. If so, add to current bombs. If not, also calculate it's nearby bombs and reveal it.
            tile t = board[xCoord][yCoord + 1];

            if (t.bomb){
                nearbyBombs += 1;
            }
            else{
                t.CalculateNearbyBombs(g, board);
            }
        }

        //Bottom Right
        if (!bordersXright && !bordersYbelow){
            //Check if this tile is a bomb. If so, add to current bombs. If not, also calculate it's nearby bombs and reveal it.
            tile t = board[xCoord + 1][yCoord + 1];

            if (t.bomb){
                nearbyBombs += 1;
            }
            else{
                t.CalculateNearbyBombs(g, board);
            }
        } */
        
        if (nearbyBombs == 0){
            finalC = '0';
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


public class tile {

    private boolean flagged = false;
    private boolean bomb = false;

    public tile(boolean b){
        bomb = b;
    }

    public boolean getBomb(){
        return bomb;
    }

    public boolean getFlagged(){
        return flagged;
    }

    public char getTileChar(game g){
        //Add logic to return different chars dependent on what the tile is!
        if (bomb){
            return g.charBomb;
        }
        return g.charNormal;
    }

    public void setBomb(boolean nBomb){
        bomb = nBomb;
    }

    public void setFlag(boolean nFlag){
        flagged = nFlag;
    }

}

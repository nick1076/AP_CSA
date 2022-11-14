package MinesweeperProject;

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

    public void setBomb(boolean nBomb){
        bomb = nBomb;
    }

    public void setFlag(boolean nFlag){
        flagged = nFlag;
    }

}

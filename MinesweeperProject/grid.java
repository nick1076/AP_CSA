
//Imports
import java.util.Random;

public class grid {

	// Define tile grid, game object, and scaling
	private tile[][] tiles;
	private game main;
	private int xScale;
	private int yScale;

	// Getter method to return private Game object
	public game GetGame() {
		return main;
	}

	// Constructor that sets everything up
	public grid(game g) {
		main = g;
		xScale = main.xScale;
		yScale = main.yScale;

		tiles = new tile[xScale][yScale];
		int cBombs = 0;

		for (int xV = 0; xV < xScale; xV++) {
			for (int yV = 0; yV < yScale; yV++) {
				// Check if we have already placed the max number of bombs
				if (cBombs < main.totalBombCount) {
					int outcome = main.rand.nextInt(2);

					// Decide wether to give tile a bomb
					if (outcome == 0) {
						tiles[xV][yV] = new tile(false, xV, yV, this);
					} else {
						tiles[xV][yV] = new tile(true, xV, yV, this);
						cBombs += 1;
					}
				} else {
					tiles[xV][yV] = new tile(false, xV, yV, this);
				}
			}
		}

		// Call to display layout for the first time
		Display();
	}

	// Method that dispaly board as well as numbering
	public void Display() {

		// Code to generic x values above board
		String xTop = " ";
		println("");
		for (int x = 0; x < xScale; x++) {
			xTop += "   " + x;
		}
		println(xTop);
		println("");

		for (int y = 0; y < yScale; y++) {
			String finalForRow = "" + y;
			for (int x = 0; x < xScale; x++) {
				// Grab this tile's current character based on player interaction
				finalForRow += "   " + tiles[x][y].getTileChar(main, tiles);
			}
			println(finalForRow);
			println("");
		}

		// Check if player has uncovered all bombs
		if (main.win) {
			println("You flagged all of the bombs! You win");
			println("");
		}
	}

	// Handles flagging/digging up location based on cooridantes
	public void uncoverSpot(int x, int y, boolean flag) {
		if (tiles[x][y].uncover(flag) == -1 && !flag) {
			Display();
			println("You dug up a bomb and lost!");
			println("");
			main.onLose();
		} else {
			Display();
			ClearConsole();
			Display();
		}
	}

	// Easier way of printing stuff
	public void print(String p) {
		System.out.print(p);
	}

	// Easier way of printing lines of stuff
	public void println(String p) {
		System.out.println(p);
	}

	// Easy console clear function
	public void ClearConsole() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
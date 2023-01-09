
public class tile {

	// Private vars to control interactions
	private boolean flagged = false;
	private boolean bomb = false;
	private boolean uncovered = false;
	private boolean lookedAt = false;

	// Coordinates of tile in grid
	private int xCoord = 0;
	private int yCoord = 0;

	// Grid parent object
	private grid gr;

	// Constructor to create a tile object
	public tile(boolean b, int x, int y, grid g) {
		bomb = b;
		xCoord = x;
		yCoord = y;
		gr = g;
	}

	// Getter method to return private var
	public boolean getBomb() {
		return bomb;
	}

	// Getter method to return private var
	public boolean getFlagged() {
		return flagged;
	}

	// Getter method to return private var
	public boolean getLookedAt() {
		return lookedAt;
	}

	// Method to handle uncovering tile, returns int based on outcome (dug up bomb
	// w/out flag = -1, flagged/unflagged = 1, dug up & safe = 0)
	public int uncover(boolean flag) {
		if (flag && flagged) {
			if (bomb) {
				gr.GetGame().uncoveredBombs -= 1;
			}
			flagged = false;
			return 1;
		}

		if (flagged && !flag) {
			return 0;
		}

		if (!flag) {
			uncovered = true;
		}

		// Flag non-flagged tile and check if bomb is underneath
		if (flag && !flagged && bomb) {
			gr.GetGame().uncoveredBombs += 1;

			// Check if play has found all hidden bombs in map, if so, player wins
			if (gr.GetGame().uncoveredBombs == gr.GetGame().totalBombCount) {
				// Player wins!
				gr.GetGame().onWin();
			}
		}

		flagged = flag;

		// Check if tile is a bomb and player uncovered tile without a flag
		if (bomb && !flag) {
			uncovered = true;
			return -1;
		}

		return 0;
	}

	// Get tile's char based on what has happened to tile
	public char getTileChar(game g, tile[][] t) {
		// Logic to return different chars dependent on what the tile is!
		if (bomb) {
			if (g.displayBombs || uncovered) {
				if (!flagged) {
					return g.charBomb;
				}
			}
		}

		// Check if flagged by player
		if (flagged) {
			return g.charFlag;
		}

		// Check if uncovered by player but not flagged
		if (uncovered) {
			// Calculate nearby bombs to this tile and return char
			return CalculateNearbyBombs(g, t, false);
		}

		// If none of the cases are true; return default char
		return g.charNormal;
	}

	// Set current tile as a bomb
	public void setBomb(boolean nBomb) {
		bomb = nBomb;
	}

	// Set current tile as a flagged tile
	public void setFlag(boolean nFlag) {
		flagged = nFlag;
	}

	// Used to calculate bombs in nearby tiles
	private char CalculateNearbyBombs(game g, tile[][] board, boolean calledForZeros) {
		int nearbyBombs = 0;
		char finalC = '0';

		// Initialize booleans to check if we are bordering the edge of the map
		boolean bordersXleft = false;
		boolean bordersXright = false;
		boolean bordersYabove = false;
		boolean bordersYbelow = false;

		// Toggle bools accordingly
		if (xCoord == 0) {
			bordersXleft = true;
		}
		if (xCoord == g.xScale - 1) {
			bordersXright = true;
		}

		if (yCoord == 0) {
			bordersYabove = true;
		}
		if (yCoord == g.yScale - 1) {
			bordersYbelow = true;
		}

		// Top Left
		if (!bordersYabove && !bordersXleft) {
			// Check if this tile is a bomb. If so, add to current bombs. If not, also
			// calculate it's nearby bombs and reveal it.
			tile t = board[xCoord - 1][yCoord - 1];

			if (t.bomb) {
				nearbyBombs += 1;
			} else {
				// t.CalculateNearbyBombs(g, board);
			}
		}

		// Top Middle
		if (!bordersYabove) {
			// Check if this tile is a bomb. If so, add to current bombs. If not, also
			// calculate it's nearby bombs and reveal it.
			tile t = board[xCoord][yCoord - 1];

			if (t.bomb) {
				nearbyBombs += 1;
			} else {
				// t.CalculateNearbyBombs(g, board);
			}
		}

		// Top Right
		if (!bordersYabove && !bordersXright) {
			// Check if this tile is a bomb. If so, add to current bombs. If not, also
			// calculate it's nearby bombs and reveal it.
			tile t = board[xCoord + 1][yCoord - 1];

			if (t.bomb) {
				nearbyBombs += 1;
			} else {
				// t.CalculateNearbyBombs(g, board);
			}
		}

		// Middle Right
		if (!bordersXright) {
			// Check if this tile is a bomb. If so, add to current bombs. If not, also
			// calculate it's nearby bombs and reveal it.
			tile t = board[xCoord + 1][yCoord];

			if (t.bomb) {
				nearbyBombs += 1;
			} else {
				// t.CalculateNearbyBombs(g, board);
			}
		}

		// Middle Left
		if (!bordersXleft) {
			// Check if this tile is a bomb. If so, add to current bombs. If not, also
			// calculate it's nearby bombs and reveal it.
			tile t = board[xCoord - 1][yCoord];

			if (t.bomb) {
				nearbyBombs += 1;
			} else {
				// t.CalculateNearbyBombs(g, board);
			}
		}

		// Bottom Left
		if (!bordersYbelow && !bordersXleft) {
			// Check if this tile is a bomb. If so, add to current bombs. If not, also
			// calculate it's nearby bombs and reveal it.
			tile t = board[xCoord - 1][yCoord + 1];

			if (t.bomb) {
				nearbyBombs += 1;
			} else {
				// t.CalculateNearbyBombs(g, board);
			}
		}

		// Bottom Middle
		if (!bordersYbelow) {
			// Check if this tile is a bomb. If so, add to current bombs. If not, also
			// calculate it's nearby bombs and reveal it.
			tile t = board[xCoord][yCoord + 1];

			if (t.bomb) {
				nearbyBombs += 1;
			} else {
				// t.CalculateNearbyBombs(g, board);
			}
		}

		// Bottom Right
		if (!bordersXright && !bordersYbelow) {
			// Check if this tile is a bomb. If so, add to current bombs. If not, also
			// calculate it's nearby bombs and reveal it.
			tile t = board[xCoord + 1][yCoord + 1];

			if (t.bomb) {
				nearbyBombs += 1;
			} else {
				// t.CalculateNearbyBombs(g, board);
			}
		}

		// Based on nearby bombs convert to char
		if (nearbyBombs == 0) {
			finalC = '0';
		} else if (nearbyBombs == 1) {
			finalC = '1';
		} else if (nearbyBombs == 2) {
			finalC = '2';
		} else if (nearbyBombs == 3) {
			finalC = '3';
		} else if (nearbyBombs == 4) {
			finalC = '4';
		} else if (nearbyBombs == 5) {
			finalC = '5';
		} else if (nearbyBombs == 6) {
			finalC = '6';
		} else if (nearbyBombs == 7) {
			finalC = '7';
		} else if (nearbyBombs == 8) {
			finalC = '8';
		}

		// Return nearby bombs as a char
		if (nearbyBombs > 0) {
			// Check if tile has nearby bombs and if so do not alert other tiles
			if (calledForZeros) {
				lookedAt = true;
				uncovered = false;
				return ' ';
			}
			lookedAt = true;
			uncovered = true;
			return finalC;
		}
		lookedAt = true; // --------------------------------------------------------------------
		uncovered = true;
		// Top Left
		if (!bordersYabove && !bordersXleft) {
			tile t = board[xCoord - 1][yCoord - 1];

			if (!t.getLookedAt()) {
				t.CalculateNearbyBombs(g, board, true);
			}
		}

		// Top Middle
		if (!bordersYabove) {
			tile t = board[xCoord][yCoord - 1];

			if (!t.getLookedAt()) {
				t.CalculateNearbyBombs(g, board, true);
			}
		}

		// Top Right
		if (!bordersYabove && !bordersXright) {
			tile t = board[xCoord + 1][yCoord - 1];

			if (!t.getLookedAt()) {
				t.CalculateNearbyBombs(g, board, true);
			}
		}

		// Middle Right
		if (!bordersXright) {
			tile t = board[xCoord + 1][yCoord];

			if (!t.getLookedAt()) {
				t.CalculateNearbyBombs(g, board, true);
			}
		}

		// Middle Left
		if (!bordersXleft) {
			tile t = board[xCoord - 1][yCoord];

			if (!t.getLookedAt()) {
				t.CalculateNearbyBombs(g, board, true);
			}
		}

		// Bottom Left
		if (!bordersYbelow && !bordersXleft) {
			tile t = board[xCoord - 1][yCoord + 1];

			if (!t.getLookedAt()) {
				t.CalculateNearbyBombs(g, board, true);
			}
		}

		// Bottom Middle
		if (!bordersYbelow) {
			tile t = board[xCoord][yCoord + 1];

			if (!t.getLookedAt()) {
				t.CalculateNearbyBombs(g, board, true);
			}
		}

		// Bottom Right
		if (!bordersXright && !bordersYbelow) {
			tile t = board[xCoord + 1][yCoord + 1];

			if (!t.getLookedAt()) {
				t.CalculateNearbyBombs(g, board, true);
			}
		}

		return finalC;

	}

}

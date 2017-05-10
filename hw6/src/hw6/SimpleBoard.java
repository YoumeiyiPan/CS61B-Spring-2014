package hw6;

/* SimpleBoard.java */

/**
 *  Simple class that implements an 8x8 game board with three possible values
 *  for each cell:  0, 1 or 2.
 *
 *  DO NOT CHANGE ANY PROTOTYPES IN THIS FILE.
 **/

public class SimpleBoard {
  private final static int DIMENSION = 8;
  private int[][] grid;

  /**
   *  Invariants:  
   *  (1) grid.length == DIMENSION.
   *  (2) for all 0 <= i < DIMENSION, grid[i].length == DIMENSION.
   *  (3) for all 0 <= i, j < DIMENSION, grid[i][j] >= 0 and grid[i][j] <= 2.
   **/

  /**
   *  Construct a new board in which all cells are zero.
   */

  public SimpleBoard() {
    grid = new int[DIMENSION][DIMENSION];
  }

  /**
   *  Set the cell (x, y) in the board to the given value mod 3.
   *  @param value to which the element should be set (normally 0, 1, or 2).
   *  @param x is the x-index.
   *  @param y is the y-index.
   *  @exception ArrayIndexOutOfBoundsException is thrown if an invalid index
   *  is given.
   **/

  public void setElementAt(int x, int y, int value) {
    grid[x][y] = value % 3;
    if (grid[x][y] < 0) {
      grid[x][y] = grid[x][y] + 3;
    }
  }

  /**
   *  Get the valued stored in cell (x, y).
   *  @param x is the x-index.
   *  @param y is the y-index.
   *  @return the stored value (between 0 and 2).
   *  @exception ArrayIndexOutOfBoundsException is thrown if an invalid index
   *  is given.
   */

  public int elementAt(int x, int y) {
    return grid[x][y];
  }

  /**
   *  Returns true if "this" SimpleBoard and "board" have identical values in
   *    every cell.
   *  @param board is the second SimpleBoard.
   *  @return true if the boards are equal, false otherwise.
   */

  public boolean equals(Object board) {
    // Replace the following line with your solution.  Be sure to return false
    //   (rather than throwing a ClassCastException) if "board" is not
    //   a SimpleBoard.
	  for( int i=0; i<DIMENSION;i++)
		  for(int j=0; j<DIMENSION;j++){
			  if(elementAt(i,j)==((SimpleBoard)board).elementAt(i, j)){
				  return true;
			  }
		  }
    return false;
  }

  /**
   *  Returns a hash code for this SimpleBoard.
   *  @return a number between Integer.MIN_VALUE and Integer.MAX_VALUE.
   */

  public int hashCode() {
	    // Replace the following line with your solution.
	    // view this 8*8 as a 3-based 64 bits integer and convert it to 32-bits
	    // integer allowing overflow
	    // 1st-bit (highest bit) is (0,0), 2nd-bit is (0,1), ..., 
	    // 63th-bit is (7,6),64th-bit (lowest bit) is (7,7)    int hashCode = 0;
	    int code = 0;
	    for (int i = 0; i < DIMENSION; i++) {
	      for (int j = 0; j <DIMENSION; j++) {
	        code = 3 * code + elementAt(i, j);
	      }
	    }
	    return code;
	  }

  public static void main(String[] args) {
	    SimpleBoard board = new SimpleBoard();
	    System.out.println("hash code of new board should be 0, is: "+board.hashCode());
	    board.setElementAt(7,7,2);
	    System.out.println("hash code of new board should be 2, is: "+board.hashCode());
	    board.setElementAt(7,6,1);
	    System.out.println("hash code of new board should be 5, is: "+board.hashCode());
	  }

}
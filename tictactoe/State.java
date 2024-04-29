//
package tictactoe;

/**
 * Tic-Tac-Toe state variables.
 */
public class State
{
    private int gameState = Constants.STANDBY;
    private int whoseMove = Constants.X;
    private String xName = "";
    private String oName = "";
    private int[][] board = new int[Constants.BOARD_SIZE_ROW][Constants.BOARD_SIZE_COLUMN]; //list

    public boolean isWinner() {   //method for winning conditions-row(horizontal)
        int total;
        for (int row = 0; row < Constants.BOARD_SIZE_ROW; row++) { //iterates through cells
            for (int col = 0; col < Constants.BOARD_SIZE_COLUMN - 3; col++) {
                total = getBoardCell(row, col) + getBoardCell(row, col + 1) +  //calls on getBoardCell
                            getBoardCell(row, col + 2) + getBoardCell(row, col + 3);
                if (total == 4 || total == -4) {  //4=0, -4=X
                    return true; 
                }
            }
        }
        for (int row = 0; row < Constants.BOARD_SIZE_ROW - 3; row++) {  //vertically
            for (int col = 0; col < Constants.BOARD_SIZE_COLUMN; col++) {
                total = getBoardCell(row, col) + getBoardCell(row + 1, col) +
                            getBoardCell(row + 2, col) + getBoardCell(row + 3, col);
                if (total == 4 || total == -4) {
                    return true; 
                }
            }
        }
        for (int row = 3; row < Constants.BOARD_SIZE_ROW; row++) {   //bottom left to top right
            for (int col = 0; col < Constants.BOARD_SIZE_COLUMN - 3; col++) {
                total = getBoardCell(row, col) + getBoardCell(row - 1, col + 1) +
                            getBoardCell(row - 2, col + 2) + getBoardCell(row - 3, col + 3);
                if (total == 4 || total == -4) {
                    return true; 
                }
            }
         }
         for (int row = 0; row < Constants.BOARD_SIZE_ROW - 3; row++) { //top left to bottom right
            for (int col = 0; col < Constants.BOARD_SIZE_COLUMN - 3; col++) {
                total = getBoardCell(row, col) + getBoardCell(row + 1, col + 1) +
                            getBoardCell(row + 2, col + 2) + getBoardCell(row + 3, col + 3);
                if (total == 4 || total == -4) {
                    return true; 
                }
            }
        }
        return false;
    }

    public boolean isTie() {
        for (int row=0; row<Constants.BOARD_SIZE_ROW; row++) {
            for (int col=0; col<Constants.BOARD_SIZE_COLUMN; col++) {
                if (getBoardCell(row,col) == Constants.BLANK) {
                    return false;
                }
            }
        }
        return true;
     }

    public int dropChecker(int col) {
        for (int row = Constants.BOARD_SIZE_ROW-1; row >= 0; row--) {
            if (board[row][col-1] == Constants.BLANK) {
                board[row][col-1] = whoseMove;
                return row +1;
            }
        }
        return -1;
    }
    public int getGameState() {
        return gameState;
    }

    public void setGameState(int gameState) {
        this.gameState = gameState;
    }

    public int getWhoseMove() {
        return whoseMove;
    }

    public void setWhoseMove(int whoseMove) {
        this.whoseMove = whoseMove;
    }

    public String getXName() {
        return xName;
    }

    public void setXName(String xName) {
        this.xName = xName;
    }

    public String getOName() {
        return oName;
    }

    public void setOName(String oName) {
        this.oName = oName;
    }

    public int getBoardCell(int row, int col) {
        return this.board[row][col];
    }

    public void setBoardCell(int row, int col, int value) {
       if (row >= 0 && row < Constants.BOARD_SIZE_ROW && col >= 0 && col < Constants.BOARD_SIZE_COLUMN) {
        this.board[row][col] = value;
    
    }
    }

    public void clearBoard() {
        for (int row = 0; row < Constants.BOARD_SIZE_ROW; row++) {
        for (int col = 0; col < Constants.BOARD_SIZE_COLUMN; col++) {
            setBoardCell(row, col, Constants.BLANK);
        }
    }
     }
}

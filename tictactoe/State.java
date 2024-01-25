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
    private int[][] board = new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
    
    public int getGameState() {
        return this.gameState;
    }

    public void setGameState(int gameState) {
        this.gameState = gameState;
    }

    public int getWhoseMove() {
        return this.whoseMove;
    }
    
    public void setWhoseMove(int whoseMove) {
        this.whoseMove = whoseMove;
    }
    
    public String getXName() {
        return this.xName;
    }
    
    public void setXName(String xName) {
        this.xName = xName;   
    }
    
    public String oName() {
        return this.oName;
    }
    
    public void setOName(String oName) {
        this.oName = oName;
    }
    public int getBoardCell(int row, int col) {
	    return this.board[row][col];
	}

    public void setBoardCell(int row, int col, int value) {
	    this.board[row][col] = value;
	}
    
    
}
    


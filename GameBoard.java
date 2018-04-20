public class GameBoard implements GameBoardView 
{
   private int[][] board;
   public GameBoard() 
   {
         board = new int[3][3];
         for (int i = 0; i < 3; i++) 
               for (int j = 0; j < 3; j++) {
                     board.clone()[i][j] = 0;
               }
   }

   public int getPlayer(int row, int col) 
   {
    return board[row][col];
   }
   
   public void setPlayer(int row, int col, int player) 
   {
         board[row][col] = player;
   }
   
	/** 
	 * Creates a new memento for undo use
	 * @returns return GameMemento
	 */
	public GameMemento createMemento() {
		GameMemento gm = new GameMemento();
		gm.setState(board);
		return gm;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setMemento(GameMemento gm) {
		int[][] copiedBoard = gm.getState();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = copiedBoard[i][j];
			}
		}
	}
}

 
public class GameLogic extends GameSubject 
{
   private int gameStatus = GameStatus.gameContinue;
   private GameReferee referee;
   private GameBoard gameBoard;
   private static GameLogic instance;
   
   private GameLogic() 
   {
   }

   /*
    * Returns a singleton of GameLogic
    * @returns a GameLogic singleton
    */
   public static GameLogic getInstance() {
	   if (instance == null) {
		   instance = new GameLogic();
		   instance.setupGameBoard();
	   }
	   return instance;
   }
   
   /*
    * sets up the singleton with the required steps from the old constructor
    */
   private void setupGameBoard() {
	   GameBoardFactory factory = new GameBoardFactory();
	   gameBoard = (GameBoard) factory.createBoard(1);
       referee = new GameReferee(gameBoard);
   }

   public void makeMove(int row, int col, int player) 
   {
          int status = referee.checkLegalMove(row, col, player);
          if (status != 0) {
            gameStatus = GameStatus.illegalMove;
          } else {
            gameBoard.setPlayer(row, col, player);
            gameStatus = referee.checkGameStatus();
            notifyObservers();
          }
   }
   
   public int getPlayer(int row, int col) 
   {
    return gameBoard.getPlayer(row, col);
   }
   
   public GameMemento createMemento() {
	   return gameBoard.createMemento();
   }
   
   public void setMemento(GameMemento gm) {
	   gameBoard.setMemento(gm);
   }
   
   public GameBoardView getGameBoard() 
   {
    return gameBoard;
   }

   public void setStateUndo() {
	   gameStatus = GameStatus.undoMove;
   }
   
   public int getGameStatus() 
   {
    return gameStatus;
   }
}

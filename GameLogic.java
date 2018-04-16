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
	   gameBoard = new GameBoard();
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

   public GameBoardView getGameBoard() 
   {
    return gameBoard;
   }

   public int getGameStatus() 
   {
    return gameStatus;
   }
}

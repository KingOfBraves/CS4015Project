public class GameReferee 
{
   private GameBoardView gameBoard;
   private GameLogic logic = GameLogic.getInstance();
   public int checkLegalMove(int row, int col, int player) 
   {
	   	 if(row == 3)
	   		 return 5;
         return gameBoard.getPlayer(row, col);
   }
   
   public int checkGameStatus() 
   {
	   	CheckingGameStatus statusCheck = new CheckingGameStatus(gameBoard);
	   	statusCheck.setBehaviour(new CheckWinBehaviour());
        int playerId = statusCheck.checkStatus();
        if (playerId == 1) return GameStatus.player1Win;
        if (playerId == 2) return GameStatus.player2Win;
        statusCheck.setBehaviour(new CheckTieBehaviour());
        int status = statusCheck.checkStatus();
        if (status == GameStatus.tie) return GameStatus.tie;
        return GameStatus.gameContinue;
   }

   public GameReferee(GameBoardView gameBoard) 

   {

         this.gameBoard = gameBoard;

   }

}

 
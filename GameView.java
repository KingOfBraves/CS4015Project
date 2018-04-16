public abstract class GameView implements GameObserver 
{
   private GameLogic model;
   public GameView() 
   {
         this.model = GameLogic.getInstance();
         model.attach(this);
   }
   
   protected abstract void displayGameBoard(GameBoardView gameBoard);

   public void displayMessage(String message) 
   {
         System.out.println(message);
   }

   public void update() 
   {
         int status = model.getGameStatus();
         if (status != GameStatus.illegalMove) {
               GameBoardView board = model.getGameBoard();
               displayGameBoard(board);
               String message = "";
               switch(status) {
                        case GameStatus.gameContinue: 
                         message = "Game Continue"; break;
                        case GameStatus.player1Win: 
                         message = "Player 1 Won!"; break;
                        case GameStatus.player2Win: 
                         message = "Player 2 Won!"; break;
                        case GameStatus.tie: 
                         message = "It is a tie!"; break;
               }
               displayMessage(message);
         }
   }
}

 
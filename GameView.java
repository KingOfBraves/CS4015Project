public class GameView implements GameObserver 
{
   private GameLogic model;
   public GameView() 
   {
         this.model = GameLogic.getInstance();
         model.attach(this);
   }
   
   private void displayGameBoard(GameBoardView gameBoard) 
   {
         for (int row = 0; row < 3; row++) {
               for (int col = 0; col < 3; col++) {
                     int playerId = gameBoard.getPlayer(row, col);
                     switch (playerId) {
                              case 0: System.out.print("*"); break; 
                              case 1: System.out.print("X"); break; 
                              case 2: System.out.print("O"); break; 
                     }
                     System.out.print(" ");
               }
               System.out.println();
         }
   }

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

 
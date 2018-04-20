
public class GameViewDashDecorator extends GameView{
	
	protected void displayGameBoard(GameBoardView gameBoard) 
	   {
	         for (int row = 0; row < 3; row++) {
	               for (int col = 0; col < 3; col++) {
	                     int playerId = gameBoard.getPlayer(row, col);
	                     switch (playerId) {
	                              case 0: System.out.print("*"); break; 
	                              case 1: System.out.print("1"); break; 
	                              case 2: System.out.print("2"); break; 
	                     }
	                     System.out.print(" ");
	               }
	               System.out.println();
	         }
	   }
}

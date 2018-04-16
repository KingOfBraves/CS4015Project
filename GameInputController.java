import java.util.Scanner;

public class GameInputController implements GameObserver 
{
   private int currentPlayer = 1;
   private int inputRow;
   private int inputCol;
   private boolean gameEnd = false;
   private boolean undo = false; // control variable for when user selects undo
   private GameLogic model;
   private GameView view;
   private Stack commandStack = new Stack();

   public GameInputController(GameView view) 
   {
         this.view = view;
         this.model = GameLogic.getInstance();
         model.attach(this);
   }

   public void control() 
   {
         view.displayMessage("Game Starts.");
         view.update();
         while (!gameEnd) {
               view.displayMessage("Player " + currentPlayer + "'s turn.");
               getUserMove();
               if (!undo) {
            	   GameCommand gc = new PlaceCommand(inputRow, inputCol, currentPlayer);
                   gc.execute();
                   commandStack.push(gc);
               }
               else if (undo) {
            	   model.setStateUndo();
            	   view.displayMessage("Undoing last move");
            	   GameCommand gc = commandStack.pop();
            	   gc.unexecute();
            	   currentPlayer = currentPlayer==1?2:1;
            	   undo = false;
               }
               commandStack.printStack();
         }
   }

   public void update() 
   {
         int status = model.getGameStatus();
         switch (status) {
                  case GameStatus.illegalMove: 
                        view.displayMessage("Illegal move. Input again.");
                        getUserMove();
    					GameCommand gc = new PlaceCommand(inputRow, inputCol, currentPlayer);
    					gc.execute();
    					commandStack.push(gc);
                        break;
                  case GameStatus.gameContinue:
                	  currentPlayer = currentPlayer==1?2:1;
                	  break;
              default: 
                  gameEnd = true;
         }
   }

   private void getUserMove() 
   {
         Scanner scanner = new Scanner(System.in);
         while (true) {
                view.displayMessage("Enter row number (0-2), or 3 to undo last move: ");
                inputRow = scanner.nextInt();
                if (inputRow == 3) {
                	undo = true;
                	break;
                }
                view.displayMessage("Enter column number (0-2): ");
                inputCol = scanner.nextInt();
                if (inputRow >= 0 && inputRow < 3 && inputCol >= 0 
                   && inputCol <3) break;
                view.displayMessage("Input error. Input again.");
         }
   }
}

 


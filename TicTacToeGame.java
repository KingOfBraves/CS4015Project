import java.util.Scanner;

public class TicTacToeGame 
{
   public static void main(String[] args) 
   {
	   	AbstractDecoratorMaker maker = new AbstractDecoratorMaker();
	   	GameView view = maker.createView();
         GameInputController controller = 
            new GameInputController(view);
         controller.control();
   }
}

 
 


 




 




 




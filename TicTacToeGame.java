import java.util.Scanner;

public class TicTacToeGame 
{
   public static void main(String[] args) 
   {
	   	Scanner sc = new Scanner(System.in);
	   	System.out.println("What game view do you want(invalid input goes to 1): \n1 * X O\n2 - X O\n3 * 1 2\n");
	   	String input = "";
	   	GameViewFactory factory= new GameViewFactory();
	   	input = sc.next();
	   	GameView view = factory.getView(input);
         GameInputController controller = 
            new GameInputController(view);
         controller.control();
   }
}

 
 


 




 




 




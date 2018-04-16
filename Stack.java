import java.util.ArrayList;

public class Stack {
	private ArrayList<GameCommand> gCommand = new ArrayList<GameCommand>();
	
	public GameCommand pop() {
		return gCommand.remove(0);
	}
	
	public void push(GameCommand gCommand) {
		this.gCommand.add(0, gCommand);
	}
	
	public void printStack() {
		System.out.println("Printing command stack");
		for (GameCommand gc : gCommand) {
			gc.printContents();
		}
	}
	
	public boolean isEmpty() {
		if (gCommand.isEmpty())
			return true;
		return false;
	}
}

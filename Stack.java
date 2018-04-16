import java.util.ArrayList;

public class Stack {
	private ArrayList<GameCommand> gCommand = new ArrayList<GameCommand>();
	
	public GameCommand pop() {
		return gCommand.remove(0);
	}
	
	public void push(GameCommand gCommand) {
		this.gCommand.add(0, gCommand);
	}
}

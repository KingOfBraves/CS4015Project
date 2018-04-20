
public class PlaceCommand extends GameCommand implements Cloneable{

	private GameBoard gb;
	private int inputRow;
	private int inputCol;
	private int currentPlayer;
	
	private GameMemento gMemento;
	
	public PlaceCommand(int inputRow, int inputCol, int currentPlayer) {
		this.inputCol = inputCol;
		this.inputRow = inputRow;
		this.currentPlayer = currentPlayer;
	}

	@Override
	public void execute() {
		GameLogic model = GameLogic.getInstance();
		gMemento = model.createMemento();
		model.makeMove(inputRow, inputCol, currentPlayer);
	}

	@Override
	public void unexecute() {
		GameLogic model = GameLogic.getInstance();
		model.setMemento(gMemento);
	}
	
	public void printContents() {
		System.out.println(currentPlayer + ": " + inputRow + ", " + inputCol);
	}

	@Override
	public GameCommand clone() throws CloneNotSupportedException {
		return (PlaceCommand) super.clone();
	}

}

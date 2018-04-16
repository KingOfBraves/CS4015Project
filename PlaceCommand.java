
public class PlaceCommand extends GameCommand{

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
		this.gb = (GameBoard) model.getGameBoard();
		gMemento = gb.createMemento();
		model.makeMove(inputRow, inputCol, currentPlayer);
	}

	@Override
	public void unexecute() {
		gb.setMemento(gMemento);
	}
	
	public void printContents() {
		System.out.println(currentPlayer + ": " + inputRow + ", " + inputCol);
	}

}
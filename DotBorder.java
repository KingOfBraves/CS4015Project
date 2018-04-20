
public class DotBorder extends GameView{
	protected GameView observer;
	public DotBorder(GameView observer) {
		this.observer = observer;
	}
	
	public void displayGameBoard(GameBoardView board) {
		System.out.println(".....");
		observer.displayGameBoard(board);
		System.out.println(".....");
	}
}

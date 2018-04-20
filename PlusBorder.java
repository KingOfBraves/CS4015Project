
public class PlusBorder extends GameView{
	protected GameView observer;
	public PlusBorder(GameView observer) {
		this.observer = observer;
	}
	
	public void displayGameBoard(GameBoardView board) {
		System.out.println("+++++");
		observer.displayGameBoard(board);
		System.out.println("+++++");
	}
}

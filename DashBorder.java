
public class DashBorder extends GameView{
	protected GameView observer;
	public DashBorder(GameView observer) {
		this.observer = observer;
	}
	
	public void displayGameBoard(GameBoardView board) {
		System.out.println("-----");
		observer.displayGameBoard(board);
		System.out.println("-----");
	}
}

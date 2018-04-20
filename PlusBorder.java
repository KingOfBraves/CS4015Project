
public class PlusBorder extends GameView{
	protected GameView observer;
	public PlusBorder(GameView observer) {
		this.observer = observer;
	}
	
	public void displayGameBoard() {
		System.out.println("+++++");
		observer.displayGameBoard();
		System.out.println("+++++");
	}
}

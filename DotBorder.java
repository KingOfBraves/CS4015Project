
public class DotBorder extends GameView{
	protected GameView observer;
	public DotBorder(GameView observer) {
		this.observer = observer;
	}
	
	public void displayGameBoard() {
		System.out.println(".....");
		observer.displayGameBoard();
		System.out.println(".....");
	}
}

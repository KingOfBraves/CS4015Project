
public class DashBorder extends GameView{
	protected GameView observer;
	public DashBorder(GameView observer) {
		this.observer = observer;
	}
	
	public void displayGameBoard() {
		System.out.println("-----");
		observer.displayGameBoard();
		System.out.println("-----");
	}
}

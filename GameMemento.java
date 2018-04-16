import java.util.ArrayList;

public class GameMemento {
	private int[][] board;
	public int[][] getState() {
		return board;
	}
	public void setState(int[][] state) {
		this.board = state;
	}
}

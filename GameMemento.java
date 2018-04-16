
public class GameMemento {
	private int[][] board = new int[3][3];
	public int[][] getState() {
		return board;
	}
	public void setState(int[][] state) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = state[i][j];
			}
		}
		
	}
}


public class CheckRequest {
	private GameBoardView board;
	public CheckRequest(GameBoardView board) {
		this.board = board;
	}
	
	public GameBoardView getBoard() {
		return board;
	}
}

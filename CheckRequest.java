
public class CheckRequest {
	private GameBoardView board;
	public CheckRequest() {
		GameLogic logic = GameLogic.getInstance();
		this.board = logic.getGameBoard();
	}
	
	public GameBoardView getBoard() {
		return board;
	}
}

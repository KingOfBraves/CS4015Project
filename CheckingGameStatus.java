
public class CheckingGameStatus {
	CheckBehaviour behaviour;
	GameBoardView board;
	
	public CheckingGameStatus(GameBoardView board) {
		this.board = board;
	}
	
	public void setBehaviour(CheckBehaviour behaviour) {
		this.behaviour = behaviour;
	}
	
	public CheckBehaviour getBehaviour() {
		return behaviour;
	}
	
	public int checkStatus() {
		return behaviour.checkCommand(board);
	}
}

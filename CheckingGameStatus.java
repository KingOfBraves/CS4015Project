
public class CheckingGameStatus {
	CheckBehaviour behaviour;
	
	public CheckingGameStatus() {
	}
	
	public void setBehaviour(CheckBehaviour behaviour) {
		this.behaviour = behaviour;
	}
	
	public CheckBehaviour getBehaviour() {
		return behaviour;
	}
	
	public int checkStatus() {
		return behaviour.checkCommand();
	}
}

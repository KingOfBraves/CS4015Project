
public abstract class WinCheckHandler {
	protected WinCheckHandler successor;
	public void setSuccessor(WinCheckHandler successor) {
		this.successor = successor;
	}
	
	public abstract int handleRequest(CheckRequest request);
}

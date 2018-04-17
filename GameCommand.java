public abstract class GameCommand implements Cloneable{
	public abstract void execute();
	public abstract void unexecute();
	public abstract void printContents();
	public GameCommand clone() throws CloneNotSupportedException {
		return (GameCommand) super.clone();
	}
}

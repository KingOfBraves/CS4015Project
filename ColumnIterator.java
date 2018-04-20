
public class ColumnIterator implements BoardIterator {

	private int row = 0;
	private int col = 0;
	private GameLogic logic;
	
	public ColumnIterator(int col) {
		this.col = col;
		logic = GameLogic.getInstance();
	}
	
	@Override
	public void first() {
		row = 0;
	}

	@Override
	public void next() {
		row++;
	}

	@Override
	public boolean isDone() {
		if (row >= 3)
			return true;
		return false;
	}

	@Override
	public int getElement() {
		return logic.getPlayer(row, col);
	}

}

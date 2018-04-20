
public class RowIterator implements BoardIterator {

	private int row = 0;
	private int col = 0;
	private GameLogic logic;
	
	public RowIterator(int row) {
		logic = GameLogic.getInstance();
		this.row = row;
	}
	
	@Override
	public void first() {
		col = 0;
	}

	@Override
	public void next() {
		col++;
	}

	@Override
	public boolean isDone() {
		if (col >= 3)
			return true;
		return false;
	}

	@Override
	public int getElement() {
		return logic.getPlayer(row, col);
	}

}

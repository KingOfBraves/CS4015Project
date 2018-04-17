
public class ColumnIterator implements BoardIterator {

	private int row = 0;
	private int col = 0;
	private GameBoardView board;
	
	public ColumnIterator(GameBoardView board, int col) {
		this.board = board;
		this.col = col;
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
		return board.getPlayer(row, col);
	}

}

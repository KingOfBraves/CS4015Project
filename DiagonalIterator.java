
public class DiagonalIterator implements BoardIterator {

	private int row = 0;
	private int col = 0;
	private int opp = 2;
	private GameLogic logic;
	
	public DiagonalIterator(int row) {
		logic = GameLogic.getInstance();
		this.row = row;
		if (this.row == 2)
			this.opp = 0;
	}
	
	@Override
	public void first() {
		col = 0;
	}

	@Override
	public void next() {
		col++;
		row = opp==2?row+1:row-1;
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

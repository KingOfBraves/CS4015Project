
public class WinCheckHandlerDiagonal extends WinCheckHandler{

	public int handleRequest(CheckRequest request) {
		BoardIterator iter;
		BoardVisitor visitor;
		for (int row = 0; row <= 2; row+=2) {
			iter = new DiagonalIterator(row);
			visitor = new WinVisitor();
			while(!iter.isDone()) {
				 visitor.visit(iter.getElement());
				 iter.next();
			}
			if (visitor.getResult() != 0)
				return visitor.getResult();
		}
		if (successor != null)
			return successor.handleRequest(request);
		else
			return 0;
	}
}

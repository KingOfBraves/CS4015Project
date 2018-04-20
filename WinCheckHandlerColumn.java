
public class WinCheckHandlerColumn extends WinCheckHandler{

	public int handleRequest(CheckRequest request) {
		BoardIterator iter;
		BoardVisitor visitor;
		for (int col = 0; col < 3; col++) {
			iter = new ColumnIterator(col);
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

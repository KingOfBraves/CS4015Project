
public class WinCheckHandlerRow extends WinCheckHandler{

	public int handleRequest(CheckRequest request) {
		BoardIterator iter;
		BoardVisitor visitor;
		for (int row = 0; row < 3; row++) {
			iter = new RowIterator(row);
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

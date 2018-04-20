class CheckWinBehaviour implements CheckBehaviour{
	public int checkCommand() {
		// Setting up handlers for chain of responsibility
		   WinCheckHandler rowHandler = new WinCheckHandlerRow();
		   WinCheckHandler colHandler = new WinCheckHandlerColumn();
		   WinCheckHandler diagHandler = new WinCheckHandlerDiagonal();
		   
		   rowHandler.setSuccessor(colHandler);
		   colHandler.setSuccessor(diagHandler);
		   
		   return rowHandler.handleRequest(new CheckRequest());
	}
}

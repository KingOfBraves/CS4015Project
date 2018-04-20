
public class WinVisitor implements BoardVisitor {

	int count = 0;
	int playerId = -10;
	
	@Override
	public void visit(int player) {
		if (playerId == -10)
			playerId = player;
		if (player == playerId) {
			count++;
		}
	}

	@Override
	public int getResult() {
		 if (count == 3 && playerId != 0) 
			 return playerId;
		 else
			 return 0;
	}

}

class CheckTieBehaviour implements CheckBehaviour{
	public int checkCommand() {
		GameLogic logic = GameLogic.getInstance();
		for (int row = 0; row < 3; row++) {
            int[] counts = new int[3];
            for (int col = 1; col < 3; col++ ) {
                  int playerId = logic.getPlayer(row, col);
                  counts[playerId]++;
            }
            for (int i = 0; i < 3; i++) {
                  if (counts[0] >= 2) return -1;
                  if ((counts[1] == 2 || counts[2] == 2) 
                    && counts[0] == 1) return -1;
            }
      }
      for (int col = 0; col < 3; col++) {
            int[] counts = new int[3];
            for (int row = 1; row < 3; row++ ) {
                  int playerId = logic.getPlayer(row, col);
                  counts[playerId]++;
            }
            for (int i = 0; i < 3; i++) {
                  if (counts[0] >= 2) return -1;
                  if ((counts[1] == 2 || counts[2] == 2) 
                      && counts[0] == 1) return -1;
            }
      }
      for (int row = 0; row < 3; row++) {
            int[] counts = new int[3];
            int playerId = logic.getPlayer(row, row);
            counts[playerId]++;
            for (int i = 0; i < 3; i++) {
                  if (counts[0] >= 2) return -1;
                  if ((counts[1] == 2 || counts[2] == 2) 
                   && counts[0] == 1) return -1;
            }
      }
      for (int row = 0; row < 3; row++) {
            int[] counts = new int[3];
            int playerId = logic.getPlayer(row, 2-row);
            counts[playerId]++;
            for (int i = 0; i < 3; i++) {
                  if (counts[0] >= 2) return -1;
                  if ((counts[1] == 2 || counts[2] == 2) 
                  && counts[0] == 1) return -1;
            }
      }
      return GameStatus.tie;
	}
}

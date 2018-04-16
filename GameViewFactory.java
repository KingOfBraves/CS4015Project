
public class GameViewFactory {
	public GameView getView(String viewType) {
		if (viewType.equals("2"))
			return new GameViewDashDecorator();
		else if (viewType.equals("3"))
			return new GameViewPlayerDecorator();
		return new GameViewDefaultDecorator();
		
	}
}

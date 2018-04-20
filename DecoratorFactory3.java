public class DecoratorFactory3 extends GameViewFactory{
	public GameView getBorder(GameView observer) {
		return new DotBorder(observer);
	}
	
	public GameView getBoardStyle() {
		return new GameViewPlayerDecorator();
	}
}

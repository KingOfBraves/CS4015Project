public class DecoratorFactory1 extends GameViewFactory{
	public GameView getBorder(GameView observer) {
		return new DashBorder(observer);
	}
	
	public GameView getBoardStyle() {
		return new GameViewDefaultDecorator();
	}
}

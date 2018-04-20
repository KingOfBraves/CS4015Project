public class DecoratorFactory2 extends GameViewFactory{
	public GameView getBorder(GameView observer) {
		return new PlusBorder(observer);
	}
	
	public GameView getBoardStyle() {
		return new GameViewDashDecorator();
	}
}

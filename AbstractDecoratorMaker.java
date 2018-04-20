import java.util.Scanner;

public class AbstractDecoratorMaker {
	public GameView createView() {
		Scanner sc = new Scanner(System.in);
		GameView view;
		GameViewFactory factory;
		System.out.println("What game view do you want(invalid input goes to 1): \n1 * X O\n2 - X O\n3 * 1 2\n");
		String viewType = sc.next();
		if (viewType.equals("2")) {
			factory = new DecoratorFactory2();
			view = factory.getBoardStyle();
		}
		else if (viewType.equals("3")) {
			factory = new DecoratorFactory3();
			view = factory.getBoardStyle();
		}
		else {
			factory = new DecoratorFactory1();
			view = factory.getBoardStyle();
		}
		System.out.println("What board border do you want(default is 1): \n1 none O\n2 ----- \n3 +++++ \n4 .....");
		viewType = sc.next();
		if (viewType.equals("2")) {
			factory = new DecoratorFactory1();
			view = factory.getBorder(view);
		}
		else if (viewType.equals("3")) {
			factory = new DecoratorFactory2();
			view = factory.getBorder(view);
		}
		else if (viewType.equals("4")){
			factory = new DecoratorFactory3();
			view = factory.getBorder(view);
		}
		return view;
	}
}

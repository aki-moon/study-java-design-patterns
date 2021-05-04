package dessignpattern.bridge;

public class Main {

	public static void main(String[] args) {
		Display display1 = new Display(new StringDisplayImpl("Hello, Japan."));
		Display display2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
		CountDisplay display3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
		RandomCountDisplay display4 = new RandomCountDisplay(new StringDisplayImpl("Hello, China"));
		String filePath = System.getProperty("user.dir") + "\\src\\bridge\\";
		CountDisplay display5 = new CountDisplay(new FileDisplayImpl(filePath + "sample.txt"));
		IncreaseDisplay display6 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
		IncreaseDisplay display7 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'), 2);
		display1.display();
		display2.display();
		display3.display();
		display3.multiDisplay(5);
		display4.randomDisplay(8);
		display5.multiDisplay(3);
		display6.increaseDisplay(4);
		display7.increaseDisplay(6);
	}

}

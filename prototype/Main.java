package dessignpattern.prototype;

import dessignpattern.prototype.framework.Manager;
import dessignpattern.prototype.framework.Product;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		UnderLinePen underLinePen = new UnderLinePen('~');
		MessageBox astarixBox = new MessageBox('*');
		MessageBox slashBox = new MessageBox('/');
		manager.register("strong message", underLinePen);
		manager.register("warning box", astarixBox);
		manager.register("slash box", slashBox);

		Product product1 = manager.create("strong message");
		product1.use("Hello, World");
		Product product2 = manager.create("warning box");
		product2.use("Hello, World");
		Product product3 = manager.create("slash box");
		product3.use("Hello, World");

	}

}

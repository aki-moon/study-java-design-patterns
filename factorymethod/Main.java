package dessignpattern.factorymethod;

import dessignpattern.factorymethod.framework.Factory;
import dessignpattern.factorymethod.framework.Product;
import dessignpattern.factorymethod.idcard.IDCardFactory;

public class Main {
	public static void main(String args[]) {
		Factory factory = new IDCardFactory();
		Product cardForYuki = factory.create("結城浩");
		Product cardForTomura = factory.create("とむら");
		Product cardForSato = factory.create("佐藤花子");
		cardForYuki.use();
		cardForTomura.use();
		cardForSato.use();
	}
}

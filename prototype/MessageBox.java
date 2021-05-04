package dessignpattern.prototype;

import dessignpattern.prototype.framework.Product;

public class MessageBox extends Product {
	private char decoChar;

	public MessageBox(char decochar) {
		this.decoChar = decochar;
	}

	@Override
	public void use(String use) {
		int length = use.getBytes().length;
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decoChar);
		}
		System.out.println("");
		System.out.println(decoChar + " " + use + "" + decoChar);
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decoChar);
		}
		System.out.println("");
	}

}

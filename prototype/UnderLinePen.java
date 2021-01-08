package prototype;

import prototype.framework.Product;

public class UnderLinePen implements Product {

	private char ulchar;


	public UnderLinePen(char ulchar) {
		super();
		this.ulchar = ulchar;
	}
	@Override
	public void use(String use) {
		int length = use.getBytes().length;
		System.out.println("\"" + use + "\"");
		System.out.print(" ");
		for (int i = 0; i < length; i++) {
			System.out.print(ulchar);
		}
		System.out.println("");
	}

	@Override
	public Product createClone() {
		Product product = null;
		try {
			product = (Product) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return product;
	}

}

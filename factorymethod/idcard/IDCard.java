package dessignpattern.factorymethod.idcard;

import dessignpattern.factorymethod.framework.Product;

public class IDCard extends Product {
	private String owner;
	private int serialNumber;

	IDCard(String owner, int serialNumber) {
		System.out.println("No" + serialNumber + ":" + owner + "のカードを作ります");
		this.owner = owner;
		this.serialNumber = serialNumber;
	}

	@Override
	public void use() {
		System.out.println("No" + serialNumber + ":" + owner + "のカードを使います");
	}

	public String getOwner() {
		return owner;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

}

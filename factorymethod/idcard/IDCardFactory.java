package factorymethod.idcard;

import java.util.HashMap;
import java.util.Map;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;

public class IDCardFactory extends Factory {
	private int initialSerialNumber = 0;
	private Map<Integer, String> idCardData = new HashMap<Integer, String>();

	public IDCardFactory() {
		super();
	}

	@Override
	protected void registerProduct(Product product) {
		IDCard card = (IDCard) product;
		idCardData.put(card.getSerialNumber(), card.getOwner());
	}

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner, initialSerialNumber++);
	}

	public Map<Integer, String> getIdCardData() {
		return idCardData;
	}

}

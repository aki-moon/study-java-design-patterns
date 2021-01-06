package factorymethod.idcard;

import java.util.ArrayList;
import java.util.List;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;

public class IDCardFactory extends Factory {
	private List<Product> owners = new ArrayList<Product>();

	public IDCardFactory() {
		super();
	}

	@Override
	protected void registerProduct(Product product) {
		owners.add(product);
	}

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	public List<Product> getOwners() {
		return owners;
	}

}

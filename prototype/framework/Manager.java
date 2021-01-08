package prototype.framework;

import java.util.HashMap;

public class Manager {
	private HashMap<String, Product> showCase = new HashMap<String, Product>();

	public void register(String name, Product prototype) {
		showCase.put(name, prototype);
	}

	public Product create(String protoName) {
		Product product = showCase.get(protoName);
		return product.createClone();
	}
}

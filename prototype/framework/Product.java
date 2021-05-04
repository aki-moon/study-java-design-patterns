package dessignpattern.prototype.framework;

public abstract class Product implements Cloneable {
	public abstract void use(String use);

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

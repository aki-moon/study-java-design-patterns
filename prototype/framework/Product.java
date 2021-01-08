package prototype.framework;

public interface Product extends Cloneable {
	public abstract void use(String use);

	public abstract Product createClone();
}

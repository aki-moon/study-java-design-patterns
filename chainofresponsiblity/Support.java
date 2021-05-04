package dessignpattern.chainofresponsiblity;

public abstract class Support {
	private String name;
	private Support next;

	public Support(String name) {
		super();
		this.name = name;
	}

	public Support setNext(Support next) {
		this.next = next;
		return next;
	}

	public final void support(Trouble trouble) {
		for (Support object = this; true; object = object.next) {
			if (object.resolve(trouble)) {
				object.done(trouble);
				break;
			} else if (object.next == null) {
				object.fail(trouble);
				break;
			}
		}
	}

	private void fail(Trouble trouble) {
		System.out.println(trouble + "cannnot be resolved.");
	}

	private void done(Trouble trouble) {
		System.out.println(trouble + "is resolved by " + this + ".");
	}

	protected abstract boolean resolve(Trouble trouble);

	public String toString() {
		return "[" + name + "]";
	}

}

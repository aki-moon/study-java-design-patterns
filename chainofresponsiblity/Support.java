package chainofresponsiblity;

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
		if(resolve(trouble)) {
			done(trouble);
		}else if(next != null) {
			next.support(trouble);
		} else {
			fail(trouble);
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

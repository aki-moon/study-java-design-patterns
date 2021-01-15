package decorator;

public abstract class Border extends Display{
	protected Display display;

	protected Border(Display display) {
		super();
		this.display = display;
	}

}

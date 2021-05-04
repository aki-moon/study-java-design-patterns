package dessignpattern.chainofresponsiblity;

public class Trouble {
	private int number;

	public Trouble(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public String toString() {
		return "[Trouble "  + number + "]";
	}
}

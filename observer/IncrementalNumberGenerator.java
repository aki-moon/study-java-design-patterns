package observer;

public class IncrementalNumberGenerator extends NumberGenerator {
	private int number;
	private int end;
	private int inc;

	public IncrementalNumberGenerator(int number, int end, int inc) {
		super();
		this.number = number;
		this.end = end;
		this.inc = inc;
	}

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void execute() {
		while (number < end) {
			notifyObservers();
			number += inc;
		}
	}

}

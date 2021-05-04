package dessignpattern.bridge;

import java.util.Random;

public class RandomCountDisplay extends CountDisplay{
	private Random random = new Random();

	public RandomCountDisplay(DisplayImpl displayImpl) {
		super(displayImpl);
	}

	public void randomDisplay(int times) {
		multiDisplay(random.nextInt(times));
	}

}

package strategy;

public class Hand {

	public static final int HANDVALUE_GUU = 0;
	public static final int HANDVALUE_CHOKI = 1;
	public static final int HANDVALUE_PAA = 2;

	public static final Hand[] hand = {
			new Hand(HANDVALUE_GUU),
			new Hand(HANDVALUE_CHOKI),
			new Hand(HANDVALUE_PAA),
	};

	private static final String[] name = {
			"グー", "チョキ", "パー",
	};

	private int handValue;

	private Hand(int handvalue) {
		this.handValue = handvalue;
	}

	public static Hand getHand(int handValue) {
		return hand[handValue];
	}

	public boolean isStrongerThan(Hand hand) {
		return fight(hand) == 1;
	}

	public boolean isWeakerThan(Hand hand) {
		return fight(hand) == -1;
	}

	private int fight(Hand hand) {
		if (this == hand) {
			return 0;
		} else if ((this.handValue + 1) % 3 == hand.handValue) {
			return 1;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return name[handValue];
	}

}
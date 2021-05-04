package dessignpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
	private Map<String, BigChar> pool = new HashMap<String, BigChar>();
	private static BigCharFactory singleton = new BigCharFactory();

	private BigCharFactory() {
	}

	public static BigCharFactory getInstance() {
		return singleton;
	}

	public synchronized BigChar getBigChar(char charName) {
		BigChar bigChar = (BigChar) pool.get("" + charName);
		if(bigChar == null) {
			bigChar = new BigChar(charName);
			pool.put("" + charName, bigChar);
		}
		return bigChar;
	}

}

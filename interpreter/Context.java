package interpreter;

import java.util.StringTokenizer;

public class Context {
	private StringTokenizer stringTokenizer;
	private String currentToken;

	public Context(String currentToken) {
		stringTokenizer = new StringTokenizer(currentToken);
		nextToken();
	}

	public void skipToken(String token) throws ParseException {
		if (!token.equals(currentToken)) {
			throw new ParseException("Warning: " + token + " is expected, but " + currentToken + " is found.");
		}
		nextToken();
	}

	public String currentToken() {
		return currentToken;
	}

	public int currentNumber() {
		int number = 0;
		number = Integer.parseInt(currentToken);
		return number;
	}

	public String nextToken() {
		if (stringTokenizer.hasMoreTokens()) {
			currentToken = stringTokenizer.nextToken();
		} else {
			currentToken = null;
		}
		return currentToken;
	}

}
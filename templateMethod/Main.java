package templateMethod;

public class Main {

	public static void main(String[] args) {
		AbstractDisplay charDisplay = new CharDisplay('H');
		AbstractDisplay stringDisplayEnglish = new StringDisplay("Hello, world.");
		AbstractDisplay stringDisplayJapanese = new StringDisplay("こんにちは");
		charDisplay.display();
		stringDisplayEnglish.display();
		stringDisplayJapanese.display();
	}

}

package dessignpattern.flyweight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
	private String fontdata;

	public BigChar(char charName) {
		super();
		try {
			BufferedReader bufferedReader = new BufferedReader(
					new FileReader("big" + charName + ".txt"));
			String line;
			StringBuffer buffer = new StringBuffer();
			while ((line = bufferedReader.readLine()) != null) {
				buffer.append(line);
				buffer.append("\n");
			}
			bufferedReader.close();
			this.fontdata = buffer.toString();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			this.fontdata = charName + "?";
		}
	}

	public void print() {
		System.out.println(fontdata);
	}

}

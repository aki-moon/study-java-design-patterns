package dessignpattern.adapter.fileproperties;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		FileIO fileIo = new FileProperties();
		try {
			String filePath = System.getProperty("user.dir") + "\\src\\adapter\\fileproperties";
			fileIo.readFromFile(filePath + "\\file.txt");
			fileIo.setValue("year", "2004");
			fileIo.setValue("month", "4");
			fileIo.setValue("day", "21");
			fileIo.writeToFile(filePath + "\\newFile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

package dessignpattern.bridge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDisplayImpl extends DisplayImpl {
	private String fileName;
	private BufferedReader bufferedReader;
	private static final int MAX_LIMIT_SIZE = 4096;

	public FileDisplayImpl(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void rawOpen() {
		try {
			bufferedReader = new BufferedReader(new FileReader(fileName));
			bufferedReader.mark(MAX_LIMIT_SIZE);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("*********" + fileName + "*********");
	}

	@Override
	public void rawPrint() {
		String line;
		try {
			bufferedReader.reset();
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println("> " + line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void rawClose() {
		System.out.println("*********");
		try {
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

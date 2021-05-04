package dessignpattern.adapter.fileproperties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {
	@Override
	public void readFromFile(String fileName) throws IOException {
		InputStream inStream = new FileInputStream(fileName);
		load(inStream);
	}

	@Override
	public void writeToFile(String fileName) throws IOException {
		OutputStream outputStream = new FileOutputStream(fileName);
		store(outputStream, "written by fileProperties.");
	}

	@Override
	public void setValue(String key, String value) {
		setProperty(key, value);
	}

}

package facade.pagemaker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataBase {
	private DataBase(){
	}
	public static Properties getProperties(String dbName) {
		String fileName = dbName + ".txt";
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}

}

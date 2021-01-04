package adapter.fileproperties;

import java.io.IOException;

public interface FileIO {

	void readFromFile(String string) throws IOException;

	void writeToFile(String string) throws IOException;

	void setValue(String string, String string2);

}

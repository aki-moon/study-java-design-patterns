package decorator;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display{

	private List<String> body = new ArrayList<String>();
	private int columns = 0;

	public void add(String message) {
		body.add(message);
		updateColumns(message);
	}

	@Override
	public int getColumuns() {
		return columns;
	}

	@Override
	public int getRows() {
		return body.size();
	}

	@Override
	public String getRowText(int row) {
		return body.get(row);
	}

	private void updateColumns(String message) {
		if(message.getBytes().length > columns) {
			columns = message.getBytes().length;
		}
		for (int i = 0; i < body.size(); i++) {
			int fills = columns - body.get(i).getBytes().length;
			if (fills > 0) {
				body.set(i, body.get(i) + spaces(fills));
			}
		}
	}

	private String spaces(int count) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < count; i++) {
			buffer.append(' ');
		}
		return buffer.toString();
	}
}

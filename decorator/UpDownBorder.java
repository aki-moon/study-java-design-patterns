package dessignpattern.decorator;

public class UpDownBorder extends Border{
	private char borderChar;

	public UpDownBorder(Display display, char borderChar) {
		super(display);
		this.borderChar = borderChar;
	}

	@Override
	public int getColumuns() {
		return display.getColumuns();
	}

	@Override
	public int getRows() {
		return 1 + display.getRows() + 1;
	}

	@Override
	public String getRowText(int row) {
		if (row == 0 || row == getRows() -1) {
			return makeLine(borderChar, getColumuns());
		} else {
			return display.getRowText(row-1);
		}
	}

	private String makeLine(char borderChar, int count) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < count; i++) {
			buffer.append(borderChar);
		}
		return buffer.toString();
	}

}

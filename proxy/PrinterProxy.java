package proxy;

public class PrinterProxy implements Printable {
	private String name;
	private Printer real;
	private String className;

	public PrinterProxy() {
	}

	public PrinterProxy(String name, String className) {
		this.name = name;
		this.className = className;
	}

	@Override
	public synchronized void setPrinterName(String name) {
		if (real != null) {
			real.setPrinterName(name);
		}
		this.name = name;
	}

	@Override
	public String getPrinterName() {
		return name;
	}

	@Override
	public void print(String string) {
		realize();
		real.print(string);
	}

	@SuppressWarnings("deprecation")
	private void realize() {
		if (real == null) {
			try {
				real = (Printer) Class.forName(className).newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				System.err.println("クラス" + className + " が見つかりません。");
			}
			real.setPrinterName(name);

		}
	}

}

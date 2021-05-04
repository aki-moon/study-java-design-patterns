package dessignpattern.abstractfactory.listfactory;

import dessignpattern.abstractfactory.factory.Item;
import dessignpattern.abstractfactory.factory.Tray;

public class ListTray extends Tray {

	public ListTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<li>\n");
		buffer.append(caption + "\n");
		buffer.append("<ul>\n");
		for (Item item : tray) {
			buffer.append(item.makeHTML());
		}
		buffer.append("<ul>\n");
		buffer.append("<ul>\n");
		return buffer.toString();
	}

}
